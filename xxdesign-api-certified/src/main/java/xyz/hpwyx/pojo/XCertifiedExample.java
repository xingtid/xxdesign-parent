package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XCertifiedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XCertifiedExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRNameIsNull() {
            addCriterion("r_name is null");
            return (Criteria) this;
        }

        public Criteria andRNameIsNotNull() {
            addCriterion("r_name is not null");
            return (Criteria) this;
        }

        public Criteria andRNameEqualTo(String value) {
            addCriterion("r_name =", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotEqualTo(String value) {
            addCriterion("r_name <>", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThan(String value) {
            addCriterion("r_name >", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThanOrEqualTo(String value) {
            addCriterion("r_name >=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThan(String value) {
            addCriterion("r_name <", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThanOrEqualTo(String value) {
            addCriterion("r_name <=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLike(String value) {
            addCriterion("r_name like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotLike(String value) {
            addCriterion("r_name not like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameIn(List<String> values) {
            addCriterion("r_name in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotIn(List<String> values) {
            addCriterion("r_name not in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameBetween(String value1, String value2) {
            addCriterion("r_name between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotBetween(String value1, String value2) {
            addCriterion("r_name not between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNull() {
            addCriterion("r_time is null");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNotNull() {
            addCriterion("r_time is not null");
            return (Criteria) this;
        }

        public Criteria andRTimeEqualTo(Date value) {
            addCriterion("r_time =", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotEqualTo(Date value) {
            addCriterion("r_time <>", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThan(Date value) {
            addCriterion("r_time >", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("r_time >=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThan(Date value) {
            addCriterion("r_time <", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThanOrEqualTo(Date value) {
            addCriterion("r_time <=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeIn(List<Date> values) {
            addCriterion("r_time in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotIn(List<Date> values) {
            addCriterion("r_time not in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeBetween(Date value1, Date value2) {
            addCriterion("r_time between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotBetween(Date value1, Date value2) {
            addCriterion("r_time not between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNull() {
            addCriterion("r_type is null");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNotNull() {
            addCriterion("r_type is not null");
            return (Criteria) this;
        }

        public Criteria andRTypeEqualTo(Integer value) {
            addCriterion("r_type =", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotEqualTo(Integer value) {
            addCriterion("r_type <>", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThan(Integer value) {
            addCriterion("r_type >", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_type >=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThan(Integer value) {
            addCriterion("r_type <", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThanOrEqualTo(Integer value) {
            addCriterion("r_type <=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeIn(List<Integer> values) {
            addCriterion("r_type in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotIn(List<Integer> values) {
            addCriterion("r_type not in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeBetween(Integer value1, Integer value2) {
            addCriterion("r_type between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("r_type not between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRMarkIsNull() {
            addCriterion("r_mark is null");
            return (Criteria) this;
        }

        public Criteria andRMarkIsNotNull() {
            addCriterion("r_mark is not null");
            return (Criteria) this;
        }

        public Criteria andRMarkEqualTo(String value) {
            addCriterion("r_mark =", value, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkNotEqualTo(String value) {
            addCriterion("r_mark <>", value, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkGreaterThan(String value) {
            addCriterion("r_mark >", value, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkGreaterThanOrEqualTo(String value) {
            addCriterion("r_mark >=", value, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkLessThan(String value) {
            addCriterion("r_mark <", value, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkLessThanOrEqualTo(String value) {
            addCriterion("r_mark <=", value, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkLike(String value) {
            addCriterion("r_mark like", value, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkNotLike(String value) {
            addCriterion("r_mark not like", value, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkIn(List<String> values) {
            addCriterion("r_mark in", values, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkNotIn(List<String> values) {
            addCriterion("r_mark not in", values, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkBetween(String value1, String value2) {
            addCriterion("r_mark between", value1, value2, "rMark");
            return (Criteria) this;
        }

        public Criteria andRMarkNotBetween(String value1, String value2) {
            addCriterion("r_mark not between", value1, value2, "rMark");
            return (Criteria) this;
        }

        public Criteria andRImgIsNull() {
            addCriterion("r_img is null");
            return (Criteria) this;
        }

        public Criteria andRImgIsNotNull() {
            addCriterion("r_img is not null");
            return (Criteria) this;
        }

        public Criteria andRImgEqualTo(String value) {
            addCriterion("r_img =", value, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgNotEqualTo(String value) {
            addCriterion("r_img <>", value, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgGreaterThan(String value) {
            addCriterion("r_img >", value, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgGreaterThanOrEqualTo(String value) {
            addCriterion("r_img >=", value, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgLessThan(String value) {
            addCriterion("r_img <", value, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgLessThanOrEqualTo(String value) {
            addCriterion("r_img <=", value, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgLike(String value) {
            addCriterion("r_img like", value, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgNotLike(String value) {
            addCriterion("r_img not like", value, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgIn(List<String> values) {
            addCriterion("r_img in", values, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgNotIn(List<String> values) {
            addCriterion("r_img not in", values, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgBetween(String value1, String value2) {
            addCriterion("r_img between", value1, value2, "rImg");
            return (Criteria) this;
        }

        public Criteria andRImgNotBetween(String value1, String value2) {
            addCriterion("r_img not between", value1, value2, "rImg");
            return (Criteria) this;
        }

        public Criteria andRExIsNull() {
            addCriterion("r_ex is null");
            return (Criteria) this;
        }

        public Criteria andRExIsNotNull() {
            addCriterion("r_ex is not null");
            return (Criteria) this;
        }

        public Criteria andRExEqualTo(String value) {
            addCriterion("r_ex =", value, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExNotEqualTo(String value) {
            addCriterion("r_ex <>", value, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExGreaterThan(String value) {
            addCriterion("r_ex >", value, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExGreaterThanOrEqualTo(String value) {
            addCriterion("r_ex >=", value, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExLessThan(String value) {
            addCriterion("r_ex <", value, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExLessThanOrEqualTo(String value) {
            addCriterion("r_ex <=", value, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExLike(String value) {
            addCriterion("r_ex like", value, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExNotLike(String value) {
            addCriterion("r_ex not like", value, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExIn(List<String> values) {
            addCriterion("r_ex in", values, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExNotIn(List<String> values) {
            addCriterion("r_ex not in", values, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExBetween(String value1, String value2) {
            addCriterion("r_ex between", value1, value2, "rEx");
            return (Criteria) this;
        }

        public Criteria andRExNotBetween(String value1, String value2) {
            addCriterion("r_ex not between", value1, value2, "rEx");
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