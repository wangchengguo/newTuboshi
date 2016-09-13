package com.liyou.business.trend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liyou.commons.pojo.AbstractCriteria;

public class PlateCalcHouseRankCriteria extends AbstractCriteria{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlateCalcHouseRankCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPlateIdIsNull() {
            addCriterion("plate_id is null");
            return (Criteria) this;
        }

        public Criteria andPlateIdIsNotNull() {
            addCriterion("plate_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlateIdEqualTo(Integer value) {
            addCriterion("plate_id =", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotEqualTo(Integer value) {
            addCriterion("plate_id <>", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThan(Integer value) {
            addCriterion("plate_id >", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plate_id >=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThan(Integer value) {
            addCriterion("plate_id <", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThanOrEqualTo(Integer value) {
            addCriterion("plate_id <=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdIn(List<Integer> values) {
            addCriterion("plate_id in", values, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotIn(List<Integer> values) {
            addCriterion("plate_id not in", values, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdBetween(Integer value1, Integer value2) {
            addCriterion("plate_id between", value1, value2, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plate_id not between", value1, value2, "plateId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNull() {
            addCriterion("months is null");
            return (Criteria) this;
        }

        public Criteria andMonthsIsNotNull() {
            addCriterion("months is not null");
            return (Criteria) this;
        }

        public Criteria andMonthsEqualTo(Short value) {
            addCriterion("months =", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotEqualTo(Short value) {
            addCriterion("months <>", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThan(Short value) {
            addCriterion("months >", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsGreaterThanOrEqualTo(Short value) {
            addCriterion("months >=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThan(Short value) {
            addCriterion("months <", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsLessThanOrEqualTo(Short value) {
            addCriterion("months <=", value, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsIn(List<Short> values) {
            addCriterion("months in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotIn(List<Short> values) {
            addCriterion("months not in", values, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsBetween(Short value1, Short value2) {
            addCriterion("months between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andMonthsNotBetween(Short value1, Short value2) {
            addCriterion("months not between", value1, value2, "months");
            return (Criteria) this;
        }

        public Criteria andValyearIsNull() {
            addCriterion("valyear is null");
            return (Criteria) this;
        }

        public Criteria andValyearIsNotNull() {
            addCriterion("valyear is not null");
            return (Criteria) this;
        }

        public Criteria andValyearEqualTo(Short value) {
            addCriterion("valyear =", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearNotEqualTo(Short value) {
            addCriterion("valyear <>", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearGreaterThan(Short value) {
            addCriterion("valyear >", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearGreaterThanOrEqualTo(Short value) {
            addCriterion("valyear >=", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearLessThan(Short value) {
            addCriterion("valyear <", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearLessThanOrEqualTo(Short value) {
            addCriterion("valyear <=", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearIn(List<Short> values) {
            addCriterion("valyear in", values, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearNotIn(List<Short> values) {
            addCriterion("valyear not in", values, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearBetween(Short value1, Short value2) {
            addCriterion("valyear between", value1, value2, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearNotBetween(Short value1, Short value2) {
            addCriterion("valyear not between", value1, value2, "valyear");
            return (Criteria) this;
        }

        public Criteria andValmonthIsNull() {
            addCriterion("valmonth is null");
            return (Criteria) this;
        }

        public Criteria andValmonthIsNotNull() {
            addCriterion("valmonth is not null");
            return (Criteria) this;
        }

        public Criteria andValmonthEqualTo(Short value) {
            addCriterion("valmonth =", value, "valmonth");
            return (Criteria) this;
        }

        public Criteria andValmonthNotEqualTo(Short value) {
            addCriterion("valmonth <>", value, "valmonth");
            return (Criteria) this;
        }

        public Criteria andValmonthGreaterThan(Short value) {
            addCriterion("valmonth >", value, "valmonth");
            return (Criteria) this;
        }

        public Criteria andValmonthGreaterThanOrEqualTo(Short value) {
            addCriterion("valmonth >=", value, "valmonth");
            return (Criteria) this;
        }

        public Criteria andValmonthLessThan(Short value) {
            addCriterion("valmonth <", value, "valmonth");
            return (Criteria) this;
        }

        public Criteria andValmonthLessThanOrEqualTo(Short value) {
            addCriterion("valmonth <=", value, "valmonth");
            return (Criteria) this;
        }

        public Criteria andValmonthIn(List<Short> values) {
            addCriterion("valmonth in", values, "valmonth");
            return (Criteria) this;
        }

        public Criteria andValmonthNotIn(List<Short> values) {
            addCriterion("valmonth not in", values, "valmonth");
            return (Criteria) this;
        }

        public Criteria andValmonthBetween(Short value1, Short value2) {
            addCriterion("valmonth between", value1, value2, "valmonth");
            return (Criteria) this;
        }

        public Criteria andValmonthNotBetween(Short value1, Short value2) {
            addCriterion("valmonth not between", value1, value2, "valmonth");
            return (Criteria) this;
        }

        public Criteria andAvpriceIsNull() {
            addCriterion("avprice is null");
            return (Criteria) this;
        }

        public Criteria andAvpriceIsNotNull() {
            addCriterion("avprice is not null");
            return (Criteria) this;
        }

        public Criteria andAvpriceEqualTo(Integer value) {
            addCriterion("avprice =", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceNotEqualTo(Integer value) {
            addCriterion("avprice <>", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceGreaterThan(Integer value) {
            addCriterion("avprice >", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("avprice >=", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceLessThan(Integer value) {
            addCriterion("avprice <", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceLessThanOrEqualTo(Integer value) {
            addCriterion("avprice <=", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceIn(List<Integer> values) {
            addCriterion("avprice in", values, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceNotIn(List<Integer> values) {
            addCriterion("avprice not in", values, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceBetween(Integer value1, Integer value2) {
            addCriterion("avprice between", value1, value2, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("avprice not between", value1, value2, "avprice");
            return (Criteria) this;
        }

        public Criteria andRiseIsNull() {
            addCriterion("rise is null");
            return (Criteria) this;
        }

        public Criteria andRiseIsNotNull() {
            addCriterion("rise is not null");
            return (Criteria) this;
        }

        public Criteria andRiseEqualTo(Integer value) {
            addCriterion("rise =", value, "rise");
            return (Criteria) this;
        }

        public Criteria andRiseNotEqualTo(Integer value) {
            addCriterion("rise <>", value, "rise");
            return (Criteria) this;
        }

        public Criteria andRiseGreaterThan(Integer value) {
            addCriterion("rise >", value, "rise");
            return (Criteria) this;
        }

        public Criteria andRiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("rise >=", value, "rise");
            return (Criteria) this;
        }

        public Criteria andRiseLessThan(Integer value) {
            addCriterion("rise <", value, "rise");
            return (Criteria) this;
        }

        public Criteria andRiseLessThanOrEqualTo(Integer value) {
            addCriterion("rise <=", value, "rise");
            return (Criteria) this;
        }

        public Criteria andRiseIn(List<Integer> values) {
            addCriterion("rise in", values, "rise");
            return (Criteria) this;
        }

        public Criteria andRiseNotIn(List<Integer> values) {
            addCriterion("rise not in", values, "rise");
            return (Criteria) this;
        }

        public Criteria andRiseBetween(Integer value1, Integer value2) {
            addCriterion("rise between", value1, value2, "rise");
            return (Criteria) this;
        }

        public Criteria andRiseNotBetween(Integer value1, Integer value2) {
            addCriterion("rise not between", value1, value2, "rise");
            return (Criteria) this;
        }

        public Criteria andCalcTimeIsNull() {
            addCriterion("calc_time is null");
            return (Criteria) this;
        }

        public Criteria andCalcTimeIsNotNull() {
            addCriterion("calc_time is not null");
            return (Criteria) this;
        }

        public Criteria andCalcTimeEqualTo(Date value) {
            addCriterion("calc_time =", value, "calcTime");
            return (Criteria) this;
        }

        public Criteria andCalcTimeNotEqualTo(Date value) {
            addCriterion("calc_time <>", value, "calcTime");
            return (Criteria) this;
        }

        public Criteria andCalcTimeGreaterThan(Date value) {
            addCriterion("calc_time >", value, "calcTime");
            return (Criteria) this;
        }

        public Criteria andCalcTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("calc_time >=", value, "calcTime");
            return (Criteria) this;
        }

        public Criteria andCalcTimeLessThan(Date value) {
            addCriterion("calc_time <", value, "calcTime");
            return (Criteria) this;
        }

        public Criteria andCalcTimeLessThanOrEqualTo(Date value) {
            addCriterion("calc_time <=", value, "calcTime");
            return (Criteria) this;
        }

        public Criteria andCalcTimeIn(List<Date> values) {
            addCriterion("calc_time in", values, "calcTime");
            return (Criteria) this;
        }

        public Criteria andCalcTimeNotIn(List<Date> values) {
            addCriterion("calc_time not in", values, "calcTime");
            return (Criteria) this;
        }

        public Criteria andCalcTimeBetween(Date value1, Date value2) {
            addCriterion("calc_time between", value1, value2, "calcTime");
            return (Criteria) this;
        }

        public Criteria andCalcTimeNotBetween(Date value1, Date value2) {
            addCriterion("calc_time not between", value1, value2, "calcTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}