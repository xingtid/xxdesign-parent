package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XIndexExample() {
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

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(Integer value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(Integer value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(Integer value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(Integer value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<Integer> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<Integer> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(Integer value1, Integer value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andINameIsNull() {
            addCriterion("i_name is null");
            return (Criteria) this;
        }

        public Criteria andINameIsNotNull() {
            addCriterion("i_name is not null");
            return (Criteria) this;
        }

        public Criteria andINameEqualTo(String value) {
            addCriterion("i_name =", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotEqualTo(String value) {
            addCriterion("i_name <>", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameGreaterThan(String value) {
            addCriterion("i_name >", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameGreaterThanOrEqualTo(String value) {
            addCriterion("i_name >=", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLessThan(String value) {
            addCriterion("i_name <", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLessThanOrEqualTo(String value) {
            addCriterion("i_name <=", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameLike(String value) {
            addCriterion("i_name like", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotLike(String value) {
            addCriterion("i_name not like", value, "iName");
            return (Criteria) this;
        }

        public Criteria andINameIn(List<String> values) {
            addCriterion("i_name in", values, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotIn(List<String> values) {
            addCriterion("i_name not in", values, "iName");
            return (Criteria) this;
        }

        public Criteria andINameBetween(String value1, String value2) {
            addCriterion("i_name between", value1, value2, "iName");
            return (Criteria) this;
        }

        public Criteria andINameNotBetween(String value1, String value2) {
            addCriterion("i_name not between", value1, value2, "iName");
            return (Criteria) this;
        }

        public Criteria andITypeIsNull() {
            addCriterion("i_type is null");
            return (Criteria) this;
        }

        public Criteria andITypeIsNotNull() {
            addCriterion("i_type is not null");
            return (Criteria) this;
        }

        public Criteria andITypeEqualTo(String value) {
            addCriterion("i_type =", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeNotEqualTo(String value) {
            addCriterion("i_type <>", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeGreaterThan(String value) {
            addCriterion("i_type >", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeGreaterThanOrEqualTo(String value) {
            addCriterion("i_type >=", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeLessThan(String value) {
            addCriterion("i_type <", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeLessThanOrEqualTo(String value) {
            addCriterion("i_type <=", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeLike(String value) {
            addCriterion("i_type like", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeNotLike(String value) {
            addCriterion("i_type not like", value, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeIn(List<String> values) {
            addCriterion("i_type in", values, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeNotIn(List<String> values) {
            addCriterion("i_type not in", values, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeBetween(String value1, String value2) {
            addCriterion("i_type between", value1, value2, "iType");
            return (Criteria) this;
        }

        public Criteria andITypeNotBetween(String value1, String value2) {
            addCriterion("i_type not between", value1, value2, "iType");
            return (Criteria) this;
        }

        public Criteria andIImgIsNull() {
            addCriterion("i_img is null");
            return (Criteria) this;
        }

        public Criteria andIImgIsNotNull() {
            addCriterion("i_img is not null");
            return (Criteria) this;
        }

        public Criteria andIImgEqualTo(String value) {
            addCriterion("i_img =", value, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgNotEqualTo(String value) {
            addCriterion("i_img <>", value, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgGreaterThan(String value) {
            addCriterion("i_img >", value, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgGreaterThanOrEqualTo(String value) {
            addCriterion("i_img >=", value, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgLessThan(String value) {
            addCriterion("i_img <", value, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgLessThanOrEqualTo(String value) {
            addCriterion("i_img <=", value, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgLike(String value) {
            addCriterion("i_img like", value, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgNotLike(String value) {
            addCriterion("i_img not like", value, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgIn(List<String> values) {
            addCriterion("i_img in", values, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgNotIn(List<String> values) {
            addCriterion("i_img not in", values, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgBetween(String value1, String value2) {
            addCriterion("i_img between", value1, value2, "iImg");
            return (Criteria) this;
        }

        public Criteria andIImgNotBetween(String value1, String value2) {
            addCriterion("i_img not between", value1, value2, "iImg");
            return (Criteria) this;
        }

        public Criteria andIParentIsNull() {
            addCriterion("i_parent is null");
            return (Criteria) this;
        }

        public Criteria andIParentIsNotNull() {
            addCriterion("i_parent is not null");
            return (Criteria) this;
        }

        public Criteria andIParentEqualTo(Integer value) {
            addCriterion("i_parent =", value, "iParent");
            return (Criteria) this;
        }

        public Criteria andIParentNotEqualTo(Integer value) {
            addCriterion("i_parent <>", value, "iParent");
            return (Criteria) this;
        }

        public Criteria andIParentGreaterThan(Integer value) {
            addCriterion("i_parent >", value, "iParent");
            return (Criteria) this;
        }

        public Criteria andIParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_parent >=", value, "iParent");
            return (Criteria) this;
        }

        public Criteria andIParentLessThan(Integer value) {
            addCriterion("i_parent <", value, "iParent");
            return (Criteria) this;
        }

        public Criteria andIParentLessThanOrEqualTo(Integer value) {
            addCriterion("i_parent <=", value, "iParent");
            return (Criteria) this;
        }

        public Criteria andIParentIn(List<Integer> values) {
            addCriterion("i_parent in", values, "iParent");
            return (Criteria) this;
        }

        public Criteria andIParentNotIn(List<Integer> values) {
            addCriterion("i_parent not in", values, "iParent");
            return (Criteria) this;
        }

        public Criteria andIParentBetween(Integer value1, Integer value2) {
            addCriterion("i_parent between", value1, value2, "iParent");
            return (Criteria) this;
        }

        public Criteria andIParentNotBetween(Integer value1, Integer value2) {
            addCriterion("i_parent not between", value1, value2, "iParent");
            return (Criteria) this;
        }

        public Criteria andITimeIsNull() {
            addCriterion("i_time is null");
            return (Criteria) this;
        }

        public Criteria andITimeIsNotNull() {
            addCriterion("i_time is not null");
            return (Criteria) this;
        }

        public Criteria andITimeEqualTo(Date value) {
            addCriterion("i_time =", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeNotEqualTo(Date value) {
            addCriterion("i_time <>", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeGreaterThan(Date value) {
            addCriterion("i_time >", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeGreaterThanOrEqualTo(Date value) {
            addCriterion("i_time >=", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeLessThan(Date value) {
            addCriterion("i_time <", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeLessThanOrEqualTo(Date value) {
            addCriterion("i_time <=", value, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeIn(List<Date> values) {
            addCriterion("i_time in", values, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeNotIn(List<Date> values) {
            addCriterion("i_time not in", values, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeBetween(Date value1, Date value2) {
            addCriterion("i_time between", value1, value2, "iTime");
            return (Criteria) this;
        }

        public Criteria andITimeNotBetween(Date value1, Date value2) {
            addCriterion("i_time not between", value1, value2, "iTime");
            return (Criteria) this;
        }

        public Criteria andIPathIsNull() {
            addCriterion("i_path is null");
            return (Criteria) this;
        }

        public Criteria andIPathIsNotNull() {
            addCriterion("i_path is not null");
            return (Criteria) this;
        }

        public Criteria andIPathEqualTo(String value) {
            addCriterion("i_path =", value, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathNotEqualTo(String value) {
            addCriterion("i_path <>", value, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathGreaterThan(String value) {
            addCriterion("i_path >", value, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathGreaterThanOrEqualTo(String value) {
            addCriterion("i_path >=", value, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathLessThan(String value) {
            addCriterion("i_path <", value, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathLessThanOrEqualTo(String value) {
            addCriterion("i_path <=", value, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathLike(String value) {
            addCriterion("i_path like", value, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathNotLike(String value) {
            addCriterion("i_path not like", value, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathIn(List<String> values) {
            addCriterion("i_path in", values, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathNotIn(List<String> values) {
            addCriterion("i_path not in", values, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathBetween(String value1, String value2) {
            addCriterion("i_path between", value1, value2, "iPath");
            return (Criteria) this;
        }

        public Criteria andIPathNotBetween(String value1, String value2) {
            addCriterion("i_path not between", value1, value2, "iPath");
            return (Criteria) this;
        }

        public Criteria andIUrlIsNull() {
            addCriterion("i_url is null");
            return (Criteria) this;
        }

        public Criteria andIUrlIsNotNull() {
            addCriterion("i_url is not null");
            return (Criteria) this;
        }

        public Criteria andIUrlEqualTo(String value) {
            addCriterion("i_url =", value, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlNotEqualTo(String value) {
            addCriterion("i_url <>", value, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlGreaterThan(String value) {
            addCriterion("i_url >", value, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlGreaterThanOrEqualTo(String value) {
            addCriterion("i_url >=", value, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlLessThan(String value) {
            addCriterion("i_url <", value, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlLessThanOrEqualTo(String value) {
            addCriterion("i_url <=", value, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlLike(String value) {
            addCriterion("i_url like", value, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlNotLike(String value) {
            addCriterion("i_url not like", value, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlIn(List<String> values) {
            addCriterion("i_url in", values, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlNotIn(List<String> values) {
            addCriterion("i_url not in", values, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlBetween(String value1, String value2) {
            addCriterion("i_url between", value1, value2, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIUrlNotBetween(String value1, String value2) {
            addCriterion("i_url not between", value1, value2, "iUrl");
            return (Criteria) this;
        }

        public Criteria andIMarkIsNull() {
            addCriterion("i_mark is null");
            return (Criteria) this;
        }

        public Criteria andIMarkIsNotNull() {
            addCriterion("i_mark is not null");
            return (Criteria) this;
        }

        public Criteria andIMarkEqualTo(String value) {
            addCriterion("i_mark =", value, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkNotEqualTo(String value) {
            addCriterion("i_mark <>", value, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkGreaterThan(String value) {
            addCriterion("i_mark >", value, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkGreaterThanOrEqualTo(String value) {
            addCriterion("i_mark >=", value, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkLessThan(String value) {
            addCriterion("i_mark <", value, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkLessThanOrEqualTo(String value) {
            addCriterion("i_mark <=", value, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkLike(String value) {
            addCriterion("i_mark like", value, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkNotLike(String value) {
            addCriterion("i_mark not like", value, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkIn(List<String> values) {
            addCriterion("i_mark in", values, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkNotIn(List<String> values) {
            addCriterion("i_mark not in", values, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkBetween(String value1, String value2) {
            addCriterion("i_mark between", value1, value2, "iMark");
            return (Criteria) this;
        }

        public Criteria andIMarkNotBetween(String value1, String value2) {
            addCriterion("i_mark not between", value1, value2, "iMark");
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