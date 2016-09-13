package com.liyou.business.trend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liyou.commons.pojo.AbstractCriteria;

public class BargainHistoryCriteria extends AbstractCriteria{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BargainHistoryCriteria() {
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

        public Criteria andBargainidIsNull() {
            addCriterion("bargainid is null");
            return (Criteria) this;
        }

        public Criteria andBargainidIsNotNull() {
            addCriterion("bargainid is not null");
            return (Criteria) this;
        }

        public Criteria andBargainidEqualTo(Long value) {
            addCriterion("bargainid =", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidNotEqualTo(Long value) {
            addCriterion("bargainid <>", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidGreaterThan(Long value) {
            addCriterion("bargainid >", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidGreaterThanOrEqualTo(Long value) {
            addCriterion("bargainid >=", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidLessThan(Long value) {
            addCriterion("bargainid <", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidLessThanOrEqualTo(Long value) {
            addCriterion("bargainid <=", value, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidIn(List<Long> values) {
            addCriterion("bargainid in", values, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidNotIn(List<Long> values) {
            addCriterion("bargainid not in", values, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidBetween(Long value1, Long value2) {
            addCriterion("bargainid between", value1, value2, "bargainid");
            return (Criteria) this;
        }

        public Criteria andBargainidNotBetween(Long value1, Long value2) {
            addCriterion("bargainid not between", value1, value2, "bargainid");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBuildingIsNull() {
            addCriterion("building is null");
            return (Criteria) this;
        }

        public Criteria andBuildingIsNotNull() {
            addCriterion("building is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingEqualTo(String value) {
            addCriterion("building =", value, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingNotEqualTo(String value) {
            addCriterion("building <>", value, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingGreaterThan(String value) {
            addCriterion("building >", value, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingGreaterThanOrEqualTo(String value) {
            addCriterion("building >=", value, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingLessThan(String value) {
            addCriterion("building <", value, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingLessThanOrEqualTo(String value) {
            addCriterion("building <=", value, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingLike(String value) {
            addCriterion("building like", value, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingNotLike(String value) {
            addCriterion("building not like", value, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingIn(List<String> values) {
            addCriterion("building in", values, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingNotIn(List<String> values) {
            addCriterion("building not in", values, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingBetween(String value1, String value2) {
            addCriterion("building between", value1, value2, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingNotBetween(String value1, String value2) {
            addCriterion("building not between", value1, value2, "building");
            return (Criteria) this;
        }

        public Criteria andBuildingNoIsNull() {
            addCriterion("building_no is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNoIsNotNull() {
            addCriterion("building_no is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNoEqualTo(String value) {
            addCriterion("building_no =", value, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoNotEqualTo(String value) {
            addCriterion("building_no <>", value, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoGreaterThan(String value) {
            addCriterion("building_no >", value, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoGreaterThanOrEqualTo(String value) {
            addCriterion("building_no >=", value, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoLessThan(String value) {
            addCriterion("building_no <", value, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoLessThanOrEqualTo(String value) {
            addCriterion("building_no <=", value, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoLike(String value) {
            addCriterion("building_no like", value, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoNotLike(String value) {
            addCriterion("building_no not like", value, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoIn(List<String> values) {
            addCriterion("building_no in", values, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoNotIn(List<String> values) {
            addCriterion("building_no not in", values, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoBetween(String value1, String value2) {
            addCriterion("building_no between", value1, value2, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andBuildingNoNotBetween(String value1, String value2) {
            addCriterion("building_no not between", value1, value2, "buildingNo");
            return (Criteria) this;
        }

        public Criteria andRoomsIsNull() {
            addCriterion("rooms is null");
            return (Criteria) this;
        }

        public Criteria andRoomsIsNotNull() {
            addCriterion("rooms is not null");
            return (Criteria) this;
        }

        public Criteria andRoomsEqualTo(Integer value) {
            addCriterion("rooms =", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsNotEqualTo(Integer value) {
            addCriterion("rooms <>", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsGreaterThan(Integer value) {
            addCriterion("rooms >", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsGreaterThanOrEqualTo(Integer value) {
            addCriterion("rooms >=", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsLessThan(Integer value) {
            addCriterion("rooms <", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsLessThanOrEqualTo(Integer value) {
            addCriterion("rooms <=", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsIn(List<Integer> values) {
            addCriterion("rooms in", values, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsNotIn(List<Integer> values) {
            addCriterion("rooms not in", values, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsBetween(Integer value1, Integer value2) {
            addCriterion("rooms between", value1, value2, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsNotBetween(Integer value1, Integer value2) {
            addCriterion("rooms not between", value1, value2, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("room like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("room not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNull() {
            addCriterion("roomtype is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNotNull() {
            addCriterion("roomtype is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeEqualTo(Integer value) {
            addCriterion("roomtype =", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotEqualTo(Integer value) {
            addCriterion("roomtype <>", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThan(Integer value) {
            addCriterion("roomtype >", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomtype >=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThan(Integer value) {
            addCriterion("roomtype <", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThanOrEqualTo(Integer value) {
            addCriterion("roomtype <=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIn(List<Integer> values) {
            addCriterion("roomtype in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotIn(List<Integer> values) {
            addCriterion("roomtype not in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeBetween(Integer value1, Integer value2) {
            addCriterion("roomtype between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("roomtype not between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andBargainAreaIsNull() {
            addCriterion("bargain_area is null");
            return (Criteria) this;
        }

        public Criteria andBargainAreaIsNotNull() {
            addCriterion("bargain_area is not null");
            return (Criteria) this;
        }

        public Criteria andBargainAreaEqualTo(Long value) {
            addCriterion("bargain_area =", value, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andBargainAreaNotEqualTo(Long value) {
            addCriterion("bargain_area <>", value, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andBargainAreaGreaterThan(Long value) {
            addCriterion("bargain_area >", value, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andBargainAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("bargain_area >=", value, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andBargainAreaLessThan(Long value) {
            addCriterion("bargain_area <", value, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andBargainAreaLessThanOrEqualTo(Long value) {
            addCriterion("bargain_area <=", value, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andBargainAreaIn(List<Long> values) {
            addCriterion("bargain_area in", values, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andBargainAreaNotIn(List<Long> values) {
            addCriterion("bargain_area not in", values, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andBargainAreaBetween(Long value1, Long value2) {
            addCriterion("bargain_area between", value1, value2, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andBargainAreaNotBetween(Long value1, Long value2) {
            addCriterion("bargain_area not between", value1, value2, "bargainArea");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrIsNull() {
            addCriterion("property_attr is null");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrIsNotNull() {
            addCriterion("property_attr is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrEqualTo(Integer value) {
            addCriterion("property_attr =", value, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrNotEqualTo(Integer value) {
            addCriterion("property_attr <>", value, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrGreaterThan(Integer value) {
            addCriterion("property_attr >", value, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrGreaterThanOrEqualTo(Integer value) {
            addCriterion("property_attr >=", value, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrLessThan(Integer value) {
            addCriterion("property_attr <", value, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrLessThanOrEqualTo(Integer value) {
            addCriterion("property_attr <=", value, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrIn(List<Integer> values) {
            addCriterion("property_attr in", values, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrNotIn(List<Integer> values) {
            addCriterion("property_attr not in", values, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrBetween(Integer value1, Integer value2) {
            addCriterion("property_attr between", value1, value2, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyAttrNotBetween(Integer value1, Integer value2) {
            addCriterion("property_attr not between", value1, value2, "propertyAttr");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIsNull() {
            addCriterion("property_name is null");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIsNotNull() {
            addCriterion("property_name is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyNameEqualTo(String value) {
            addCriterion("property_name =", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotEqualTo(String value) {
            addCriterion("property_name <>", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameGreaterThan(String value) {
            addCriterion("property_name >", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameGreaterThanOrEqualTo(String value) {
            addCriterion("property_name >=", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLessThan(String value) {
            addCriterion("property_name <", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLessThanOrEqualTo(String value) {
            addCriterion("property_name <=", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLike(String value) {
            addCriterion("property_name like", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotLike(String value) {
            addCriterion("property_name not like", value, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameIn(List<String> values) {
            addCriterion("property_name in", values, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotIn(List<String> values) {
            addCriterion("property_name not in", values, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameBetween(String value1, String value2) {
            addCriterion("property_name between", value1, value2, "propertyName");
            return (Criteria) this;
        }

        public Criteria andPropertyNameNotBetween(String value1, String value2) {
            addCriterion("property_name not between", value1, value2, "propertyName");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
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

        public Criteria andAvpriceEqualTo(Long value) {
            addCriterion("avprice =", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceNotEqualTo(Long value) {
            addCriterion("avprice <>", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceGreaterThan(Long value) {
            addCriterion("avprice >", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("avprice >=", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceLessThan(Long value) {
            addCriterion("avprice <", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceLessThanOrEqualTo(Long value) {
            addCriterion("avprice <=", value, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceIn(List<Long> values) {
            addCriterion("avprice in", values, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceNotIn(List<Long> values) {
            addCriterion("avprice not in", values, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceBetween(Long value1, Long value2) {
            addCriterion("avprice between", value1, value2, "avprice");
            return (Criteria) this;
        }

        public Criteria andAvpriceNotBetween(Long value1, Long value2) {
            addCriterion("avprice not between", value1, value2, "avprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceIsNull() {
            addCriterion("sinprice is null");
            return (Criteria) this;
        }

        public Criteria andSinpriceIsNotNull() {
            addCriterion("sinprice is not null");
            return (Criteria) this;
        }

        public Criteria andSinpriceEqualTo(Long value) {
            addCriterion("sinprice =", value, "sinprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceNotEqualTo(Long value) {
            addCriterion("sinprice <>", value, "sinprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceGreaterThan(Long value) {
            addCriterion("sinprice >", value, "sinprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("sinprice >=", value, "sinprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceLessThan(Long value) {
            addCriterion("sinprice <", value, "sinprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceLessThanOrEqualTo(Long value) {
            addCriterion("sinprice <=", value, "sinprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceIn(List<Long> values) {
            addCriterion("sinprice in", values, "sinprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceNotIn(List<Long> values) {
            addCriterion("sinprice not in", values, "sinprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceBetween(Long value1, Long value2) {
            addCriterion("sinprice between", value1, value2, "sinprice");
            return (Criteria) this;
        }

        public Criteria andSinpriceNotBetween(Long value1, Long value2) {
            addCriterion("sinprice not between", value1, value2, "sinprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalprice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(Long value) {
            addCriterion("totalprice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(Long value) {
            addCriterion("totalprice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(Long value) {
            addCriterion("totalprice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("totalprice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(Long value) {
            addCriterion("totalprice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(Long value) {
            addCriterion("totalprice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<Long> values) {
            addCriterion("totalprice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<Long> values) {
            addCriterion("totalprice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(Long value1, Long value2) {
            addCriterion("totalprice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(Long value1, Long value2) {
            addCriterion("totalprice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andBargaindateIsNull() {
            addCriterion("bargaindate is null");
            return (Criteria) this;
        }

        public Criteria andBargaindateIsNotNull() {
            addCriterion("bargaindate is not null");
            return (Criteria) this;
        }

        public Criteria andBargaindateEqualTo(Date value) {
            addCriterion("bargaindate =", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateNotEqualTo(Date value) {
            addCriterion("bargaindate <>", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateGreaterThan(Date value) {
            addCriterion("bargaindate >", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateGreaterThanOrEqualTo(Date value) {
            addCriterion("bargaindate >=", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateLessThan(Date value) {
            addCriterion("bargaindate <", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateLessThanOrEqualTo(Date value) {
            addCriterion("bargaindate <=", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateIn(List<Date> values) {
            addCriterion("bargaindate in", values, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateNotIn(List<Date> values) {
            addCriterion("bargaindate not in", values, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateBetween(Date value1, Date value2) {
            addCriterion("bargaindate between", value1, value2, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateNotBetween(Date value1, Date value2) {
            addCriterion("bargaindate not between", value1, value2, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andPresaleNameIsNull() {
            addCriterion("presale_name is null");
            return (Criteria) this;
        }

        public Criteria andPresaleNameIsNotNull() {
            addCriterion("presale_name is not null");
            return (Criteria) this;
        }

        public Criteria andPresaleNameEqualTo(String value) {
            addCriterion("presale_name =", value, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameNotEqualTo(String value) {
            addCriterion("presale_name <>", value, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameGreaterThan(String value) {
            addCriterion("presale_name >", value, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameGreaterThanOrEqualTo(String value) {
            addCriterion("presale_name >=", value, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameLessThan(String value) {
            addCriterion("presale_name <", value, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameLessThanOrEqualTo(String value) {
            addCriterion("presale_name <=", value, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameLike(String value) {
            addCriterion("presale_name like", value, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameNotLike(String value) {
            addCriterion("presale_name not like", value, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameIn(List<String> values) {
            addCriterion("presale_name in", values, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameNotIn(List<String> values) {
            addCriterion("presale_name not in", values, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameBetween(String value1, String value2) {
            addCriterion("presale_name between", value1, value2, "presaleName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameNotBetween(String value1, String value2) {
            addCriterion("presale_name not between", value1, value2, "presaleName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_name =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameIsNull() {
            addCriterion("agent_shortname is null");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameIsNotNull() {
            addCriterion("agent_shortname is not null");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameEqualTo(String value) {
            addCriterion("agent_shortname =", value, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameNotEqualTo(String value) {
            addCriterion("agent_shortname <>", value, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameGreaterThan(String value) {
            addCriterion("agent_shortname >", value, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_shortname >=", value, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameLessThan(String value) {
            addCriterion("agent_shortname <", value, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameLessThanOrEqualTo(String value) {
            addCriterion("agent_shortname <=", value, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameLike(String value) {
            addCriterion("agent_shortname like", value, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameNotLike(String value) {
            addCriterion("agent_shortname not like", value, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameIn(List<String> values) {
            addCriterion("agent_shortname in", values, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameNotIn(List<String> values) {
            addCriterion("agent_shortname not in", values, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameBetween(String value1, String value2) {
            addCriterion("agent_shortname between", value1, value2, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameNotBetween(String value1, String value2) {
            addCriterion("agent_shortname not between", value1, value2, "agentShortname");
            return (Criteria) this;
        }

        public Criteria andFirstHandIsNull() {
            addCriterion("first_hand is null");
            return (Criteria) this;
        }

        public Criteria andFirstHandIsNotNull() {
            addCriterion("first_hand is not null");
            return (Criteria) this;
        }

        public Criteria andFirstHandEqualTo(Integer value) {
            addCriterion("first_hand =", value, "firstHand");
            return (Criteria) this;
        }

        public Criteria andFirstHandNotEqualTo(Integer value) {
            addCriterion("first_hand <>", value, "firstHand");
            return (Criteria) this;
        }

        public Criteria andFirstHandGreaterThan(Integer value) {
            addCriterion("first_hand >", value, "firstHand");
            return (Criteria) this;
        }

        public Criteria andFirstHandGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_hand >=", value, "firstHand");
            return (Criteria) this;
        }

        public Criteria andFirstHandLessThan(Integer value) {
            addCriterion("first_hand <", value, "firstHand");
            return (Criteria) this;
        }

        public Criteria andFirstHandLessThanOrEqualTo(Integer value) {
            addCriterion("first_hand <=", value, "firstHand");
            return (Criteria) this;
        }

        public Criteria andFirstHandIn(List<Integer> values) {
            addCriterion("first_hand in", values, "firstHand");
            return (Criteria) this;
        }

        public Criteria andFirstHandNotIn(List<Integer> values) {
            addCriterion("first_hand not in", values, "firstHand");
            return (Criteria) this;
        }

        public Criteria andFirstHandBetween(Integer value1, Integer value2) {
            addCriterion("first_hand between", value1, value2, "firstHand");
            return (Criteria) this;
        }

        public Criteria andFirstHandNotBetween(Integer value1, Integer value2) {
            addCriterion("first_hand not between", value1, value2, "firstHand");
            return (Criteria) this;
        }

        public Criteria andIfcalcIsNull() {
            addCriterion("ifcalc is null");
            return (Criteria) this;
        }

        public Criteria andIfcalcIsNotNull() {
            addCriterion("ifcalc is not null");
            return (Criteria) this;
        }

        public Criteria andIfcalcEqualTo(Boolean value) {
            addCriterion("ifcalc =", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcNotEqualTo(Boolean value) {
            addCriterion("ifcalc <>", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcGreaterThan(Boolean value) {
            addCriterion("ifcalc >", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifcalc >=", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcLessThan(Boolean value) {
            addCriterion("ifcalc <", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcLessThanOrEqualTo(Boolean value) {
            addCriterion("ifcalc <=", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcIn(List<Boolean> values) {
            addCriterion("ifcalc in", values, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcNotIn(List<Boolean> values) {
            addCriterion("ifcalc not in", values, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcBetween(Boolean value1, Boolean value2) {
            addCriterion("ifcalc between", value1, value2, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifcalc not between", value1, value2, "ifcalc");
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

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("house_type like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("house_type not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIsNull() {
            addCriterion("room_type_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIsNotNull() {
            addCriterion("room_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameEqualTo(String value) {
            addCriterion("room_type_name =", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotEqualTo(String value) {
            addCriterion("room_type_name <>", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameGreaterThan(String value) {
            addCriterion("room_type_name >", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_name >=", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLessThan(String value) {
            addCriterion("room_type_name <", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLessThanOrEqualTo(String value) {
            addCriterion("room_type_name <=", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLike(String value) {
            addCriterion("room_type_name like", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotLike(String value) {
            addCriterion("room_type_name not like", value, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameIn(List<String> values) {
            addCriterion("room_type_name in", values, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotIn(List<String> values) {
            addCriterion("room_type_name not in", values, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameBetween(String value1, String value2) {
            addCriterion("room_type_name between", value1, value2, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameNotBetween(String value1, String value2) {
            addCriterion("room_type_name not between", value1, value2, "roomTypeName");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andPriceTagIsNull() {
            addCriterion("price_tag is null");
            return (Criteria) this;
        }

        public Criteria andPriceTagIsNotNull() {
            addCriterion("price_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTagEqualTo(Integer value) {
            addCriterion("price_tag =", value, "priceTag");
            return (Criteria) this;
        }

        public Criteria andPriceTagNotEqualTo(Integer value) {
            addCriterion("price_tag <>", value, "priceTag");
            return (Criteria) this;
        }

        public Criteria andPriceTagGreaterThan(Integer value) {
            addCriterion("price_tag >", value, "priceTag");
            return (Criteria) this;
        }

        public Criteria andPriceTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("price_tag >=", value, "priceTag");
            return (Criteria) this;
        }

        public Criteria andPriceTagLessThan(Integer value) {
            addCriterion("price_tag <", value, "priceTag");
            return (Criteria) this;
        }

        public Criteria andPriceTagLessThanOrEqualTo(Integer value) {
            addCriterion("price_tag <=", value, "priceTag");
            return (Criteria) this;
        }

        public Criteria andPriceTagIn(List<Integer> values) {
            addCriterion("price_tag in", values, "priceTag");
            return (Criteria) this;
        }

        public Criteria andPriceTagNotIn(List<Integer> values) {
            addCriterion("price_tag not in", values, "priceTag");
            return (Criteria) this;
        }

        public Criteria andPriceTagBetween(Integer value1, Integer value2) {
            addCriterion("price_tag between", value1, value2, "priceTag");
            return (Criteria) this;
        }

        public Criteria andPriceTagNotBetween(Integer value1, Integer value2) {
            addCriterion("price_tag not between", value1, value2, "priceTag");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdIsNull() {
            addCriterion("agent_superior_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdIsNotNull() {
            addCriterion("agent_superior_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdEqualTo(Integer value) {
            addCriterion("agent_superior_id =", value, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdNotEqualTo(Integer value) {
            addCriterion("agent_superior_id <>", value, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdGreaterThan(Integer value) {
            addCriterion("agent_superior_id >", value, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_superior_id >=", value, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdLessThan(Integer value) {
            addCriterion("agent_superior_id <", value, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_superior_id <=", value, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdIn(List<Integer> values) {
            addCriterion("agent_superior_id in", values, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdNotIn(List<Integer> values) {
            addCriterion("agent_superior_id not in", values, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_superior_id between", value1, value2, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andAgentSuperiorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_superior_id not between", value1, value2, "agentSuperiorId");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceIsNull() {
            addCriterion("verify_sinprice is null");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceIsNotNull() {
            addCriterion("verify_sinprice is not null");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceEqualTo(Long value) {
            addCriterion("verify_sinprice =", value, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceNotEqualTo(Long value) {
            addCriterion("verify_sinprice <>", value, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceGreaterThan(Long value) {
            addCriterion("verify_sinprice >", value, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("verify_sinprice >=", value, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceLessThan(Long value) {
            addCriterion("verify_sinprice <", value, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceLessThanOrEqualTo(Long value) {
            addCriterion("verify_sinprice <=", value, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceIn(List<Long> values) {
            addCriterion("verify_sinprice in", values, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceNotIn(List<Long> values) {
            addCriterion("verify_sinprice not in", values, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceBetween(Long value1, Long value2) {
            addCriterion("verify_sinprice between", value1, value2, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifySinpriceNotBetween(Long value1, Long value2) {
            addCriterion("verify_sinprice not between", value1, value2, "verifySinprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceIsNull() {
            addCriterion("verify_totalprice is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceIsNotNull() {
            addCriterion("verify_totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceEqualTo(Long value) {
            addCriterion("verify_totalprice =", value, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceNotEqualTo(Long value) {
            addCriterion("verify_totalprice <>", value, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceGreaterThan(Long value) {
            addCriterion("verify_totalprice >", value, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("verify_totalprice >=", value, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceLessThan(Long value) {
            addCriterion("verify_totalprice <", value, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceLessThanOrEqualTo(Long value) {
            addCriterion("verify_totalprice <=", value, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceIn(List<Long> values) {
            addCriterion("verify_totalprice in", values, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceNotIn(List<Long> values) {
            addCriterion("verify_totalprice not in", values, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceBetween(Long value1, Long value2) {
            addCriterion("verify_totalprice between", value1, value2, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andVerifyTotalpriceNotBetween(Long value1, Long value2) {
            addCriterion("verify_totalprice not between", value1, value2, "verifyTotalprice");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andBuildingLikeInsensitive(String value) {
            addCriterion("upper(building) like", value.toUpperCase(), "building");
            return (Criteria) this;
        }

        public Criteria andBuildingNoLikeInsensitive(String value) {
            addCriterion("upper(building_no) like", value.toUpperCase(), "buildingNo");
            return (Criteria) this;
        }

        public Criteria andRoomLikeInsensitive(String value) {
            addCriterion("upper(room) like", value.toUpperCase(), "room");
            return (Criteria) this;
        }

        public Criteria andPropertyNameLikeInsensitive(String value) {
            addCriterion("upper(property_name) like", value.toUpperCase(), "propertyName");
            return (Criteria) this;
        }

        public Criteria andPresaleNameLikeInsensitive(String value) {
            addCriterion("upper(presale_name) like", value.toUpperCase(), "presaleName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLikeInsensitive(String value) {
            addCriterion("upper(agent_name) like", value.toUpperCase(), "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentShortnameLikeInsensitive(String value) {
            addCriterion("upper(agent_shortname) like", value.toUpperCase(), "agentShortname");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLikeInsensitive(String value) {
            addCriterion("upper(house_type) like", value.toUpperCase(), "houseType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNameLikeInsensitive(String value) {
            addCriterion("upper(room_type_name) like", value.toUpperCase(), "roomTypeName");
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