package com.liyou.business.trend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liyou.commons.pojo.AbstractCriteria;

public class HouseSalesRankCriteria extends AbstractCriteria {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseSalesRankCriteria() {
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

        public Criteria andValyearIsNull() {
            addCriterion("valyear is null");
            return (Criteria) this;
        }

        public Criteria andValyearIsNotNull() {
            addCriterion("valyear is not null");
            return (Criteria) this;
        }

        public Criteria andValyearEqualTo(String value) {
            addCriterion("valyear =", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearNotEqualTo(String value) {
            addCriterion("valyear <>", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearGreaterThan(String value) {
            addCriterion("valyear >", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearGreaterThanOrEqualTo(String value) {
            addCriterion("valyear >=", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearLessThan(String value) {
            addCriterion("valyear <", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearLessThanOrEqualTo(String value) {
            addCriterion("valyear <=", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearLike(String value) {
            addCriterion("valyear like", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearNotLike(String value) {
            addCriterion("valyear not like", value, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearIn(List<String> values) {
            addCriterion("valyear in", values, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearNotIn(List<String> values) {
            addCriterion("valyear not in", values, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearBetween(String value1, String value2) {
            addCriterion("valyear between", value1, value2, "valyear");
            return (Criteria) this;
        }

        public Criteria andValyearNotBetween(String value1, String value2) {
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

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
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

        public Criteria andCurSalescountIsNull() {
            addCriterion("cur_salescount is null");
            return (Criteria) this;
        }

        public Criteria andCurSalescountIsNotNull() {
            addCriterion("cur_salescount is not null");
            return (Criteria) this;
        }

        public Criteria andCurSalescountEqualTo(Integer value) {
            addCriterion("cur_salescount =", value, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andCurSalescountNotEqualTo(Integer value) {
            addCriterion("cur_salescount <>", value, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andCurSalescountGreaterThan(Integer value) {
            addCriterion("cur_salescount >", value, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andCurSalescountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_salescount >=", value, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andCurSalescountLessThan(Integer value) {
            addCriterion("cur_salescount <", value, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andCurSalescountLessThanOrEqualTo(Integer value) {
            addCriterion("cur_salescount <=", value, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andCurSalescountIn(List<Integer> values) {
            addCriterion("cur_salescount in", values, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andCurSalescountNotIn(List<Integer> values) {
            addCriterion("cur_salescount not in", values, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andCurSalescountBetween(Integer value1, Integer value2) {
            addCriterion("cur_salescount between", value1, value2, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andCurSalescountNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_salescount not between", value1, value2, "curSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountIsNull() {
            addCriterion("three_salescount is null");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountIsNotNull() {
            addCriterion("three_salescount is not null");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountEqualTo(Integer value) {
            addCriterion("three_salescount =", value, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountNotEqualTo(Integer value) {
            addCriterion("three_salescount <>", value, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountGreaterThan(Integer value) {
            addCriterion("three_salescount >", value, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountGreaterThanOrEqualTo(Integer value) {
            addCriterion("three_salescount >=", value, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountLessThan(Integer value) {
            addCriterion("three_salescount <", value, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountLessThanOrEqualTo(Integer value) {
            addCriterion("three_salescount <=", value, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountIn(List<Integer> values) {
            addCriterion("three_salescount in", values, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountNotIn(List<Integer> values) {
            addCriterion("three_salescount not in", values, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountBetween(Integer value1, Integer value2) {
            addCriterion("three_salescount between", value1, value2, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andThreeSalescountNotBetween(Integer value1, Integer value2) {
            addCriterion("three_salescount not between", value1, value2, "threeSalescount");
            return (Criteria) this;
        }

        public Criteria andCurrankIsNull() {
            addCriterion("currank is null");
            return (Criteria) this;
        }

        public Criteria andCurrankIsNotNull() {
            addCriterion("currank is not null");
            return (Criteria) this;
        }

        public Criteria andCurrankEqualTo(Integer value) {
            addCriterion("currank =", value, "currank");
            return (Criteria) this;
        }

        public Criteria andCurrankNotEqualTo(Integer value) {
            addCriterion("currank <>", value, "currank");
            return (Criteria) this;
        }

        public Criteria andCurrankGreaterThan(Integer value) {
            addCriterion("currank >", value, "currank");
            return (Criteria) this;
        }

        public Criteria andCurrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("currank >=", value, "currank");
            return (Criteria) this;
        }

        public Criteria andCurrankLessThan(Integer value) {
            addCriterion("currank <", value, "currank");
            return (Criteria) this;
        }

        public Criteria andCurrankLessThanOrEqualTo(Integer value) {
            addCriterion("currank <=", value, "currank");
            return (Criteria) this;
        }

        public Criteria andCurrankIn(List<Integer> values) {
            addCriterion("currank in", values, "currank");
            return (Criteria) this;
        }

        public Criteria andCurrankNotIn(List<Integer> values) {
            addCriterion("currank not in", values, "currank");
            return (Criteria) this;
        }

        public Criteria andCurrankBetween(Integer value1, Integer value2) {
            addCriterion("currank between", value1, value2, "currank");
            return (Criteria) this;
        }

        public Criteria andCurrankNotBetween(Integer value1, Integer value2) {
            addCriterion("currank not between", value1, value2, "currank");
            return (Criteria) this;
        }

        public Criteria andThreerankIsNull() {
            addCriterion("threerank is null");
            return (Criteria) this;
        }

        public Criteria andThreerankIsNotNull() {
            addCriterion("threerank is not null");
            return (Criteria) this;
        }

        public Criteria andThreerankEqualTo(Integer value) {
            addCriterion("threerank =", value, "threerank");
            return (Criteria) this;
        }

        public Criteria andThreerankNotEqualTo(Integer value) {
            addCriterion("threerank <>", value, "threerank");
            return (Criteria) this;
        }

        public Criteria andThreerankGreaterThan(Integer value) {
            addCriterion("threerank >", value, "threerank");
            return (Criteria) this;
        }

        public Criteria andThreerankGreaterThanOrEqualTo(Integer value) {
            addCriterion("threerank >=", value, "threerank");
            return (Criteria) this;
        }

        public Criteria andThreerankLessThan(Integer value) {
            addCriterion("threerank <", value, "threerank");
            return (Criteria) this;
        }

        public Criteria andThreerankLessThanOrEqualTo(Integer value) {
            addCriterion("threerank <=", value, "threerank");
            return (Criteria) this;
        }

        public Criteria andThreerankIn(List<Integer> values) {
            addCriterion("threerank in", values, "threerank");
            return (Criteria) this;
        }

        public Criteria andThreerankNotIn(List<Integer> values) {
            addCriterion("threerank not in", values, "threerank");
            return (Criteria) this;
        }

        public Criteria andThreerankBetween(Integer value1, Integer value2) {
            addCriterion("threerank between", value1, value2, "threerank");
            return (Criteria) this;
        }

        public Criteria andThreerankNotBetween(Integer value1, Integer value2) {
            addCriterion("threerank not between", value1, value2, "threerank");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentIsNull() {
            addCriterion("currank_percent is null");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentIsNotNull() {
            addCriterion("currank_percent is not null");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentEqualTo(Integer value) {
            addCriterion("currank_percent =", value, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentNotEqualTo(Integer value) {
            addCriterion("currank_percent <>", value, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentGreaterThan(Integer value) {
            addCriterion("currank_percent >", value, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("currank_percent >=", value, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentLessThan(Integer value) {
            addCriterion("currank_percent <", value, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentLessThanOrEqualTo(Integer value) {
            addCriterion("currank_percent <=", value, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentIn(List<Integer> values) {
            addCriterion("currank_percent in", values, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentNotIn(List<Integer> values) {
            addCriterion("currank_percent not in", values, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentBetween(Integer value1, Integer value2) {
            addCriterion("currank_percent between", value1, value2, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("currank_percent not between", value1, value2, "currankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentIsNull() {
            addCriterion("threerank_percent is null");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentIsNotNull() {
            addCriterion("threerank_percent is not null");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentEqualTo(Integer value) {
            addCriterion("threerank_percent =", value, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentNotEqualTo(Integer value) {
            addCriterion("threerank_percent <>", value, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentGreaterThan(Integer value) {
            addCriterion("threerank_percent >", value, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("threerank_percent >=", value, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentLessThan(Integer value) {
            addCriterion("threerank_percent <", value, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentLessThanOrEqualTo(Integer value) {
            addCriterion("threerank_percent <=", value, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentIn(List<Integer> values) {
            addCriterion("threerank_percent in", values, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentNotIn(List<Integer> values) {
            addCriterion("threerank_percent not in", values, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentBetween(Integer value1, Integer value2) {
            addCriterion("threerank_percent between", value1, value2, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("threerank_percent not between", value1, value2, "threerankPercent");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateIsNull() {
            addCriterion("currank_plate is null");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateIsNotNull() {
            addCriterion("currank_plate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateEqualTo(Integer value) {
            addCriterion("currank_plate =", value, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateNotEqualTo(Integer value) {
            addCriterion("currank_plate <>", value, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateGreaterThan(Integer value) {
            addCriterion("currank_plate >", value, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateGreaterThanOrEqualTo(Integer value) {
            addCriterion("currank_plate >=", value, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateLessThan(Integer value) {
            addCriterion("currank_plate <", value, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateLessThanOrEqualTo(Integer value) {
            addCriterion("currank_plate <=", value, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateIn(List<Integer> values) {
            addCriterion("currank_plate in", values, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateNotIn(List<Integer> values) {
            addCriterion("currank_plate not in", values, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateBetween(Integer value1, Integer value2) {
            addCriterion("currank_plate between", value1, value2, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPlateNotBetween(Integer value1, Integer value2) {
            addCriterion("currank_plate not between", value1, value2, "currankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateIsNull() {
            addCriterion("threerank_plate is null");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateIsNotNull() {
            addCriterion("threerank_plate is not null");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateEqualTo(Integer value) {
            addCriterion("threerank_plate =", value, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateNotEqualTo(Integer value) {
            addCriterion("threerank_plate <>", value, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateGreaterThan(Integer value) {
            addCriterion("threerank_plate >", value, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateGreaterThanOrEqualTo(Integer value) {
            addCriterion("threerank_plate >=", value, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateLessThan(Integer value) {
            addCriterion("threerank_plate <", value, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateLessThanOrEqualTo(Integer value) {
            addCriterion("threerank_plate <=", value, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateIn(List<Integer> values) {
            addCriterion("threerank_plate in", values, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateNotIn(List<Integer> values) {
            addCriterion("threerank_plate not in", values, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateBetween(Integer value1, Integer value2) {
            addCriterion("threerank_plate between", value1, value2, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPlateNotBetween(Integer value1, Integer value2) {
            addCriterion("threerank_plate not between", value1, value2, "threerankPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateIsNull() {
            addCriterion("currank_percent_plate is null");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateIsNotNull() {
            addCriterion("currank_percent_plate is not null");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateEqualTo(Integer value) {
            addCriterion("currank_percent_plate =", value, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateNotEqualTo(Integer value) {
            addCriterion("currank_percent_plate <>", value, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateGreaterThan(Integer value) {
            addCriterion("currank_percent_plate >", value, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateGreaterThanOrEqualTo(Integer value) {
            addCriterion("currank_percent_plate >=", value, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateLessThan(Integer value) {
            addCriterion("currank_percent_plate <", value, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateLessThanOrEqualTo(Integer value) {
            addCriterion("currank_percent_plate <=", value, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateIn(List<Integer> values) {
            addCriterion("currank_percent_plate in", values, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateNotIn(List<Integer> values) {
            addCriterion("currank_percent_plate not in", values, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateBetween(Integer value1, Integer value2) {
            addCriterion("currank_percent_plate between", value1, value2, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andCurrankPercentPlateNotBetween(Integer value1, Integer value2) {
            addCriterion("currank_percent_plate not between", value1, value2, "currankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateIsNull() {
            addCriterion("threerank_percent_plate is null");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateIsNotNull() {
            addCriterion("threerank_percent_plate is not null");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateEqualTo(Integer value) {
            addCriterion("threerank_percent_plate =", value, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateNotEqualTo(Integer value) {
            addCriterion("threerank_percent_plate <>", value, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateGreaterThan(Integer value) {
            addCriterion("threerank_percent_plate >", value, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateGreaterThanOrEqualTo(Integer value) {
            addCriterion("threerank_percent_plate >=", value, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateLessThan(Integer value) {
            addCriterion("threerank_percent_plate <", value, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateLessThanOrEqualTo(Integer value) {
            addCriterion("threerank_percent_plate <=", value, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateIn(List<Integer> values) {
            addCriterion("threerank_percent_plate in", values, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateNotIn(List<Integer> values) {
            addCriterion("threerank_percent_plate not in", values, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateBetween(Integer value1, Integer value2) {
            addCriterion("threerank_percent_plate between", value1, value2, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andThreerankPercentPlateNotBetween(Integer value1, Integer value2) {
            addCriterion("threerank_percent_plate not between", value1, value2, "threerankPercentPlate");
            return (Criteria) this;
        }

        public Criteria andSameageRankIsNull() {
            addCriterion("sameage_rank is null");
            return (Criteria) this;
        }

        public Criteria andSameageRankIsNotNull() {
            addCriterion("sameage_rank is not null");
            return (Criteria) this;
        }

        public Criteria andSameageRankEqualTo(Integer value) {
            addCriterion("sameage_rank =", value, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageRankNotEqualTo(Integer value) {
            addCriterion("sameage_rank <>", value, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageRankGreaterThan(Integer value) {
            addCriterion("sameage_rank >", value, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("sameage_rank >=", value, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageRankLessThan(Integer value) {
            addCriterion("sameage_rank <", value, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageRankLessThanOrEqualTo(Integer value) {
            addCriterion("sameage_rank <=", value, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageRankIn(List<Integer> values) {
            addCriterion("sameage_rank in", values, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageRankNotIn(List<Integer> values) {
            addCriterion("sameage_rank not in", values, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageRankBetween(Integer value1, Integer value2) {
            addCriterion("sameage_rank between", value1, value2, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageRankNotBetween(Integer value1, Integer value2) {
            addCriterion("sameage_rank not between", value1, value2, "sameageRank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankIsNull() {
            addCriterion("sameage_threerank is null");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankIsNotNull() {
            addCriterion("sameage_threerank is not null");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankEqualTo(Integer value) {
            addCriterion("sameage_threerank =", value, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankNotEqualTo(Integer value) {
            addCriterion("sameage_threerank <>", value, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankGreaterThan(Integer value) {
            addCriterion("sameage_threerank >", value, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankGreaterThanOrEqualTo(Integer value) {
            addCriterion("sameage_threerank >=", value, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankLessThan(Integer value) {
            addCriterion("sameage_threerank <", value, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankLessThanOrEqualTo(Integer value) {
            addCriterion("sameage_threerank <=", value, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankIn(List<Integer> values) {
            addCriterion("sameage_threerank in", values, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankNotIn(List<Integer> values) {
            addCriterion("sameage_threerank not in", values, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankBetween(Integer value1, Integer value2) {
            addCriterion("sameage_threerank between", value1, value2, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankNotBetween(Integer value1, Integer value2) {
            addCriterion("sameage_threerank not between", value1, value2, "sameageThreerank");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentIsNull() {
            addCriterion("sameage_currank_percent is null");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentIsNotNull() {
            addCriterion("sameage_currank_percent is not null");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentEqualTo(Integer value) {
            addCriterion("sameage_currank_percent =", value, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentNotEqualTo(Integer value) {
            addCriterion("sameage_currank_percent <>", value, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentGreaterThan(Integer value) {
            addCriterion("sameage_currank_percent >", value, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("sameage_currank_percent >=", value, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentLessThan(Integer value) {
            addCriterion("sameage_currank_percent <", value, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentLessThanOrEqualTo(Integer value) {
            addCriterion("sameage_currank_percent <=", value, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentIn(List<Integer> values) {
            addCriterion("sameage_currank_percent in", values, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentNotIn(List<Integer> values) {
            addCriterion("sameage_currank_percent not in", values, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentBetween(Integer value1, Integer value2) {
            addCriterion("sameage_currank_percent between", value1, value2, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageCurrankPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("sameage_currank_percent not between", value1, value2, "sameageCurrankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentIsNull() {
            addCriterion("sameage_threerank_percent is null");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentIsNotNull() {
            addCriterion("sameage_threerank_percent is not null");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentEqualTo(Integer value) {
            addCriterion("sameage_threerank_percent =", value, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentNotEqualTo(Integer value) {
            addCriterion("sameage_threerank_percent <>", value, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentGreaterThan(Integer value) {
            addCriterion("sameage_threerank_percent >", value, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("sameage_threerank_percent >=", value, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentLessThan(Integer value) {
            addCriterion("sameage_threerank_percent <", value, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentLessThanOrEqualTo(Integer value) {
            addCriterion("sameage_threerank_percent <=", value, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentIn(List<Integer> values) {
            addCriterion("sameage_threerank_percent in", values, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentNotIn(List<Integer> values) {
            addCriterion("sameage_threerank_percent not in", values, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentBetween(Integer value1, Integer value2) {
            addCriterion("sameage_threerank_percent between", value1, value2, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andSameageThreerankPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("sameage_threerank_percent not between", value1, value2, "sameageThreerankPercent");
            return (Criteria) this;
        }

        public Criteria andCalctimeIsNull() {
            addCriterion("calctime is null");
            return (Criteria) this;
        }

        public Criteria andCalctimeIsNotNull() {
            addCriterion("calctime is not null");
            return (Criteria) this;
        }

        public Criteria andCalctimeEqualTo(Date value) {
            addCriterion("calctime =", value, "calctime");
            return (Criteria) this;
        }

        public Criteria andCalctimeNotEqualTo(Date value) {
            addCriterion("calctime <>", value, "calctime");
            return (Criteria) this;
        }

        public Criteria andCalctimeGreaterThan(Date value) {
            addCriterion("calctime >", value, "calctime");
            return (Criteria) this;
        }

        public Criteria andCalctimeGreaterThanOrEqualTo(Date value) {
            addCriterion("calctime >=", value, "calctime");
            return (Criteria) this;
        }

        public Criteria andCalctimeLessThan(Date value) {
            addCriterion("calctime <", value, "calctime");
            return (Criteria) this;
        }

        public Criteria andCalctimeLessThanOrEqualTo(Date value) {
            addCriterion("calctime <=", value, "calctime");
            return (Criteria) this;
        }

        public Criteria andCalctimeIn(List<Date> values) {
            addCriterion("calctime in", values, "calctime");
            return (Criteria) this;
        }

        public Criteria andCalctimeNotIn(List<Date> values) {
            addCriterion("calctime not in", values, "calctime");
            return (Criteria) this;
        }

        public Criteria andCalctimeBetween(Date value1, Date value2) {
            addCriterion("calctime between", value1, value2, "calctime");
            return (Criteria) this;
        }

        public Criteria andCalctimeNotBetween(Date value1, Date value2) {
            addCriterion("calctime not between", value1, value2, "calctime");
            return (Criteria) this;
        }

        public Criteria andValyearLikeInsensitive(String value) {
            addCriterion("upper(valyear) like", value.toUpperCase(), "valyear");
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