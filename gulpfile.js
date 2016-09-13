/*
 * build tools for dr.2 project
 */
var path = require("path"),
	gulp = require("gulp"),
	gulpShell = require("gulp-shell"),
	gulpUtil = require("gulp-util"),
	runSequence = require('run-sequence');
	
var buildType = gulpUtil.env.buildtype || "test";
console.log('buildType ='+buildType);

var mavenCmd = "/app/tools/maven/bin/mvn clean package spring-boot:repackage";
	
function mvnBuild() {
	return mavenCmd + " -P" + buildType;
}
	
var JAR_VERSION = "-0.0.1-SNAPSHOT"
	
var PROJECTS = {
	//交易服务
	"bargain": {
		path: "./projects/dr2/bargain",
		target: "target/bargain" + JAR_VERSION + ".jar"
	}
}

function generateBuildTasks() {
	var taskNames = Object.keys(PROJECTS);

	taskNames.forEach(function(taskName) {
		gulp.task(taskName, gulpShell.task([
			mvnBuild()
		], {
			cwd: path.join(process.cwd(), PROJECTS[taskName].path)
		}));
	});
	
	gulp.task("default", taskNames, function() {
		console.log("Build: " + buildType);
	});
}

generateBuildTasks();

// gulp.task('default', function () {
	// runSequence(['build']);
// });
