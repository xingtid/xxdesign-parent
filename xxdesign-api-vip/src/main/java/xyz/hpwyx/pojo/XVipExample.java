package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XVipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XVipExample() {
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

        public Criteria andVIdIsNull() {
            addCriterion("v_id is null");
            return (Criteria) this;
        }

        public Criteria andVIdIsNotNull() {
            addCriterion("v_id is not null");
            return (Criteria) this;
        }

        public Criteria andVIdEqualTo(String value) {
            addCriterion("v_id =", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotEqualTo(String value) {
            addCriterion("v_id <>", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThan(String value) {
            addCriterion("v_id >", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdGreaterThanOrEqualTo(String value) {
            addCriterion("v_id >=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThan(String value) {
            addCriterion("v_id <", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLessThanOrEqualTo(String value) {
            addCriterion("v_id <=", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdLike(String value) {
            addCriterion("v_id like", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotLike(String value) {
            addCriterion("v_id not like", value, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdIn(List<String> values) {
            addCriterion("v_id in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotIn(List<String> values) {
            addCriterion("v_id not in", values, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdBetween(String value1, String value2) {
            addCriterion("v_id between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVIdNotBetween(String value1, String value2) {
            addCriterion("v_id not between", value1, value2, "vId");
            return (Criteria) this;
        }

        public Criteria andVUidIsNull() {
            addCriterion("v_uid is null");
            return (Criteria) this;
        }

        public Criteria andVUidIsNotNull() {
            addCriterion("v_uid is not null");
            return (Criteria) this;
        }

        public Criteria andVUidEqualTo(Integer value) {
            addCriterion("v_uid =", value, "vUid");
            return (Criteria) this;
        }

        public Criteria andVUidNotEqualTo(Integer value) {
            addCriterion("v_uid <>", value, "vUid");
            return (Criteria) this;
        }

        public Criteria andVUidGreaterThan(Integer value) {
            addCriterion("v_uid >", value, "vUid");
            return (Criteria) this;
        }

        public Criteria andVUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("v_uid >=", value, "vUid");
            return (Criteria) this;
        }

        public Criteria andVUidLessThan(Integer value) {
            addCriterion("v_uid <", value, "vUid");
            return (Criteria) this;
        }

        public Criteria andVUidLessThanOrEqualTo(Integer value) {
            addCriterion("v_uid <=", value, "vUid");
            return (Criteria) this;
        }

        public Criteria andVUidIn(List<Integer> values) {
            addCriterion("v_uid in", values, "vUid");
            return (Criteria) this;
        }

        public Criteria andVUidNotIn(List<Integer> values) {
            addCriterion("v_uid not in", values, "vUid");
            return (Criteria) this;
        }

        public Criteria andVUidBetween(Integer value1, Integer value2) {
            addCriterion("v_uid between", value1, value2, "vUid");
            return (Criteria) this;
        }

        public Criteria andVUidNotBetween(Integer value1, Integer value2) {
            addCriterion("v_uid not between", value1, value2, "vUid");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftIsNull() {
            addCriterion("v_time_left is null");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftIsNotNull() {
            addCriterion("v_time_left is not null");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftEqualTo(String value) {
            addCriterion("v_time_left =", value, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftNotEqualTo(String value) {
            addCriterion("v_time_left <>", value, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftGreaterThan(String value) {
            addCriterion("v_time_left >", value, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftGreaterThanOrEqualTo(String value) {
            addCriterion("v_time_left >=", value, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftLessThan(String value) {
            addCriterion("v_time_left <", value, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftLessThanOrEqualTo(String value) {
            addCriterion("v_time_left <=", value, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftLike(String value) {
            addCriterion("v_time_left like", value, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftNotLike(String value) {
            addCriterion("v_time_left not like", value, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftIn(List<String> values) {
            addCriterion("v_time_left in", values, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftNotIn(List<String> values) {
            addCriterion("v_time_left not in", values, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftBetween(String value1, String value2) {
            addCriterion("v_time_left between", value1, value2, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeLeftNotBetween(String value1, String value2) {
            addCriterion("v_time_left not between", value1, value2, "vTimeLeft");
            return (Criteria) this;
        }

        public Criteria andVTimeIsNull() {
            addCriterion("v_time is null");
            return (Criteria) this;
        }

        public Criteria andVTimeIsNotNull() {
            addCriterion("v_time is not null");
            return (Criteria) this;
        }

        public Criteria andVTimeEqualTo(Date value) {
            addCriterion("v_time =", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeNotEqualTo(Date value) {
            addCriterion("v_time <>", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeGreaterThan(Date value) {
            addCriterion("v_time >", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("v_time >=", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeLessThan(Date value) {
            addCriterion("v_time <", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeLessThanOrEqualTo(Date value) {
            addCriterion("v_time <=", value, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeIn(List<Date> values) {
            addCriterion("v_time in", values, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeNotIn(List<Date> values) {
            addCriterion("v_time not in", values, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeBetween(Date value1, Date value2) {
            addCriterion("v_time between", value1, value2, "vTime");
            return (Criteria) this;
        }

        public Criteria andVTimeNotBetween(Date value1, Date value2) {
            addCriterion("v_time not between", value1, value2, "vTime");
            return (Criteria) this;
        }

        public Criteria andVCodeIsNull() {
            addCriterion("v_code is null");
            return (Criteria) this;
        }

        public Criteria andVCodeIsNotNull() {
            addCriterion("v_code is not null");
            return (Criteria) this;
        }

        public Criteria andVCodeEqualTo(String value) {
            addCriterion("v_code =", value, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeNotEqualTo(String value) {
            addCriterion("v_code <>", value, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeGreaterThan(String value) {
            addCriterion("v_code >", value, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeGreaterThanOrEqualTo(String value) {
            addCriterion("v_code >=", value, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeLessThan(String value) {
            addCriterion("v_code <", value, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeLessThanOrEqualTo(String value) {
            addCriterion("v_code <=", value, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeLike(String value) {
            addCriterion("v_code like", value, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeNotLike(String value) {
            addCriterion("v_code not like", value, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeIn(List<String> values) {
            addCriterion("v_code in", values, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeNotIn(List<String> values) {
            addCriterion("v_code not in", values, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeBetween(String value1, String value2) {
            addCriterion("v_code between", value1, value2, "vCode");
            return (Criteria) this;
        }

        public Criteria andVCodeNotBetween(String value1, String value2) {
            addCriterion("v_code not between", value1, value2, "vCode");
            return (Criteria) this;
        }

        public Criteria andVLevelIsNull() {
            addCriterion("v_level is null");
            return (Criteria) this;
        }

        public Criteria andVLevelIsNotNull() {
            addCriterion("v_level is not null");
            return (Criteria) this;
        }

        public Criteria andVLevelEqualTo(Integer value) {
            addCriterion("v_level =", value, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVLevelNotEqualTo(Integer value) {
            addCriterion("v_level <>", value, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVLevelGreaterThan(Integer value) {
            addCriterion("v_level >", value, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("v_level >=", value, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVLevelLessThan(Integer value) {
            addCriterion("v_level <", value, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVLevelLessThanOrEqualTo(Integer value) {
            addCriterion("v_level <=", value, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVLevelIn(List<Integer> values) {
            addCriterion("v_level in", values, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVLevelNotIn(List<Integer> values) {
            addCriterion("v_level not in", values, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVLevelBetween(Integer value1, Integer value2) {
            addCriterion("v_level between", value1, value2, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("v_level not between", value1, value2, "vLevel");
            return (Criteria) this;
        }

        public Criteria andVScoreIsNull() {
            addCriterion("v_score is null");
            return (Criteria) this;
        }

        public Criteria andVScoreIsNotNull() {
            addCriterion("v_score is not null");
            return (Criteria) this;
        }

        public Criteria andVScoreEqualTo(Integer value) {
            addCriterion("v_score =", value, "vScore");
            return (Criteria) this;
        }

        public Criteria andVScoreNotEqualTo(Integer value) {
            addCriterion("v_score <>", value, "vScore");
            return (Criteria) this;
        }

        public Criteria andVScoreGreaterThan(Integer value) {
            addCriterion("v_score >", value, "vScore");
            return (Criteria) this;
        }

        public Criteria andVScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("v_score >=", value, "vScore");
            return (Criteria) this;
        }

        public Criteria andVScoreLessThan(Integer value) {
            addCriterion("v_score <", value, "vScore");
            return (Criteria) this;
        }

        public Criteria andVScoreLessThanOrEqualTo(Integer value) {
            addCriterion("v_score <=", value, "vScore");
            return (Criteria) this;
        }

        public Criteria andVScoreIn(List<Integer> values) {
            addCriterion("v_score in", values, "vScore");
            return (Criteria) this;
        }

        public Criteria andVScoreNotIn(List<Integer> values) {
            addCriterion("v_score not in", values, "vScore");
            return (Criteria) this;
        }

        public Criteria andVScoreBetween(Integer value1, Integer value2) {
            addCriterion("v_score between", value1, value2, "vScore");
            return (Criteria) this;
        }

        public Criteria andVScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("v_score not between", value1, value2, "vScore");
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