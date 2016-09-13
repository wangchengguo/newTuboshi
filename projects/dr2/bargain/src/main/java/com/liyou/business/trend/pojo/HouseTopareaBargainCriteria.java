package com.liyou.business.trend.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.liyou.commons.pojo.AbstractCriteria;

public class HouseTopareaBargainCriteria extends AbstractCriteria {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseTopareaBargainCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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
            addCriterionForJDBCDate("bargaindate =", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bargaindate <>", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateGreaterThan(Date value) {
            addCriterionForJDBCDate("bargaindate >", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bargaindate >=", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateLessThan(Date value) {
            addCriterionForJDBCDate("bargaindate <", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bargaindate <=", value, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateIn(List<Date> values) {
            addCriterionForJDBCDate("bargaindate in", values, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bargaindate not in", values, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bargaindate between", value1, value2, "bargaindate");
            return (Criteria) this;
        }

        public Criteria andBargaindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bargaindate not between", value1, value2, "bargaindate");
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

        public Criteria andIfcalcIsNull() {
            addCriterion("ifcalc is null");
            return (Criteria) this;
        }

        public Criteria andIfcalcIsNotNull() {
            addCriterion("ifcalc is not null");
            return (Criteria) this;
        }

        public Criteria andIfcalcEqualTo(Integer value) {
            addCriterion("ifcalc =", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcNotEqualTo(Integer value) {
            addCriterion("ifcalc <>", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcGreaterThan(Integer value) {
            addCriterion("ifcalc >", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcGreaterThanOrEqualTo(Integer value) {
            addCriterion("ifcalc >=", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcLessThan(Integer value) {
            addCriterion("ifcalc <", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcLessThanOrEqualTo(Integer value) {
            addCriterion("ifcalc <=", value, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcIn(List<Integer> values) {
            addCriterion("ifcalc in", values, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcNotIn(List<Integer> values) {
            addCriterion("ifcalc not in", values, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcBetween(Integer value1, Integer value2) {
            addCriterion("ifcalc between", value1, value2, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andIfcalcNotBetween(Integer value1, Integer value2) {
            addCriterion("ifcalc not between", value1, value2, "ifcalc");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Boolean value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Boolean value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Boolean value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Boolean value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Boolean value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Boolean> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Boolean> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Boolean value1, Boolean value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andRoomLikeInsensitive(String value) {
            addCriterion("upper(room) like", value.toUpperCase(), "room");
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