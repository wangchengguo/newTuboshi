package com.liyou.business.trend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liyou.commons.pojo.AbstractCriteria;

public class HouseInfoCriteria extends AbstractCriteria {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseInfoCriteria() {
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

        public Criteria andHouseNameIsNull() {
            addCriterion("house_name is null");
            return (Criteria) this;
        }

        public Criteria andHouseNameIsNotNull() {
            addCriterion("house_name is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNameEqualTo(String value) {
            addCriterion("house_name =", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotEqualTo(String value) {
            addCriterion("house_name <>", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThan(String value) {
            addCriterion("house_name >", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("house_name >=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThan(String value) {
            addCriterion("house_name <", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLessThanOrEqualTo(String value) {
            addCriterion("house_name <=", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameLike(String value) {
            addCriterion("house_name like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotLike(String value) {
            addCriterion("house_name not like", value, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameIn(List<String> values) {
            addCriterion("house_name in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotIn(List<String> values) {
            addCriterion("house_name not in", values, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameBetween(String value1, String value2) {
            addCriterion("house_name between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andHouseNameNotBetween(String value1, String value2) {
            addCriterion("house_name not between", value1, value2, "houseName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andCertiNameIsNull() {
            addCriterion("certi_name is null");
            return (Criteria) this;
        }

        public Criteria andCertiNameIsNotNull() {
            addCriterion("certi_name is not null");
            return (Criteria) this;
        }

        public Criteria andCertiNameEqualTo(String value) {
            addCriterion("certi_name =", value, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameNotEqualTo(String value) {
            addCriterion("certi_name <>", value, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameGreaterThan(String value) {
            addCriterion("certi_name >", value, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameGreaterThanOrEqualTo(String value) {
            addCriterion("certi_name >=", value, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameLessThan(String value) {
            addCriterion("certi_name <", value, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameLessThanOrEqualTo(String value) {
            addCriterion("certi_name <=", value, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameLike(String value) {
            addCriterion("certi_name like", value, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameNotLike(String value) {
            addCriterion("certi_name not like", value, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameIn(List<String> values) {
            addCriterion("certi_name in", values, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameNotIn(List<String> values) {
            addCriterion("certi_name not in", values, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameBetween(String value1, String value2) {
            addCriterion("certi_name between", value1, value2, "certiName");
            return (Criteria) this;
        }

        public Criteria andCertiNameNotBetween(String value1, String value2) {
            addCriterion("certi_name not between", value1, value2, "certiName");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNull() {
            addCriterion("house_address is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNotNull() {
            addCriterion("house_address is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressEqualTo(String value) {
            addCriterion("house_address =", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotEqualTo(String value) {
            addCriterion("house_address <>", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThan(String value) {
            addCriterion("house_address >", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("house_address >=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThan(String value) {
            addCriterion("house_address <", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("house_address <=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLike(String value) {
            addCriterion("house_address like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotLike(String value) {
            addCriterion("house_address not like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIn(List<String> values) {
            addCriterion("house_address in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotIn(List<String> values) {
            addCriterion("house_address not in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressBetween(String value1, String value2) {
            addCriterion("house_address between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotBetween(String value1, String value2) {
            addCriterion("house_address not between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressIsNull() {
            addCriterion("ifmulti_address is null");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressIsNotNull() {
            addCriterion("ifmulti_address is not null");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressEqualTo(Boolean value) {
            addCriterion("ifmulti_address =", value, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressNotEqualTo(Boolean value) {
            addCriterion("ifmulti_address <>", value, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressGreaterThan(Boolean value) {
            addCriterion("ifmulti_address >", value, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifmulti_address >=", value, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressLessThan(Boolean value) {
            addCriterion("ifmulti_address <", value, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressLessThanOrEqualTo(Boolean value) {
            addCriterion("ifmulti_address <=", value, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressIn(List<Boolean> values) {
            addCriterion("ifmulti_address in", values, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressNotIn(List<Boolean> values) {
            addCriterion("ifmulti_address not in", values, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressBetween(Boolean value1, Boolean value2) {
            addCriterion("ifmulti_address between", value1, value2, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andIfmultiAddressNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifmulti_address not between", value1, value2, "ifmultiAddress");
            return (Criteria) this;
        }

        public Criteria andHousePicIsNull() {
            addCriterion("house_pic is null");
            return (Criteria) this;
        }

        public Criteria andHousePicIsNotNull() {
            addCriterion("house_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHousePicEqualTo(String value) {
            addCriterion("house_pic =", value, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicNotEqualTo(String value) {
            addCriterion("house_pic <>", value, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicGreaterThan(String value) {
            addCriterion("house_pic >", value, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicGreaterThanOrEqualTo(String value) {
            addCriterion("house_pic >=", value, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicLessThan(String value) {
            addCriterion("house_pic <", value, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicLessThanOrEqualTo(String value) {
            addCriterion("house_pic <=", value, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicLike(String value) {
            addCriterion("house_pic like", value, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicNotLike(String value) {
            addCriterion("house_pic not like", value, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicIn(List<String> values) {
            addCriterion("house_pic in", values, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicNotIn(List<String> values) {
            addCriterion("house_pic not in", values, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicBetween(String value1, String value2) {
            addCriterion("house_pic between", value1, value2, "housePic");
            return (Criteria) this;
        }

        public Criteria andHousePicNotBetween(String value1, String value2) {
            addCriterion("house_pic not between", value1, value2, "housePic");
            return (Criteria) this;
        }

        public Criteria andHouseDesIsNull() {
            addCriterion("house_des is null");
            return (Criteria) this;
        }

        public Criteria andHouseDesIsNotNull() {
            addCriterion("house_des is not null");
            return (Criteria) this;
        }

        public Criteria andHouseDesEqualTo(String value) {
            addCriterion("house_des =", value, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesNotEqualTo(String value) {
            addCriterion("house_des <>", value, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesGreaterThan(String value) {
            addCriterion("house_des >", value, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesGreaterThanOrEqualTo(String value) {
            addCriterion("house_des >=", value, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesLessThan(String value) {
            addCriterion("house_des <", value, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesLessThanOrEqualTo(String value) {
            addCriterion("house_des <=", value, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesLike(String value) {
            addCriterion("house_des like", value, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesNotLike(String value) {
            addCriterion("house_des not like", value, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesIn(List<String> values) {
            addCriterion("house_des in", values, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesNotIn(List<String> values) {
            addCriterion("house_des not in", values, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesBetween(String value1, String value2) {
            addCriterion("house_des between", value1, value2, "houseDes");
            return (Criteria) this;
        }

        public Criteria andHouseDesNotBetween(String value1, String value2) {
            addCriterion("house_des not between", value1, value2, "houseDes");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelIsNull() {
            addCriterion("sales_agent_tel is null");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelIsNotNull() {
            addCriterion("sales_agent_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelEqualTo(String value) {
            addCriterion("sales_agent_tel =", value, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelNotEqualTo(String value) {
            addCriterion("sales_agent_tel <>", value, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelGreaterThan(String value) {
            addCriterion("sales_agent_tel >", value, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelGreaterThanOrEqualTo(String value) {
            addCriterion("sales_agent_tel >=", value, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelLessThan(String value) {
            addCriterion("sales_agent_tel <", value, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelLessThanOrEqualTo(String value) {
            addCriterion("sales_agent_tel <=", value, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelLike(String value) {
            addCriterion("sales_agent_tel like", value, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelNotLike(String value) {
            addCriterion("sales_agent_tel not like", value, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelIn(List<String> values) {
            addCriterion("sales_agent_tel in", values, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelNotIn(List<String> values) {
            addCriterion("sales_agent_tel not in", values, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelBetween(String value1, String value2) {
            addCriterion("sales_agent_tel between", value1, value2, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelNotBetween(String value1, String value2) {
            addCriterion("sales_agent_tel not between", value1, value2, "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andOpenpriceIsNull() {
            addCriterion("openprice is null");
            return (Criteria) this;
        }

        public Criteria andOpenpriceIsNotNull() {
            addCriterion("openprice is not null");
            return (Criteria) this;
        }

        public Criteria andOpenpriceEqualTo(Long value) {
            addCriterion("openprice =", value, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpenpriceNotEqualTo(Long value) {
            addCriterion("openprice <>", value, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpenpriceGreaterThan(Long value) {
            addCriterion("openprice >", value, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpenpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("openprice >=", value, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpenpriceLessThan(Long value) {
            addCriterion("openprice <", value, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpenpriceLessThanOrEqualTo(Long value) {
            addCriterion("openprice <=", value, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpenpriceIn(List<Long> values) {
            addCriterion("openprice in", values, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpenpriceNotIn(List<Long> values) {
            addCriterion("openprice not in", values, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpenpriceBetween(Long value1, Long value2) {
            addCriterion("openprice between", value1, value2, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpenpriceNotBetween(Long value1, Long value2) {
            addCriterion("openprice not between", value1, value2, "openprice");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNull() {
            addCriterion("opentime is null");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNotNull() {
            addCriterion("opentime is not null");
            return (Criteria) this;
        }

        public Criteria andOpentimeEqualTo(Date value) {
            addCriterion("opentime =", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotEqualTo(Date value) {
            addCriterion("opentime <>", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThan(Date value) {
            addCriterion("opentime >", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opentime >=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThan(Date value) {
            addCriterion("opentime <", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("opentime <=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeIn(List<Date> values) {
            addCriterion("opentime in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotIn(List<Date> values) {
            addCriterion("opentime not in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeBetween(Date value1, Date value2) {
            addCriterion("opentime between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("opentime not between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andHouseActiveIsNull() {
            addCriterion("house_active is null");
            return (Criteria) this;
        }

        public Criteria andHouseActiveIsNotNull() {
            addCriterion("house_active is not null");
            return (Criteria) this;
        }

        public Criteria andHouseActiveEqualTo(Integer value) {
            addCriterion("house_active =", value, "houseActive");
            return (Criteria) this;
        }

        public Criteria andHouseActiveNotEqualTo(Integer value) {
            addCriterion("house_active <>", value, "houseActive");
            return (Criteria) this;
        }

        public Criteria andHouseActiveGreaterThan(Integer value) {
            addCriterion("house_active >", value, "houseActive");
            return (Criteria) this;
        }

        public Criteria andHouseActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_active >=", value, "houseActive");
            return (Criteria) this;
        }

        public Criteria andHouseActiveLessThan(Integer value) {
            addCriterion("house_active <", value, "houseActive");
            return (Criteria) this;
        }

        public Criteria andHouseActiveLessThanOrEqualTo(Integer value) {
            addCriterion("house_active <=", value, "houseActive");
            return (Criteria) this;
        }

        public Criteria andHouseActiveIn(List<Integer> values) {
            addCriterion("house_active in", values, "houseActive");
            return (Criteria) this;
        }

        public Criteria andHouseActiveNotIn(List<Integer> values) {
            addCriterion("house_active not in", values, "houseActive");
            return (Criteria) this;
        }

        public Criteria andHouseActiveBetween(Integer value1, Integer value2) {
            addCriterion("house_active between", value1, value2, "houseActive");
            return (Criteria) this;
        }

        public Criteria andHouseActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("house_active not between", value1, value2, "houseActive");
            return (Criteria) this;
        }

        public Criteria andPeriodIdIsNull() {
            addCriterion("period_id is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIdIsNotNull() {
            addCriterion("period_id is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodIdEqualTo(Integer value) {
            addCriterion("period_id =", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdNotEqualTo(Integer value) {
            addCriterion("period_id <>", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdGreaterThan(Integer value) {
            addCriterion("period_id >", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_id >=", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdLessThan(Integer value) {
            addCriterion("period_id <", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdLessThanOrEqualTo(Integer value) {
            addCriterion("period_id <=", value, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdIn(List<Integer> values) {
            addCriterion("period_id in", values, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdNotIn(List<Integer> values) {
            addCriterion("period_id not in", values, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdBetween(Integer value1, Integer value2) {
            addCriterion("period_id between", value1, value2, "periodId");
            return (Criteria) this;
        }

        public Criteria andPeriodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("period_id not between", value1, value2, "periodId");
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

        public Criteria andLoopIdIsNull() {
            addCriterion("loop_id is null");
            return (Criteria) this;
        }

        public Criteria andLoopIdIsNotNull() {
            addCriterion("loop_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoopIdEqualTo(Integer value) {
            addCriterion("loop_id =", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdNotEqualTo(Integer value) {
            addCriterion("loop_id <>", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdGreaterThan(Integer value) {
            addCriterion("loop_id >", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("loop_id >=", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdLessThan(Integer value) {
            addCriterion("loop_id <", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdLessThanOrEqualTo(Integer value) {
            addCriterion("loop_id <=", value, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdIn(List<Integer> values) {
            addCriterion("loop_id in", values, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdNotIn(List<Integer> values) {
            addCriterion("loop_id not in", values, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdBetween(Integer value1, Integer value2) {
            addCriterion("loop_id between", value1, value2, "loopId");
            return (Criteria) this;
        }

        public Criteria andLoopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("loop_id not between", value1, value2, "loopId");
            return (Criteria) this;
        }

        public Criteria andJgTimeIsNull() {
            addCriterion("jg_time is null");
            return (Criteria) this;
        }

        public Criteria andJgTimeIsNotNull() {
            addCriterion("jg_time is not null");
            return (Criteria) this;
        }

        public Criteria andJgTimeEqualTo(Date value) {
            addCriterion("jg_time =", value, "jgTime");
            return (Criteria) this;
        }

        public Criteria andJgTimeNotEqualTo(Date value) {
            addCriterion("jg_time <>", value, "jgTime");
            return (Criteria) this;
        }

        public Criteria andJgTimeGreaterThan(Date value) {
            addCriterion("jg_time >", value, "jgTime");
            return (Criteria) this;
        }

        public Criteria andJgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jg_time >=", value, "jgTime");
            return (Criteria) this;
        }

        public Criteria andJgTimeLessThan(Date value) {
            addCriterion("jg_time <", value, "jgTime");
            return (Criteria) this;
        }

        public Criteria andJgTimeLessThanOrEqualTo(Date value) {
            addCriterion("jg_time <=", value, "jgTime");
            return (Criteria) this;
        }

        public Criteria andJgTimeIn(List<Date> values) {
            addCriterion("jg_time in", values, "jgTime");
            return (Criteria) this;
        }

        public Criteria andJgTimeNotIn(List<Date> values) {
            addCriterion("jg_time not in", values, "jgTime");
            return (Criteria) this;
        }

        public Criteria andJgTimeBetween(Date value1, Date value2) {
            addCriterion("jg_time between", value1, value2, "jgTime");
            return (Criteria) this;
        }

        public Criteria andJgTimeNotBetween(Date value1, Date value2) {
            addCriterion("jg_time not between", value1, value2, "jgTime");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNull() {
            addCriterion("developer_id is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNotNull() {
            addCriterion("developer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdEqualTo(Integer value) {
            addCriterion("developer_id =", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotEqualTo(Integer value) {
            addCriterion("developer_id <>", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThan(Integer value) {
            addCriterion("developer_id >", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("developer_id >=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThan(Integer value) {
            addCriterion("developer_id <", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThanOrEqualTo(Integer value) {
            addCriterion("developer_id <=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIn(List<Integer> values) {
            addCriterion("developer_id in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotIn(List<Integer> values) {
            addCriterion("developer_id not in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdBetween(Integer value1, Integer value2) {
            addCriterion("developer_id between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("developer_id not between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andLandAreaIsNull() {
            addCriterion("land_area is null");
            return (Criteria) this;
        }

        public Criteria andLandAreaIsNotNull() {
            addCriterion("land_area is not null");
            return (Criteria) this;
        }

        public Criteria andLandAreaEqualTo(Integer value) {
            addCriterion("land_area =", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaNotEqualTo(Integer value) {
            addCriterion("land_area <>", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaGreaterThan(Integer value) {
            addCriterion("land_area >", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("land_area >=", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaLessThan(Integer value) {
            addCriterion("land_area <", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaLessThanOrEqualTo(Integer value) {
            addCriterion("land_area <=", value, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaIn(List<Integer> values) {
            addCriterion("land_area in", values, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaNotIn(List<Integer> values) {
            addCriterion("land_area not in", values, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaBetween(Integer value1, Integer value2) {
            addCriterion("land_area between", value1, value2, "landArea");
            return (Criteria) this;
        }

        public Criteria andLandAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("land_area not between", value1, value2, "landArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIsNull() {
            addCriterion("build_area is null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIsNotNull() {
            addCriterion("build_area is not null");
            return (Criteria) this;
        }

        public Criteria andBuildAreaEqualTo(Integer value) {
            addCriterion("build_area =", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotEqualTo(Integer value) {
            addCriterion("build_area <>", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaGreaterThan(Integer value) {
            addCriterion("build_area >", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_area >=", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLessThan(Integer value) {
            addCriterion("build_area <", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaLessThanOrEqualTo(Integer value) {
            addCriterion("build_area <=", value, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaIn(List<Integer> values) {
            addCriterion("build_area in", values, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotIn(List<Integer> values) {
            addCriterion("build_area not in", values, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaBetween(Integer value1, Integer value2) {
            addCriterion("build_area between", value1, value2, "buildArea");
            return (Criteria) this;
        }

        public Criteria andBuildAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("build_area not between", value1, value2, "buildArea");
            return (Criteria) this;
        }

        public Criteria andTotalHouseIsNull() {
            addCriterion("total_house is null");
            return (Criteria) this;
        }

        public Criteria andTotalHouseIsNotNull() {
            addCriterion("total_house is not null");
            return (Criteria) this;
        }

        public Criteria andTotalHouseEqualTo(Integer value) {
            addCriterion("total_house =", value, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andTotalHouseNotEqualTo(Integer value) {
            addCriterion("total_house <>", value, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andTotalHouseGreaterThan(Integer value) {
            addCriterion("total_house >", value, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andTotalHouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_house >=", value, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andTotalHouseLessThan(Integer value) {
            addCriterion("total_house <", value, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andTotalHouseLessThanOrEqualTo(Integer value) {
            addCriterion("total_house <=", value, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andTotalHouseIn(List<Integer> values) {
            addCriterion("total_house in", values, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andTotalHouseNotIn(List<Integer> values) {
            addCriterion("total_house not in", values, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andTotalHouseBetween(Integer value1, Integer value2) {
            addCriterion("total_house between", value1, value2, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andTotalHouseNotBetween(Integer value1, Integer value2) {
            addCriterion("total_house not between", value1, value2, "totalHouse");
            return (Criteria) this;
        }

        public Criteria andGreenRateIsNull() {
            addCriterion("green_rate is null");
            return (Criteria) this;
        }

        public Criteria andGreenRateIsNotNull() {
            addCriterion("green_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGreenRateEqualTo(Integer value) {
            addCriterion("green_rate =", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateNotEqualTo(Integer value) {
            addCriterion("green_rate <>", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateGreaterThan(Integer value) {
            addCriterion("green_rate >", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("green_rate >=", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateLessThan(Integer value) {
            addCriterion("green_rate <", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateLessThanOrEqualTo(Integer value) {
            addCriterion("green_rate <=", value, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateIn(List<Integer> values) {
            addCriterion("green_rate in", values, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateNotIn(List<Integer> values) {
            addCriterion("green_rate not in", values, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateBetween(Integer value1, Integer value2) {
            addCriterion("green_rate between", value1, value2, "greenRate");
            return (Criteria) this;
        }

        public Criteria andGreenRateNotBetween(Integer value1, Integer value2) {
            addCriterion("green_rate not between", value1, value2, "greenRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateIsNull() {
            addCriterion("volume_rate is null");
            return (Criteria) this;
        }

        public Criteria andVolumeRateIsNotNull() {
            addCriterion("volume_rate is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeRateEqualTo(Double value) {
            addCriterion("volume_rate =", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateNotEqualTo(Double value) {
            addCriterion("volume_rate <>", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateGreaterThan(Double value) {
            addCriterion("volume_rate >", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateGreaterThanOrEqualTo(Double value) {
            addCriterion("volume_rate >=", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateLessThan(Double value) {
            addCriterion("volume_rate <", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateLessThanOrEqualTo(Double value) {
            addCriterion("volume_rate <=", value, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateIn(List<Double> values) {
            addCriterion("volume_rate in", values, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateNotIn(List<Double> values) {
            addCriterion("volume_rate not in", values, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateBetween(Double value1, Double value2) {
            addCriterion("volume_rate between", value1, value2, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andVolumeRateNotBetween(Double value1, Double value2) {
            addCriterion("volume_rate not between", value1, value2, "volumeRate");
            return (Criteria) this;
        }

        public Criteria andRentRateIsNull() {
            addCriterion("rent_rate is null");
            return (Criteria) this;
        }

        public Criteria andRentRateIsNotNull() {
            addCriterion("rent_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRentRateEqualTo(Integer value) {
            addCriterion("rent_rate =", value, "rentRate");
            return (Criteria) this;
        }

        public Criteria andRentRateNotEqualTo(Integer value) {
            addCriterion("rent_rate <>", value, "rentRate");
            return (Criteria) this;
        }

        public Criteria andRentRateGreaterThan(Integer value) {
            addCriterion("rent_rate >", value, "rentRate");
            return (Criteria) this;
        }

        public Criteria andRentRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_rate >=", value, "rentRate");
            return (Criteria) this;
        }

        public Criteria andRentRateLessThan(Integer value) {
            addCriterion("rent_rate <", value, "rentRate");
            return (Criteria) this;
        }

        public Criteria andRentRateLessThanOrEqualTo(Integer value) {
            addCriterion("rent_rate <=", value, "rentRate");
            return (Criteria) this;
        }

        public Criteria andRentRateIn(List<Integer> values) {
            addCriterion("rent_rate in", values, "rentRate");
            return (Criteria) this;
        }

        public Criteria andRentRateNotIn(List<Integer> values) {
            addCriterion("rent_rate not in", values, "rentRate");
            return (Criteria) this;
        }

        public Criteria andRentRateBetween(Integer value1, Integer value2) {
            addCriterion("rent_rate between", value1, value2, "rentRate");
            return (Criteria) this;
        }

        public Criteria andRentRateNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_rate not between", value1, value2, "rentRate");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceIsNull() {
            addCriterion("parking_space is null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceIsNotNull() {
            addCriterion("parking_space is not null");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceEqualTo(Integer value) {
            addCriterion("parking_space =", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotEqualTo(Integer value) {
            addCriterion("parking_space <>", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceGreaterThan(Integer value) {
            addCriterion("parking_space >", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("parking_space >=", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceLessThan(Integer value) {
            addCriterion("parking_space <", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceLessThanOrEqualTo(Integer value) {
            addCriterion("parking_space <=", value, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceIn(List<Integer> values) {
            addCriterion("parking_space in", values, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotIn(List<Integer> values) {
            addCriterion("parking_space not in", values, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceBetween(Integer value1, Integer value2) {
            addCriterion("parking_space between", value1, value2, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andParkingSpaceNotBetween(Integer value1, Integer value2) {
            addCriterion("parking_space not between", value1, value2, "parkingSpace");
            return (Criteria) this;
        }

        public Criteria andWyPriceIsNull() {
            addCriterion("wy_price is null");
            return (Criteria) this;
        }

        public Criteria andWyPriceIsNotNull() {
            addCriterion("wy_price is not null");
            return (Criteria) this;
        }

        public Criteria andWyPriceEqualTo(Double value) {
            addCriterion("wy_price =", value, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andWyPriceNotEqualTo(Double value) {
            addCriterion("wy_price <>", value, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andWyPriceGreaterThan(Double value) {
            addCriterion("wy_price >", value, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andWyPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("wy_price >=", value, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andWyPriceLessThan(Double value) {
            addCriterion("wy_price <", value, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andWyPriceLessThanOrEqualTo(Double value) {
            addCriterion("wy_price <=", value, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andWyPriceIn(List<Double> values) {
            addCriterion("wy_price in", values, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andWyPriceNotIn(List<Double> values) {
            addCriterion("wy_price not in", values, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andWyPriceBetween(Double value1, Double value2) {
            addCriterion("wy_price between", value1, value2, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andWyPriceNotBetween(Double value1, Double value2) {
            addCriterion("wy_price not between", value1, value2, "wyPrice");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyIsNull() {
            addCriterion("house_name_py is null");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyIsNotNull() {
            addCriterion("house_name_py is not null");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyEqualTo(String value) {
            addCriterion("house_name_py =", value, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyNotEqualTo(String value) {
            addCriterion("house_name_py <>", value, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyGreaterThan(String value) {
            addCriterion("house_name_py >", value, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyGreaterThanOrEqualTo(String value) {
            addCriterion("house_name_py >=", value, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyLessThan(String value) {
            addCriterion("house_name_py <", value, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyLessThanOrEqualTo(String value) {
            addCriterion("house_name_py <=", value, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyLike(String value) {
            addCriterion("house_name_py like", value, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyNotLike(String value) {
            addCriterion("house_name_py not like", value, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyIn(List<String> values) {
            addCriterion("house_name_py in", values, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyNotIn(List<String> values) {
            addCriterion("house_name_py not in", values, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyBetween(String value1, String value2) {
            addCriterion("house_name_py between", value1, value2, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyNotBetween(String value1, String value2) {
            addCriterion("house_name_py not between", value1, value2, "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(Double value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(Double value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(Double value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(Double value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(Double value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(Double value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<Double> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<Double> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(Double value1, Double value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(Double value1, Double value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Double value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Double value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Double value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Double value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Double value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Double value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Double> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Double> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Double value1, Double value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Double value1, Double value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andGeohashIsNull() {
            addCriterion("geohash is null");
            return (Criteria) this;
        }

        public Criteria andGeohashIsNotNull() {
            addCriterion("geohash is not null");
            return (Criteria) this;
        }

        public Criteria andGeohashEqualTo(String value) {
            addCriterion("geohash =", value, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashNotEqualTo(String value) {
            addCriterion("geohash <>", value, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashGreaterThan(String value) {
            addCriterion("geohash >", value, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashGreaterThanOrEqualTo(String value) {
            addCriterion("geohash >=", value, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashLessThan(String value) {
            addCriterion("geohash <", value, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashLessThanOrEqualTo(String value) {
            addCriterion("geohash <=", value, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashLike(String value) {
            addCriterion("geohash like", value, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashNotLike(String value) {
            addCriterion("geohash not like", value, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashIn(List<String> values) {
            addCriterion("geohash in", values, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashNotIn(List<String> values) {
            addCriterion("geohash not in", values, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashBetween(String value1, String value2) {
            addCriterion("geohash between", value1, value2, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashNotBetween(String value1, String value2) {
            addCriterion("geohash not between", value1, value2, "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundIsNull() {
            addCriterion("geohash_around is null");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundIsNotNull() {
            addCriterion("geohash_around is not null");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundEqualTo(String value) {
            addCriterion("geohash_around =", value, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundNotEqualTo(String value) {
            addCriterion("geohash_around <>", value, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundGreaterThan(String value) {
            addCriterion("geohash_around >", value, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundGreaterThanOrEqualTo(String value) {
            addCriterion("geohash_around >=", value, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundLessThan(String value) {
            addCriterion("geohash_around <", value, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundLessThanOrEqualTo(String value) {
            addCriterion("geohash_around <=", value, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundLike(String value) {
            addCriterion("geohash_around like", value, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundNotLike(String value) {
            addCriterion("geohash_around not like", value, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundIn(List<String> values) {
            addCriterion("geohash_around in", values, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundNotIn(List<String> values) {
            addCriterion("geohash_around not in", values, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundBetween(String value1, String value2) {
            addCriterion("geohash_around between", value1, value2, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundNotBetween(String value1, String value2) {
            addCriterion("geohash_around not between", value1, value2, "geohashAround");
            return (Criteria) this;
        }

        public Criteria andDeviationIsNull() {
            addCriterion("deviation is null");
            return (Criteria) this;
        }

        public Criteria andDeviationIsNotNull() {
            addCriterion("deviation is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationEqualTo(Integer value) {
            addCriterion("deviation =", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationNotEqualTo(Integer value) {
            addCriterion("deviation <>", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationGreaterThan(Integer value) {
            addCriterion("deviation >", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationGreaterThanOrEqualTo(Integer value) {
            addCriterion("deviation >=", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationLessThan(Integer value) {
            addCriterion("deviation <", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationLessThanOrEqualTo(Integer value) {
            addCriterion("deviation <=", value, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationIn(List<Integer> values) {
            addCriterion("deviation in", values, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationNotIn(List<Integer> values) {
            addCriterion("deviation not in", values, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationBetween(Integer value1, Integer value2) {
            addCriterion("deviation between", value1, value2, "deviation");
            return (Criteria) this;
        }

        public Criteria andDeviationNotBetween(Integer value1, Integer value2) {
            addCriterion("deviation not between", value1, value2, "deviation");
            return (Criteria) this;
        }

        public Criteria andReliabilityIsNull() {
            addCriterion("reliability is null");
            return (Criteria) this;
        }

        public Criteria andReliabilityIsNotNull() {
            addCriterion("reliability is not null");
            return (Criteria) this;
        }

        public Criteria andReliabilityEqualTo(Double value) {
            addCriterion("reliability =", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityNotEqualTo(Double value) {
            addCriterion("reliability <>", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityGreaterThan(Double value) {
            addCriterion("reliability >", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityGreaterThanOrEqualTo(Double value) {
            addCriterion("reliability >=", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityLessThan(Double value) {
            addCriterion("reliability <", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityLessThanOrEqualTo(Double value) {
            addCriterion("reliability <=", value, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityIn(List<Double> values) {
            addCriterion("reliability in", values, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityNotIn(List<Double> values) {
            addCriterion("reliability not in", values, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityBetween(Double value1, Double value2) {
            addCriterion("reliability between", value1, value2, "reliability");
            return (Criteria) this;
        }

        public Criteria andReliabilityNotBetween(Double value1, Double value2) {
            addCriterion("reliability not between", value1, value2, "reliability");
            return (Criteria) this;
        }

        public Criteria andIsFirstIsNull() {
            addCriterion("is_first is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstIsNotNull() {
            addCriterion("is_first is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstEqualTo(String value) {
            addCriterion("is_first =", value, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstNotEqualTo(String value) {
            addCriterion("is_first <>", value, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstGreaterThan(String value) {
            addCriterion("is_first >", value, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstGreaterThanOrEqualTo(String value) {
            addCriterion("is_first >=", value, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstLessThan(String value) {
            addCriterion("is_first <", value, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstLessThanOrEqualTo(String value) {
            addCriterion("is_first <=", value, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstLike(String value) {
            addCriterion("is_first like", value, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstNotLike(String value) {
            addCriterion("is_first not like", value, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstIn(List<String> values) {
            addCriterion("is_first in", values, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstNotIn(List<String> values) {
            addCriterion("is_first not in", values, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstBetween(String value1, String value2) {
            addCriterion("is_first between", value1, value2, "isFirst");
            return (Criteria) this;
        }

        public Criteria andIsFirstNotBetween(String value1, String value2) {
            addCriterion("is_first not between", value1, value2, "isFirst");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("edit_time is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Integer value) {
            addCriterion("edit_time =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Integer value) {
            addCriterion("edit_time <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Integer value) {
            addCriterion("edit_time >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_time >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Integer value) {
            addCriterion("edit_time <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Integer value) {
            addCriterion("edit_time <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Integer> values) {
            addCriterion("edit_time in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Integer> values) {
            addCriterion("edit_time not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Integer value1, Integer value2) {
            addCriterion("edit_time between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_time not between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdIsNull() {
            addCriterion("city_plan_id is null");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdIsNotNull() {
            addCriterion("city_plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdEqualTo(Integer value) {
            addCriterion("city_plan_id =", value, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdNotEqualTo(Integer value) {
            addCriterion("city_plan_id <>", value, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdGreaterThan(Integer value) {
            addCriterion("city_plan_id >", value, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_plan_id >=", value, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdLessThan(Integer value) {
            addCriterion("city_plan_id <", value, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_plan_id <=", value, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdIn(List<Integer> values) {
            addCriterion("city_plan_id in", values, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdNotIn(List<Integer> values) {
            addCriterion("city_plan_id not in", values, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("city_plan_id between", value1, value2, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_plan_id not between", value1, value2, "cityPlanId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andWyTelIsNull() {
            addCriterion("wy_tel is null");
            return (Criteria) this;
        }

        public Criteria andWyTelIsNotNull() {
            addCriterion("wy_tel is not null");
            return (Criteria) this;
        }

        public Criteria andWyTelEqualTo(String value) {
            addCriterion("wy_tel =", value, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelNotEqualTo(String value) {
            addCriterion("wy_tel <>", value, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelGreaterThan(String value) {
            addCriterion("wy_tel >", value, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelGreaterThanOrEqualTo(String value) {
            addCriterion("wy_tel >=", value, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelLessThan(String value) {
            addCriterion("wy_tel <", value, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelLessThanOrEqualTo(String value) {
            addCriterion("wy_tel <=", value, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelLike(String value) {
            addCriterion("wy_tel like", value, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelNotLike(String value) {
            addCriterion("wy_tel not like", value, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelIn(List<String> values) {
            addCriterion("wy_tel in", values, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelNotIn(List<String> values) {
            addCriterion("wy_tel not in", values, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelBetween(String value1, String value2) {
            addCriterion("wy_tel between", value1, value2, "wyTel");
            return (Criteria) this;
        }

        public Criteria andWyTelNotBetween(String value1, String value2) {
            addCriterion("wy_tel not between", value1, value2, "wyTel");
            return (Criteria) this;
        }

        public Criteria andIsPoolIsNull() {
            addCriterion("is_pool is null");
            return (Criteria) this;
        }

        public Criteria andIsPoolIsNotNull() {
            addCriterion("is_pool is not null");
            return (Criteria) this;
        }

        public Criteria andIsPoolEqualTo(Boolean value) {
            addCriterion("is_pool =", value, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsPoolNotEqualTo(Boolean value) {
            addCriterion("is_pool <>", value, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsPoolGreaterThan(Boolean value) {
            addCriterion("is_pool >", value, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsPoolGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pool >=", value, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsPoolLessThan(Boolean value) {
            addCriterion("is_pool <", value, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsPoolLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pool <=", value, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsPoolIn(List<Boolean> values) {
            addCriterion("is_pool in", values, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsPoolNotIn(List<Boolean> values) {
            addCriterion("is_pool not in", values, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsPoolBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pool between", value1, value2, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsPoolNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pool not between", value1, value2, "isPool");
            return (Criteria) this;
        }

        public Criteria andIsGymIsNull() {
            addCriterion("is_gym is null");
            return (Criteria) this;
        }

        public Criteria andIsGymIsNotNull() {
            addCriterion("is_gym is not null");
            return (Criteria) this;
        }

        public Criteria andIsGymEqualTo(Boolean value) {
            addCriterion("is_gym =", value, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsGymNotEqualTo(Boolean value) {
            addCriterion("is_gym <>", value, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsGymGreaterThan(Boolean value) {
            addCriterion("is_gym >", value, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsGymGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_gym >=", value, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsGymLessThan(Boolean value) {
            addCriterion("is_gym <", value, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsGymLessThanOrEqualTo(Boolean value) {
            addCriterion("is_gym <=", value, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsGymIn(List<Boolean> values) {
            addCriterion("is_gym in", values, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsGymNotIn(List<Boolean> values) {
            addCriterion("is_gym not in", values, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsGymBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gym between", value1, value2, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsGymNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gym not between", value1, value2, "isGym");
            return (Criteria) this;
        }

        public Criteria andIsSchoolIsNull() {
            addCriterion("is_school is null");
            return (Criteria) this;
        }

        public Criteria andIsSchoolIsNotNull() {
            addCriterion("is_school is not null");
            return (Criteria) this;
        }

        public Criteria andIsSchoolEqualTo(Boolean value) {
            addCriterion("is_school =", value, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSchoolNotEqualTo(Boolean value) {
            addCriterion("is_school <>", value, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSchoolGreaterThan(Boolean value) {
            addCriterion("is_school >", value, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSchoolGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_school >=", value, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSchoolLessThan(Boolean value) {
            addCriterion("is_school <", value, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSchoolLessThanOrEqualTo(Boolean value) {
            addCriterion("is_school <=", value, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSchoolIn(List<Boolean> values) {
            addCriterion("is_school in", values, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSchoolNotIn(List<Boolean> values) {
            addCriterion("is_school not in", values, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSchoolBetween(Boolean value1, Boolean value2) {
            addCriterion("is_school between", value1, value2, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSchoolNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_school not between", value1, value2, "isSchool");
            return (Criteria) this;
        }

        public Criteria andIsSubwayIsNull() {
            addCriterion("is_subway is null");
            return (Criteria) this;
        }

        public Criteria andIsSubwayIsNotNull() {
            addCriterion("is_subway is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubwayEqualTo(Boolean value) {
            addCriterion("is_subway =", value, "isSubway");
            return (Criteria) this;
        }

        public Criteria andIsSubwayNotEqualTo(Boolean value) {
            addCriterion("is_subway <>", value, "isSubway");
            return (Criteria) this;
        }

        public Criteria andIsSubwayGreaterThan(Boolean value) {
            addCriterion("is_subway >", value, "isSubway");
            return (Criteria) this;
        }

        public Criteria andIsSubwayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_subway >=", value, "isSubway");
            return (Criteria) this;
        }

        public Criteria andIsSubwayLessThan(Boolean value) {
            addCriterion("is_subway <", value, "isSubway");
            return (Criteria) this;
        }

        public Criteria andIsSubwayLessThanOrEqualTo(Boolean value) {
            addCriterion("is_subway <=", value, "isSubway");
            return (Criteria) this;
        }

        public Criteria andIsSubwayIn(List<Boolean> values) {
            addCriterion("is_subway in", values, "isSubway");
            return (Criteria) this;
        }

        public Criteria andIsSubwayNotIn(List<Boolean> values) {
            addCriterion("is_subway not in", values, "isSubway");
            return (Criteria) this;
        }

        public Criteria andIsSubwayBetween(Boolean value1, Boolean value2) {
            addCriterion("is_subway between", value1, value2, "isSubway");
            return (Criteria) this;
        }

        public Criteria andIsSubwayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_subway not between", value1, value2, "isSubway");
            return (Criteria) this;
        }

        public Criteria andHouseUrlIsNull() {
            addCriterion("house_url is null");
            return (Criteria) this;
        }

        public Criteria andHouseUrlIsNotNull() {
            addCriterion("house_url is not null");
            return (Criteria) this;
        }

        public Criteria andHouseUrlEqualTo(String value) {
            addCriterion("house_url =", value, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlNotEqualTo(String value) {
            addCriterion("house_url <>", value, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlGreaterThan(String value) {
            addCriterion("house_url >", value, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlGreaterThanOrEqualTo(String value) {
            addCriterion("house_url >=", value, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlLessThan(String value) {
            addCriterion("house_url <", value, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlLessThanOrEqualTo(String value) {
            addCriterion("house_url <=", value, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlLike(String value) {
            addCriterion("house_url like", value, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlNotLike(String value) {
            addCriterion("house_url not like", value, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlIn(List<String> values) {
            addCriterion("house_url in", values, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlNotIn(List<String> values) {
            addCriterion("house_url not in", values, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlBetween(String value1, String value2) {
            addCriterion("house_url between", value1, value2, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andHouseUrlNotBetween(String value1, String value2) {
            addCriterion("house_url not between", value1, value2, "houseUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlIsNull() {
            addCriterion("outlink_url is null");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlIsNotNull() {
            addCriterion("outlink_url is not null");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlEqualTo(String value) {
            addCriterion("outlink_url =", value, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlNotEqualTo(String value) {
            addCriterion("outlink_url <>", value, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlGreaterThan(String value) {
            addCriterion("outlink_url >", value, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("outlink_url >=", value, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlLessThan(String value) {
            addCriterion("outlink_url <", value, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlLessThanOrEqualTo(String value) {
            addCriterion("outlink_url <=", value, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlLike(String value) {
            addCriterion("outlink_url like", value, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlNotLike(String value) {
            addCriterion("outlink_url not like", value, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlIn(List<String> values) {
            addCriterion("outlink_url in", values, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlNotIn(List<String> values) {
            addCriterion("outlink_url not in", values, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlBetween(String value1, String value2) {
            addCriterion("outlink_url between", value1, value2, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlNotBetween(String value1, String value2) {
            addCriterion("outlink_url not between", value1, value2, "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvantageIsNull() {
            addCriterion("advantage is null");
            return (Criteria) this;
        }

        public Criteria andAdvantageIsNotNull() {
            addCriterion("advantage is not null");
            return (Criteria) this;
        }

        public Criteria andAdvantageEqualTo(String value) {
            addCriterion("advantage =", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotEqualTo(String value) {
            addCriterion("advantage <>", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThan(String value) {
            addCriterion("advantage >", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageGreaterThanOrEqualTo(String value) {
            addCriterion("advantage >=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThan(String value) {
            addCriterion("advantage <", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLessThanOrEqualTo(String value) {
            addCriterion("advantage <=", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageLike(String value) {
            addCriterion("advantage like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotLike(String value) {
            addCriterion("advantage not like", value, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageIn(List<String> values) {
            addCriterion("advantage in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotIn(List<String> values) {
            addCriterion("advantage not in", values, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageBetween(String value1, String value2) {
            addCriterion("advantage between", value1, value2, "advantage");
            return (Criteria) this;
        }

        public Criteria andAdvantageNotBetween(String value1, String value2) {
            addCriterion("advantage not between", value1, value2, "advantage");
            return (Criteria) this;
        }

        public Criteria andStarsIsNull() {
            addCriterion("stars is null");
            return (Criteria) this;
        }

        public Criteria andStarsIsNotNull() {
            addCriterion("stars is not null");
            return (Criteria) this;
        }

        public Criteria andStarsEqualTo(Byte value) {
            addCriterion("stars =", value, "stars");
            return (Criteria) this;
        }

        public Criteria andStarsNotEqualTo(Byte value) {
            addCriterion("stars <>", value, "stars");
            return (Criteria) this;
        }

        public Criteria andStarsGreaterThan(Byte value) {
            addCriterion("stars >", value, "stars");
            return (Criteria) this;
        }

        public Criteria andStarsGreaterThanOrEqualTo(Byte value) {
            addCriterion("stars >=", value, "stars");
            return (Criteria) this;
        }

        public Criteria andStarsLessThan(Byte value) {
            addCriterion("stars <", value, "stars");
            return (Criteria) this;
        }

        public Criteria andStarsLessThanOrEqualTo(Byte value) {
            addCriterion("stars <=", value, "stars");
            return (Criteria) this;
        }

        public Criteria andStarsIn(List<Byte> values) {
            addCriterion("stars in", values, "stars");
            return (Criteria) this;
        }

        public Criteria andStarsNotIn(List<Byte> values) {
            addCriterion("stars not in", values, "stars");
            return (Criteria) this;
        }

        public Criteria andStarsBetween(Byte value1, Byte value2) {
            addCriterion("stars between", value1, value2, "stars");
            return (Criteria) this;
        }

        public Criteria andStarsNotBetween(Byte value1, Byte value2) {
            addCriterion("stars not between", value1, value2, "stars");
            return (Criteria) this;
        }

        public Criteria andWyCompanyIsNull() {
            addCriterion("wy_company is null");
            return (Criteria) this;
        }

        public Criteria andWyCompanyIsNotNull() {
            addCriterion("wy_company is not null");
            return (Criteria) this;
        }

        public Criteria andWyCompanyEqualTo(String value) {
            addCriterion("wy_company =", value, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyNotEqualTo(String value) {
            addCriterion("wy_company <>", value, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyGreaterThan(String value) {
            addCriterion("wy_company >", value, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("wy_company >=", value, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyLessThan(String value) {
            addCriterion("wy_company <", value, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyLessThanOrEqualTo(String value) {
            addCriterion("wy_company <=", value, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyLike(String value) {
            addCriterion("wy_company like", value, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyNotLike(String value) {
            addCriterion("wy_company not like", value, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyIn(List<String> values) {
            addCriterion("wy_company in", values, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyNotIn(List<String> values) {
            addCriterion("wy_company not in", values, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyBetween(String value1, String value2) {
            addCriterion("wy_company between", value1, value2, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andWyCompanyNotBetween(String value1, String value2) {
            addCriterion("wy_company not between", value1, value2, "wyCompany");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andHouseNameLikeInsensitive(String value) {
            addCriterion("upper(house_name) like", value.toUpperCase(), "houseName");
            return (Criteria) this;
        }

        public Criteria andNickNameLikeInsensitive(String value) {
            addCriterion("upper(nick_name) like", value.toUpperCase(), "nickName");
            return (Criteria) this;
        }

        public Criteria andCertiNameLikeInsensitive(String value) {
            addCriterion("upper(certi_name) like", value.toUpperCase(), "certiName");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLikeInsensitive(String value) {
            addCriterion("upper(house_address) like", value.toUpperCase(), "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHousePicLikeInsensitive(String value) {
            addCriterion("upper(house_pic) like", value.toUpperCase(), "housePic");
            return (Criteria) this;
        }

        public Criteria andHouseDesLikeInsensitive(String value) {
            addCriterion("upper(house_des) like", value.toUpperCase(), "houseDes");
            return (Criteria) this;
        }

        public Criteria andZipCodeLikeInsensitive(String value) {
            addCriterion("upper(zip_code) like", value.toUpperCase(), "zipCode");
            return (Criteria) this;
        }

        public Criteria andSalesAgentTelLikeInsensitive(String value) {
            addCriterion("upper(sales_agent_tel) like", value.toUpperCase(), "salesAgentTel");
            return (Criteria) this;
        }

        public Criteria andHouseNamePyLikeInsensitive(String value) {
            addCriterion("upper(house_name_py) like", value.toUpperCase(), "houseNamePy");
            return (Criteria) this;
        }

        public Criteria andGeohashLikeInsensitive(String value) {
            addCriterion("upper(geohash) like", value.toUpperCase(), "geohash");
            return (Criteria) this;
        }

        public Criteria andGeohashAroundLikeInsensitive(String value) {
            addCriterion("upper(geohash_around) like", value.toUpperCase(), "geohashAround");
            return (Criteria) this;
        }

        public Criteria andIsFirstLikeInsensitive(String value) {
            addCriterion("upper(is_first) like", value.toUpperCase(), "isFirst");
            return (Criteria) this;
        }

        public Criteria andWyTelLikeInsensitive(String value) {
            addCriterion("upper(wy_tel) like", value.toUpperCase(), "wyTel");
            return (Criteria) this;
        }

        public Criteria andHouseUrlLikeInsensitive(String value) {
            addCriterion("upper(house_url) like", value.toUpperCase(), "houseUrl");
            return (Criteria) this;
        }

        public Criteria andOutlinkUrlLikeInsensitive(String value) {
            addCriterion("upper(outlink_url) like", value.toUpperCase(), "outlinkUrl");
            return (Criteria) this;
        }

        public Criteria andAdvantageLikeInsensitive(String value) {
            addCriterion("upper(advantage) like", value.toUpperCase(), "advantage");
            return (Criteria) this;
        }

        public Criteria andWyCompanyLikeInsensitive(String value) {
            addCriterion("upper(wy_company) like", value.toUpperCase(), "wyCompany");
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