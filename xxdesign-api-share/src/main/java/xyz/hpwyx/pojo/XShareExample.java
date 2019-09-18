package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XShareExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSContentIsNull() {
            addCriterion("s_content is null");
            return (Criteria) this;
        }

        public Criteria andSContentIsNotNull() {
            addCriterion("s_content is not null");
            return (Criteria) this;
        }

        public Criteria andSContentEqualTo(String value) {
            addCriterion("s_content =", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentNotEqualTo(String value) {
            addCriterion("s_content <>", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentGreaterThan(String value) {
            addCriterion("s_content >", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentGreaterThanOrEqualTo(String value) {
            addCriterion("s_content >=", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentLessThan(String value) {
            addCriterion("s_content <", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentLessThanOrEqualTo(String value) {
            addCriterion("s_content <=", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentLike(String value) {
            addCriterion("s_content like", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentNotLike(String value) {
            addCriterion("s_content not like", value, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentIn(List<String> values) {
            addCriterion("s_content in", values, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentNotIn(List<String> values) {
            addCriterion("s_content not in", values, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentBetween(String value1, String value2) {
            addCriterion("s_content between", value1, value2, "sContent");
            return (Criteria) this;
        }

        public Criteria andSContentNotBetween(String value1, String value2) {
            addCriterion("s_content not between", value1, value2, "sContent");
            return (Criteria) this;
        }

        public Criteria andSAnthIdIsNull() {
            addCriterion("s_anth_id is null");
            return (Criteria) this;
        }

        public Criteria andSAnthIdIsNotNull() {
            addCriterion("s_anth_id is not null");
            return (Criteria) this;
        }

        public Criteria andSAnthIdEqualTo(Integer value) {
            addCriterion("s_anth_id =", value, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSAnthIdNotEqualTo(Integer value) {
            addCriterion("s_anth_id <>", value, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSAnthIdGreaterThan(Integer value) {
            addCriterion("s_anth_id >", value, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSAnthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_anth_id >=", value, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSAnthIdLessThan(Integer value) {
            addCriterion("s_anth_id <", value, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSAnthIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_anth_id <=", value, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSAnthIdIn(List<Integer> values) {
            addCriterion("s_anth_id in", values, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSAnthIdNotIn(List<Integer> values) {
            addCriterion("s_anth_id not in", values, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSAnthIdBetween(Integer value1, Integer value2) {
            addCriterion("s_anth_id between", value1, value2, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSAnthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_anth_id not between", value1, value2, "sAnthId");
            return (Criteria) this;
        }

        public Criteria andSGetClickIsNull() {
            addCriterion("s_get_click is null");
            return (Criteria) this;
        }

        public Criteria andSGetClickIsNotNull() {
            addCriterion("s_get_click is not null");
            return (Criteria) this;
        }

        public Criteria andSGetClickEqualTo(Integer value) {
            addCriterion("s_get_click =", value, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSGetClickNotEqualTo(Integer value) {
            addCriterion("s_get_click <>", value, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSGetClickGreaterThan(Integer value) {
            addCriterion("s_get_click >", value, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSGetClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_get_click >=", value, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSGetClickLessThan(Integer value) {
            addCriterion("s_get_click <", value, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSGetClickLessThanOrEqualTo(Integer value) {
            addCriterion("s_get_click <=", value, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSGetClickIn(List<Integer> values) {
            addCriterion("s_get_click in", values, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSGetClickNotIn(List<Integer> values) {
            addCriterion("s_get_click not in", values, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSGetClickBetween(Integer value1, Integer value2) {
            addCriterion("s_get_click between", value1, value2, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSGetClickNotBetween(Integer value1, Integer value2) {
            addCriterion("s_get_click not between", value1, value2, "sGetClick");
            return (Criteria) this;
        }

        public Criteria andSType1IsNull() {
            addCriterion("s_type1 is null");
            return (Criteria) this;
        }

        public Criteria andSType1IsNotNull() {
            addCriterion("s_type1 is not null");
            return (Criteria) this;
        }

        public Criteria andSType1EqualTo(String value) {
            addCriterion("s_type1 =", value, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1NotEqualTo(String value) {
            addCriterion("s_type1 <>", value, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1GreaterThan(String value) {
            addCriterion("s_type1 >", value, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1GreaterThanOrEqualTo(String value) {
            addCriterion("s_type1 >=", value, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1LessThan(String value) {
            addCriterion("s_type1 <", value, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1LessThanOrEqualTo(String value) {
            addCriterion("s_type1 <=", value, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1Like(String value) {
            addCriterion("s_type1 like", value, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1NotLike(String value) {
            addCriterion("s_type1 not like", value, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1In(List<String> values) {
            addCriterion("s_type1 in", values, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1NotIn(List<String> values) {
            addCriterion("s_type1 not in", values, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1Between(String value1, String value2) {
            addCriterion("s_type1 between", value1, value2, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType1NotBetween(String value1, String value2) {
            addCriterion("s_type1 not between", value1, value2, "sType1");
            return (Criteria) this;
        }

        public Criteria andSType2IsNull() {
            addCriterion("s_type2 is null");
            return (Criteria) this;
        }

        public Criteria andSType2IsNotNull() {
            addCriterion("s_type2 is not null");
            return (Criteria) this;
        }

        public Criteria andSType2EqualTo(String value) {
            addCriterion("s_type2 =", value, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2NotEqualTo(String value) {
            addCriterion("s_type2 <>", value, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2GreaterThan(String value) {
            addCriterion("s_type2 >", value, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2GreaterThanOrEqualTo(String value) {
            addCriterion("s_type2 >=", value, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2LessThan(String value) {
            addCriterion("s_type2 <", value, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2LessThanOrEqualTo(String value) {
            addCriterion("s_type2 <=", value, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2Like(String value) {
            addCriterion("s_type2 like", value, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2NotLike(String value) {
            addCriterion("s_type2 not like", value, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2In(List<String> values) {
            addCriterion("s_type2 in", values, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2NotIn(List<String> values) {
            addCriterion("s_type2 not in", values, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2Between(String value1, String value2) {
            addCriterion("s_type2 between", value1, value2, "sType2");
            return (Criteria) this;
        }

        public Criteria andSType2NotBetween(String value1, String value2) {
            addCriterion("s_type2 not between", value1, value2, "sType2");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNull() {
            addCriterion("s_title is null");
            return (Criteria) this;
        }

        public Criteria andSTitleIsNotNull() {
            addCriterion("s_title is not null");
            return (Criteria) this;
        }

        public Criteria andSTitleEqualTo(String value) {
            addCriterion("s_title =", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotEqualTo(String value) {
            addCriterion("s_title <>", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThan(String value) {
            addCriterion("s_title >", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleGreaterThanOrEqualTo(String value) {
            addCriterion("s_title >=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThan(String value) {
            addCriterion("s_title <", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLessThanOrEqualTo(String value) {
            addCriterion("s_title <=", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleLike(String value) {
            addCriterion("s_title like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotLike(String value) {
            addCriterion("s_title not like", value, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleIn(List<String> values) {
            addCriterion("s_title in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotIn(List<String> values) {
            addCriterion("s_title not in", values, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleBetween(String value1, String value2) {
            addCriterion("s_title between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTitleNotBetween(String value1, String value2) {
            addCriterion("s_title not between", value1, value2, "sTitle");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNull() {
            addCriterion("s_time is null");
            return (Criteria) this;
        }

        public Criteria andSTimeIsNotNull() {
            addCriterion("s_time is not null");
            return (Criteria) this;
        }

        public Criteria andSTimeEqualTo(Date value) {
            addCriterion("s_time =", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotEqualTo(Date value) {
            addCriterion("s_time <>", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThan(Date value) {
            addCriterion("s_time >", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("s_time >=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThan(Date value) {
            addCriterion("s_time <", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeLessThanOrEqualTo(Date value) {
            addCriterion("s_time <=", value, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeIn(List<Date> values) {
            addCriterion("s_time in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotIn(List<Date> values) {
            addCriterion("s_time not in", values, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeBetween(Date value1, Date value2) {
            addCriterion("s_time between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSTimeNotBetween(Date value1, Date value2) {
            addCriterion("s_time not between", value1, value2, "sTime");
            return (Criteria) this;
        }

        public Criteria andSImgIsNull() {
            addCriterion("s_img is null");
            return (Criteria) this;
        }

        public Criteria andSImgIsNotNull() {
            addCriterion("s_img is not null");
            return (Criteria) this;
        }

        public Criteria andSImgEqualTo(String value) {
            addCriterion("s_img =", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgNotEqualTo(String value) {
            addCriterion("s_img <>", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgGreaterThan(String value) {
            addCriterion("s_img >", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgGreaterThanOrEqualTo(String value) {
            addCriterion("s_img >=", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgLessThan(String value) {
            addCriterion("s_img <", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgLessThanOrEqualTo(String value) {
            addCriterion("s_img <=", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgLike(String value) {
            addCriterion("s_img like", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgNotLike(String value) {
            addCriterion("s_img not like", value, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgIn(List<String> values) {
            addCriterion("s_img in", values, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgNotIn(List<String> values) {
            addCriterion("s_img not in", values, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgBetween(String value1, String value2) {
            addCriterion("s_img between", value1, value2, "sImg");
            return (Criteria) this;
        }

        public Criteria andSImgNotBetween(String value1, String value2) {
            addCriterion("s_img not between", value1, value2, "sImg");
            return (Criteria) this;
        }

        public Criteria andSEx1IsNull() {
            addCriterion("s_ex1 is null");
            return (Criteria) this;
        }

        public Criteria andSEx1IsNotNull() {
            addCriterion("s_ex1 is not null");
            return (Criteria) this;
        }

        public Criteria andSEx1EqualTo(String value) {
            addCriterion("s_ex1 =", value, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1NotEqualTo(String value) {
            addCriterion("s_ex1 <>", value, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1GreaterThan(String value) {
            addCriterion("s_ex1 >", value, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1GreaterThanOrEqualTo(String value) {
            addCriterion("s_ex1 >=", value, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1LessThan(String value) {
            addCriterion("s_ex1 <", value, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1LessThanOrEqualTo(String value) {
            addCriterion("s_ex1 <=", value, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1Like(String value) {
            addCriterion("s_ex1 like", value, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1NotLike(String value) {
            addCriterion("s_ex1 not like", value, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1In(List<String> values) {
            addCriterion("s_ex1 in", values, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1NotIn(List<String> values) {
            addCriterion("s_ex1 not in", values, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1Between(String value1, String value2) {
            addCriterion("s_ex1 between", value1, value2, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx1NotBetween(String value1, String value2) {
            addCriterion("s_ex1 not between", value1, value2, "sEx1");
            return (Criteria) this;
        }

        public Criteria andSEx2IsNull() {
            addCriterion("s_ex2 is null");
            return (Criteria) this;
        }

        public Criteria andSEx2IsNotNull() {
            addCriterion("s_ex2 is not null");
            return (Criteria) this;
        }

        public Criteria andSEx2EqualTo(String value) {
            addCriterion("s_ex2 =", value, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2NotEqualTo(String value) {
            addCriterion("s_ex2 <>", value, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2GreaterThan(String value) {
            addCriterion("s_ex2 >", value, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2GreaterThanOrEqualTo(String value) {
            addCriterion("s_ex2 >=", value, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2LessThan(String value) {
            addCriterion("s_ex2 <", value, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2LessThanOrEqualTo(String value) {
            addCriterion("s_ex2 <=", value, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2Like(String value) {
            addCriterion("s_ex2 like", value, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2NotLike(String value) {
            addCriterion("s_ex2 not like", value, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2In(List<String> values) {
            addCriterion("s_ex2 in", values, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2NotIn(List<String> values) {
            addCriterion("s_ex2 not in", values, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2Between(String value1, String value2) {
            addCriterion("s_ex2 between", value1, value2, "sEx2");
            return (Criteria) this;
        }

        public Criteria andSEx2NotBetween(String value1, String value2) {
            addCriterion("s_ex2 not between", value1, value2, "sEx2");
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