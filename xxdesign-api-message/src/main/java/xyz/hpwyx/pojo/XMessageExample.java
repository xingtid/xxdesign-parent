package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XMessageExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMSendIdIsNull() {
            addCriterion("m_send_id is null");
            return (Criteria) this;
        }

        public Criteria andMSendIdIsNotNull() {
            addCriterion("m_send_id is not null");
            return (Criteria) this;
        }

        public Criteria andMSendIdEqualTo(Integer value) {
            addCriterion("m_send_id =", value, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMSendIdNotEqualTo(Integer value) {
            addCriterion("m_send_id <>", value, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMSendIdGreaterThan(Integer value) {
            addCriterion("m_send_id >", value, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMSendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_send_id >=", value, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMSendIdLessThan(Integer value) {
            addCriterion("m_send_id <", value, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMSendIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_send_id <=", value, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMSendIdIn(List<Integer> values) {
            addCriterion("m_send_id in", values, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMSendIdNotIn(List<Integer> values) {
            addCriterion("m_send_id not in", values, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMSendIdBetween(Integer value1, Integer value2) {
            addCriterion("m_send_id between", value1, value2, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMSendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_send_id not between", value1, value2, "mSendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdIsNull() {
            addCriterion("m_besend_id is null");
            return (Criteria) this;
        }

        public Criteria andMBesendIdIsNotNull() {
            addCriterion("m_besend_id is not null");
            return (Criteria) this;
        }

        public Criteria andMBesendIdEqualTo(Integer value) {
            addCriterion("m_besend_id =", value, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdNotEqualTo(Integer value) {
            addCriterion("m_besend_id <>", value, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdGreaterThan(Integer value) {
            addCriterion("m_besend_id >", value, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_besend_id >=", value, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdLessThan(Integer value) {
            addCriterion("m_besend_id <", value, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_besend_id <=", value, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdIn(List<Integer> values) {
            addCriterion("m_besend_id in", values, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdNotIn(List<Integer> values) {
            addCriterion("m_besend_id not in", values, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdBetween(Integer value1, Integer value2) {
            addCriterion("m_besend_id between", value1, value2, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMBesendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_besend_id not between", value1, value2, "mBesendId");
            return (Criteria) this;
        }

        public Criteria andMTitleIsNull() {
            addCriterion("m_title is null");
            return (Criteria) this;
        }

        public Criteria andMTitleIsNotNull() {
            addCriterion("m_title is not null");
            return (Criteria) this;
        }

        public Criteria andMTitleEqualTo(String value) {
            addCriterion("m_title =", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleNotEqualTo(String value) {
            addCriterion("m_title <>", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleGreaterThan(String value) {
            addCriterion("m_title >", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleGreaterThanOrEqualTo(String value) {
            addCriterion("m_title >=", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleLessThan(String value) {
            addCriterion("m_title <", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleLessThanOrEqualTo(String value) {
            addCriterion("m_title <=", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleLike(String value) {
            addCriterion("m_title like", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleNotLike(String value) {
            addCriterion("m_title not like", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleIn(List<String> values) {
            addCriterion("m_title in", values, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleNotIn(List<String> values) {
            addCriterion("m_title not in", values, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleBetween(String value1, String value2) {
            addCriterion("m_title between", value1, value2, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleNotBetween(String value1, String value2) {
            addCriterion("m_title not between", value1, value2, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMContentIsNull() {
            addCriterion("m_content is null");
            return (Criteria) this;
        }

        public Criteria andMContentIsNotNull() {
            addCriterion("m_content is not null");
            return (Criteria) this;
        }

        public Criteria andMContentEqualTo(String value) {
            addCriterion("m_content =", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotEqualTo(String value) {
            addCriterion("m_content <>", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentGreaterThan(String value) {
            addCriterion("m_content >", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentGreaterThanOrEqualTo(String value) {
            addCriterion("m_content >=", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLessThan(String value) {
            addCriterion("m_content <", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLessThanOrEqualTo(String value) {
            addCriterion("m_content <=", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLike(String value) {
            addCriterion("m_content like", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotLike(String value) {
            addCriterion("m_content not like", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentIn(List<String> values) {
            addCriterion("m_content in", values, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotIn(List<String> values) {
            addCriterion("m_content not in", values, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentBetween(String value1, String value2) {
            addCriterion("m_content between", value1, value2, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotBetween(String value1, String value2) {
            addCriterion("m_content not between", value1, value2, "mContent");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("m_time is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("m_time is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(Date value) {
            addCriterion("m_time =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(Date value) {
            addCriterion("m_time <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(Date value) {
            addCriterion("m_time >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("m_time >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(Date value) {
            addCriterion("m_time <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(Date value) {
            addCriterion("m_time <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<Date> values) {
            addCriterion("m_time in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<Date> values) {
            addCriterion("m_time not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(Date value1, Date value2) {
            addCriterion("m_time between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(Date value1, Date value2) {
            addCriterion("m_time not between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNull() {
            addCriterion("m_type is null");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNotNull() {
            addCriterion("m_type is not null");
            return (Criteria) this;
        }

        public Criteria andMTypeEqualTo(Integer value) {
            addCriterion("m_type =", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotEqualTo(Integer value) {
            addCriterion("m_type <>", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThan(Integer value) {
            addCriterion("m_type >", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_type >=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThan(Integer value) {
            addCriterion("m_type <", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThanOrEqualTo(Integer value) {
            addCriterion("m_type <=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeIn(List<Integer> values) {
            addCriterion("m_type in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotIn(List<Integer> values) {
            addCriterion("m_type not in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeBetween(Integer value1, Integer value2) {
            addCriterion("m_type between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("m_type not between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMParentIsNull() {
            addCriterion("m_parent is null");
            return (Criteria) this;
        }

        public Criteria andMParentIsNotNull() {
            addCriterion("m_parent is not null");
            return (Criteria) this;
        }

        public Criteria andMParentEqualTo(Integer value) {
            addCriterion("m_parent =", value, "mParent");
            return (Criteria) this;
        }

        public Criteria andMParentNotEqualTo(Integer value) {
            addCriterion("m_parent <>", value, "mParent");
            return (Criteria) this;
        }

        public Criteria andMParentGreaterThan(Integer value) {
            addCriterion("m_parent >", value, "mParent");
            return (Criteria) this;
        }

        public Criteria andMParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_parent >=", value, "mParent");
            return (Criteria) this;
        }

        public Criteria andMParentLessThan(Integer value) {
            addCriterion("m_parent <", value, "mParent");
            return (Criteria) this;
        }

        public Criteria andMParentLessThanOrEqualTo(Integer value) {
            addCriterion("m_parent <=", value, "mParent");
            return (Criteria) this;
        }

        public Criteria andMParentIn(List<Integer> values) {
            addCriterion("m_parent in", values, "mParent");
            return (Criteria) this;
        }

        public Criteria andMParentNotIn(List<Integer> values) {
            addCriterion("m_parent not in", values, "mParent");
            return (Criteria) this;
        }

        public Criteria andMParentBetween(Integer value1, Integer value2) {
            addCriterion("m_parent between", value1, value2, "mParent");
            return (Criteria) this;
        }

        public Criteria andMParentNotBetween(Integer value1, Integer value2) {
            addCriterion("m_parent not between", value1, value2, "mParent");
            return (Criteria) this;
        }

        public Criteria andMMeeIsNull() {
            addCriterion("m_mee is null");
            return (Criteria) this;
        }

        public Criteria andMMeeIsNotNull() {
            addCriterion("m_mee is not null");
            return (Criteria) this;
        }

        public Criteria andMMeeEqualTo(String value) {
            addCriterion("m_mee =", value, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeNotEqualTo(String value) {
            addCriterion("m_mee <>", value, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeGreaterThan(String value) {
            addCriterion("m_mee >", value, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeGreaterThanOrEqualTo(String value) {
            addCriterion("m_mee >=", value, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeLessThan(String value) {
            addCriterion("m_mee <", value, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeLessThanOrEqualTo(String value) {
            addCriterion("m_mee <=", value, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeLike(String value) {
            addCriterion("m_mee like", value, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeNotLike(String value) {
            addCriterion("m_mee not like", value, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeIn(List<String> values) {
            addCriterion("m_mee in", values, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeNotIn(List<String> values) {
            addCriterion("m_mee not in", values, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeBetween(String value1, String value2) {
            addCriterion("m_mee between", value1, value2, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMeeNotBetween(String value1, String value2) {
            addCriterion("m_mee not between", value1, value2, "mMee");
            return (Criteria) this;
        }

        public Criteria andMMarkIsNull() {
            addCriterion("m_mark is null");
            return (Criteria) this;
        }

        public Criteria andMMarkIsNotNull() {
            addCriterion("m_mark is not null");
            return (Criteria) this;
        }

        public Criteria andMMarkEqualTo(String value) {
            addCriterion("m_mark =", value, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkNotEqualTo(String value) {
            addCriterion("m_mark <>", value, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkGreaterThan(String value) {
            addCriterion("m_mark >", value, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkGreaterThanOrEqualTo(String value) {
            addCriterion("m_mark >=", value, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkLessThan(String value) {
            addCriterion("m_mark <", value, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkLessThanOrEqualTo(String value) {
            addCriterion("m_mark <=", value, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkLike(String value) {
            addCriterion("m_mark like", value, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkNotLike(String value) {
            addCriterion("m_mark not like", value, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkIn(List<String> values) {
            addCriterion("m_mark in", values, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkNotIn(List<String> values) {
            addCriterion("m_mark not in", values, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkBetween(String value1, String value2) {
            addCriterion("m_mark between", value1, value2, "mMark");
            return (Criteria) this;
        }

        public Criteria andMMarkNotBetween(String value1, String value2) {
            addCriterion("m_mark not between", value1, value2, "mMark");
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