package com.liyou.business.trend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liyou.commons.pojo.AbstractCriteria;

public class HouseQuotedPriceCriteria extends AbstractCriteria {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseQuotedPriceCriteria() {
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

        public Criteria andRoomIsNull() {
            addCriterion("room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(Short value) {
            addCriterion("room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(Short value) {
            addCriterion("room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(Short value) {
            addCriterion("room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(Short value) {
            addCriterion("room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(Short value) {
            addCriterion("room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(Short value) {
            addCriterion("room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<Short> values) {
            addCriterion("room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<Short> values) {
            addCriterion("room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(Short value1, Short value2) {
            addCriterion("room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(Short value1, Short value2) {
            addCriterion("room not between", value1, value2, "room");
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

        public Criteria andFloorEqualTo(Short value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Short value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Short value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Short value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Short value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Short value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Short> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Short> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Short value1, Short value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Short value1, Short value2) {
            addCriterion("floor not between", value1, value2, "floor");
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

        public Criteria andFloorsIsNull() {
            addCriterion("floors is null");
            return (Criteria) this;
        }

        public Criteria andFloorsIsNotNull() {
            addCriterion("floors is not null");
            return (Criteria) this;
        }

        public Criteria andFloorsEqualTo(Short value) {
            addCriterion("floors =", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsNotEqualTo(Short value) {
            addCriterion("floors <>", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsGreaterThan(Short value) {
            addCriterion("floors >", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsGreaterThanOrEqualTo(Short value) {
            addCriterion("floors >=", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsLessThan(Short value) {
            addCriterion("floors <", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsLessThanOrEqualTo(Short value) {
            addCriterion("floors <=", value, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsIn(List<Short> values) {
            addCriterion("floors in", values, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsNotIn(List<Short> values) {
            addCriterion("floors not in", values, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsBetween(Short value1, Short value2) {
            addCriterion("floors between", value1, value2, "floors");
            return (Criteria) this;
        }

        public Criteria andFloorsNotBetween(Short value1, Short value2) {
            addCriterion("floors not between", value1, value2, "floors");
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

        public Criteria andRoomsEqualTo(Short value) {
            addCriterion("rooms =", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsNotEqualTo(Short value) {
            addCriterion("rooms <>", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsGreaterThan(Short value) {
            addCriterion("rooms >", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsGreaterThanOrEqualTo(Short value) {
            addCriterion("rooms >=", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsLessThan(Short value) {
            addCriterion("rooms <", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsLessThanOrEqualTo(Short value) {
            addCriterion("rooms <=", value, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsIn(List<Short> values) {
            addCriterion("rooms in", values, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsNotIn(List<Short> values) {
            addCriterion("rooms not in", values, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsBetween(Short value1, Short value2) {
            addCriterion("rooms between", value1, value2, "rooms");
            return (Criteria) this;
        }

        public Criteria andRoomsNotBetween(Short value1, Short value2) {
            addCriterion("rooms not between", value1, value2, "rooms");
            return (Criteria) this;
        }

        public Criteria andIfFirstIsNull() {
            addCriterion("if_first is null");
            return (Criteria) this;
        }

        public Criteria andIfFirstIsNotNull() {
            addCriterion("if_first is not null");
            return (Criteria) this;
        }

        public Criteria andIfFirstEqualTo(Byte value) {
            addCriterion("if_first =", value, "ifFirst");
            return (Criteria) this;
        }

        public Criteria andIfFirstNotEqualTo(Byte value) {
            addCriterion("if_first <>", value, "ifFirst");
            return (Criteria) this;
        }

        public Criteria andIfFirstGreaterThan(Byte value) {
            addCriterion("if_first >", value, "ifFirst");
            return (Criteria) this;
        }

        public Criteria andIfFirstGreaterThanOrEqualTo(Byte value) {
            addCriterion("if_first >=", value, "ifFirst");
            return (Criteria) this;
        }

        public Criteria andIfFirstLessThan(Byte value) {
            addCriterion("if_first <", value, "ifFirst");
            return (Criteria) this;
        }

        public Criteria andIfFirstLessThanOrEqualTo(Byte value) {
            addCriterion("if_first <=", value, "ifFirst");
            return (Criteria) this;
        }

        public Criteria andIfFirstIn(List<Byte> values) {
            addCriterion("if_first in", values, "ifFirst");
            return (Criteria) this;
        }

        public Criteria andIfFirstNotIn(List<Byte> values) {
            addCriterion("if_first not in", values, "ifFirst");
            return (Criteria) this;
        }

        public Criteria andIfFirstBetween(Byte value1, Byte value2) {
            addCriterion("if_first between", value1, value2, "ifFirst");
            return (Criteria) this;
        }

        public Criteria andIfFirstNotBetween(Byte value1, Byte value2) {
            addCriterion("if_first not between", value1, value2, "ifFirst");
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andBuildtypeIsNull() {
            addCriterion("buildtype is null");
            return (Criteria) this;
        }

        public Criteria andBuildtypeIsNotNull() {
            addCriterion("buildtype is not null");
            return (Criteria) this;
        }

        public Criteria andBuildtypeEqualTo(String value) {
            addCriterion("buildtype =", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotEqualTo(String value) {
            addCriterion("buildtype <>", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeGreaterThan(String value) {
            addCriterion("buildtype >", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeGreaterThanOrEqualTo(String value) {
            addCriterion("buildtype >=", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLessThan(String value) {
            addCriterion("buildtype <", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLessThanOrEqualTo(String value) {
            addCriterion("buildtype <=", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLike(String value) {
            addCriterion("buildtype like", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotLike(String value) {
            addCriterion("buildtype not like", value, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeIn(List<String> values) {
            addCriterion("buildtype in", values, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotIn(List<String> values) {
            addCriterion("buildtype not in", values, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeBetween(String value1, String value2) {
            addCriterion("buildtype between", value1, value2, "buildtype");
            return (Criteria) this;
        }

        public Criteria andBuildtypeNotBetween(String value1, String value2) {
            addCriterion("buildtype not between", value1, value2, "buildtype");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceIsNull() {
            addCriterion("quoted_total_price is null");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceIsNotNull() {
            addCriterion("quoted_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceEqualTo(Long value) {
            addCriterion("quoted_total_price =", value, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceNotEqualTo(Long value) {
            addCriterion("quoted_total_price <>", value, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceGreaterThan(Long value) {
            addCriterion("quoted_total_price >", value, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("quoted_total_price >=", value, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceLessThan(Long value) {
            addCriterion("quoted_total_price <", value, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("quoted_total_price <=", value, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceIn(List<Long> values) {
            addCriterion("quoted_total_price in", values, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceNotIn(List<Long> values) {
            addCriterion("quoted_total_price not in", values, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceBetween(Long value1, Long value2) {
            addCriterion("quoted_total_price between", value1, value2, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("quoted_total_price not between", value1, value2, "quotedTotalPrice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceIsNull() {
            addCriterion("quoted_sinprice is null");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceIsNotNull() {
            addCriterion("quoted_sinprice is not null");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceEqualTo(Integer value) {
            addCriterion("quoted_sinprice =", value, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceNotEqualTo(Integer value) {
            addCriterion("quoted_sinprice <>", value, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceGreaterThan(Integer value) {
            addCriterion("quoted_sinprice >", value, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("quoted_sinprice >=", value, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceLessThan(Integer value) {
            addCriterion("quoted_sinprice <", value, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceLessThanOrEqualTo(Integer value) {
            addCriterion("quoted_sinprice <=", value, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceIn(List<Integer> values) {
            addCriterion("quoted_sinprice in", values, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceNotIn(List<Integer> values) {
            addCriterion("quoted_sinprice not in", values, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceBetween(Integer value1, Integer value2) {
            addCriterion("quoted_sinprice between", value1, value2, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedSinpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("quoted_sinprice not between", value1, value2, "quotedSinprice");
            return (Criteria) this;
        }

        public Criteria andQuotedDateIsNull() {
            addCriterion("quoted_date is null");
            return (Criteria) this;
        }

        public Criteria andQuotedDateIsNotNull() {
            addCriterion("quoted_date is not null");
            return (Criteria) this;
        }

        public Criteria andQuotedDateEqualTo(Date value) {
            addCriterion("quoted_date =", value, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andQuotedDateNotEqualTo(Date value) {
            addCriterion("quoted_date <>", value, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andQuotedDateGreaterThan(Date value) {
            addCriterion("quoted_date >", value, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andQuotedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("quoted_date >=", value, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andQuotedDateLessThan(Date value) {
            addCriterion("quoted_date <", value, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andQuotedDateLessThanOrEqualTo(Date value) {
            addCriterion("quoted_date <=", value, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andQuotedDateIn(List<Date> values) {
            addCriterion("quoted_date in", values, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andQuotedDateNotIn(List<Date> values) {
            addCriterion("quoted_date not in", values, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andQuotedDateBetween(Date value1, Date value2) {
            addCriterion("quoted_date between", value1, value2, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andQuotedDateNotBetween(Date value1, Date value2) {
            addCriterion("quoted_date not between", value1, value2, "quotedDate");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
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

        public Criteria andBuildingLikeInsensitive(String value) {
            addCriterion("upper(building) like", value.toUpperCase(), "building");
            return (Criteria) this;
        }

        public Criteria andBuildingNoLikeInsensitive(String value) {
            addCriterion("upper(building_no) like", value.toUpperCase(), "buildingNo");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andBuildtypeLikeInsensitive(String value) {
            addCriterion("upper(buildtype) like", value.toUpperCase(), "buildtype");
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