package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XPayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XPayExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(String value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(String value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(String value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(String value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(String value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(String value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLike(String value) {
            addCriterion("o_id like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotLike(String value) {
            addCriterion("o_id not like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<String> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<String> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(String value1, String value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(String value1, String value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOTypeidIsNull() {
            addCriterion("o_typeId is null");
            return (Criteria) this;
        }

        public Criteria andOTypeidIsNotNull() {
            addCriterion("o_typeId is not null");
            return (Criteria) this;
        }

        public Criteria andOTypeidEqualTo(Integer value) {
            addCriterion("o_typeId =", value, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOTypeidNotEqualTo(Integer value) {
            addCriterion("o_typeId <>", value, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOTypeidGreaterThan(Integer value) {
            addCriterion("o_typeId >", value, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_typeId >=", value, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOTypeidLessThan(Integer value) {
            addCriterion("o_typeId <", value, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("o_typeId <=", value, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOTypeidIn(List<Integer> values) {
            addCriterion("o_typeId in", values, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOTypeidNotIn(List<Integer> values) {
            addCriterion("o_typeId not in", values, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOTypeidBetween(Integer value1, Integer value2) {
            addCriterion("o_typeId between", value1, value2, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("o_typeId not between", value1, value2, "oTypeid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidIsNull() {
            addCriterion("o_platformorderId is null");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidIsNotNull() {
            addCriterion("o_platformorderId is not null");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidEqualTo(String value) {
            addCriterion("o_platformorderId =", value, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidNotEqualTo(String value) {
            addCriterion("o_platformorderId <>", value, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidGreaterThan(String value) {
            addCriterion("o_platformorderId >", value, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidGreaterThanOrEqualTo(String value) {
            addCriterion("o_platformorderId >=", value, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidLessThan(String value) {
            addCriterion("o_platformorderId <", value, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidLessThanOrEqualTo(String value) {
            addCriterion("o_platformorderId <=", value, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidLike(String value) {
            addCriterion("o_platformorderId like", value, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidNotLike(String value) {
            addCriterion("o_platformorderId not like", value, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidIn(List<String> values) {
            addCriterion("o_platformorderId in", values, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidNotIn(List<String> values) {
            addCriterion("o_platformorderId not in", values, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidBetween(String value1, String value2) {
            addCriterion("o_platformorderId between", value1, value2, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPlatformorderidNotBetween(String value1, String value2) {
            addCriterion("o_platformorderId not between", value1, value2, "oPlatformorderid");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNull() {
            addCriterion("o_price is null");
            return (Criteria) this;
        }

        public Criteria andOPriceIsNotNull() {
            addCriterion("o_price is not null");
            return (Criteria) this;
        }

        public Criteria andOPriceEqualTo(Double value) {
            addCriterion("o_price =", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotEqualTo(Double value) {
            addCriterion("o_price <>", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThan(Double value) {
            addCriterion("o_price >", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("o_price >=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThan(Double value) {
            addCriterion("o_price <", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceLessThanOrEqualTo(Double value) {
            addCriterion("o_price <=", value, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceIn(List<Double> values) {
            addCriterion("o_price in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotIn(List<Double> values) {
            addCriterion("o_price not in", values, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceBetween(Double value1, Double value2) {
            addCriterion("o_price between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOPriceNotBetween(Double value1, Double value2) {
            addCriterion("o_price not between", value1, value2, "oPrice");
            return (Criteria) this;
        }

        public Criteria andOStateIsNull() {
            addCriterion("o_state is null");
            return (Criteria) this;
        }

        public Criteria andOStateIsNotNull() {
            addCriterion("o_state is not null");
            return (Criteria) this;
        }

        public Criteria andOStateEqualTo(Integer value) {
            addCriterion("o_state =", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotEqualTo(Integer value) {
            addCriterion("o_state <>", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThan(Integer value) {
            addCriterion("o_state >", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_state >=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThan(Integer value) {
            addCriterion("o_state <", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateLessThanOrEqualTo(Integer value) {
            addCriterion("o_state <=", value, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateIn(List<Integer> values) {
            addCriterion("o_state in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotIn(List<Integer> values) {
            addCriterion("o_state not in", values, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateBetween(Integer value1, Integer value2) {
            addCriterion("o_state between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOStateNotBetween(Integer value1, Integer value2) {
            addCriterion("o_state not between", value1, value2, "oState");
            return (Criteria) this;
        }

        public Criteria andOUseridIsNull() {
            addCriterion("o_userId is null");
            return (Criteria) this;
        }

        public Criteria andOUseridIsNotNull() {
            addCriterion("o_userId is not null");
            return (Criteria) this;
        }

        public Criteria andOUseridEqualTo(Integer value) {
            addCriterion("o_userId =", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridNotEqualTo(Integer value) {
            addCriterion("o_userId <>", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridGreaterThan(Integer value) {
            addCriterion("o_userId >", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_userId >=", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridLessThan(Integer value) {
            addCriterion("o_userId <", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridLessThanOrEqualTo(Integer value) {
            addCriterion("o_userId <=", value, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridIn(List<Integer> values) {
            addCriterion("o_userId in", values, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridNotIn(List<Integer> values) {
            addCriterion("o_userId not in", values, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridBetween(Integer value1, Integer value2) {
            addCriterion("o_userId between", value1, value2, "oUserid");
            return (Criteria) this;
        }

        public Criteria andOUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("o_userId not between", value1, value2, "oUserid");
            return (Criteria) this;
        }

        public Criteria andODateIsNull() {
            addCriterion("o_date is null");
            return (Criteria) this;
        }

        public Criteria andODateIsNotNull() {
            addCriterion("o_date is not null");
            return (Criteria) this;
        }

        public Criteria andODateEqualTo(Date value) {
            addCriterionForJDBCDate("o_date =", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotEqualTo(Date value) {
            addCriterionForJDBCDate("o_date <>", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThan(Date value) {
            addCriterionForJDBCDate("o_date >", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_date >=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThan(Date value) {
            addCriterionForJDBCDate("o_date <", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("o_date <=", value, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateIn(List<Date> values) {
            addCriterionForJDBCDate("o_date in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotIn(List<Date> values) {
            addCriterionForJDBCDate("o_date not in", values, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_date between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andODateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("o_date not between", value1, value2, "oDate");
            return (Criteria) this;
        }

        public Criteria andOMarkIsNull() {
            addCriterion("o_mark is null");
            return (Criteria) this;
        }

        public Criteria andOMarkIsNotNull() {
            addCriterion("o_mark is not null");
            return (Criteria) this;
        }

        public Criteria andOMarkEqualTo(String value) {
            addCriterion("o_mark =", value, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkNotEqualTo(String value) {
            addCriterion("o_mark <>", value, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkGreaterThan(String value) {
            addCriterion("o_mark >", value, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkGreaterThanOrEqualTo(String value) {
            addCriterion("o_mark >=", value, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkLessThan(String value) {
            addCriterion("o_mark <", value, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkLessThanOrEqualTo(String value) {
            addCriterion("o_mark <=", value, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkLike(String value) {
            addCriterion("o_mark like", value, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkNotLike(String value) {
            addCriterion("o_mark not like", value, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkIn(List<String> values) {
            addCriterion("o_mark in", values, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkNotIn(List<String> values) {
            addCriterion("o_mark not in", values, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkBetween(String value1, String value2) {
            addCriterion("o_mark between", value1, value2, "oMark");
            return (Criteria) this;
        }

        public Criteria andOMarkNotBetween(String value1, String value2) {
            addCriterion("o_mark not between", value1, value2, "oMark");
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