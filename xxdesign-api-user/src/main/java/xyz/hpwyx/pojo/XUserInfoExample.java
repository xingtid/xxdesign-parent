package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.List;

public class XUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XUserInfoExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("u_email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("u_email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("u_email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("u_email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("u_email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("u_email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("u_email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("u_email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("u_email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("u_email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("u_email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("u_email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("u_email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("u_email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("u_sex like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("u_sex not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNull() {
            addCriterion("u_age is null");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNotNull() {
            addCriterion("u_age is not null");
            return (Criteria) this;
        }

        public Criteria andUAgeEqualTo(Integer value) {
            addCriterion("u_age =", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotEqualTo(Integer value) {
            addCriterion("u_age <>", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThan(Integer value) {
            addCriterion("u_age >", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_age >=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThan(Integer value) {
            addCriterion("u_age <", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThanOrEqualTo(Integer value) {
            addCriterion("u_age <=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeIn(List<Integer> values) {
            addCriterion("u_age in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotIn(List<Integer> values) {
            addCriterion("u_age not in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeBetween(Integer value1, Integer value2) {
            addCriterion("u_age between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("u_age not between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUCityIsNull() {
            addCriterion("u_city is null");
            return (Criteria) this;
        }

        public Criteria andUCityIsNotNull() {
            addCriterion("u_city is not null");
            return (Criteria) this;
        }

        public Criteria andUCityEqualTo(String value) {
            addCriterion("u_city =", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotEqualTo(String value) {
            addCriterion("u_city <>", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityGreaterThan(String value) {
            addCriterion("u_city >", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityGreaterThanOrEqualTo(String value) {
            addCriterion("u_city >=", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLessThan(String value) {
            addCriterion("u_city <", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLessThanOrEqualTo(String value) {
            addCriterion("u_city <=", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLike(String value) {
            addCriterion("u_city like", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotLike(String value) {
            addCriterion("u_city not like", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityIn(List<String> values) {
            addCriterion("u_city in", values, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotIn(List<String> values) {
            addCriterion("u_city not in", values, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityBetween(String value1, String value2) {
            addCriterion("u_city between", value1, value2, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotBetween(String value1, String value2) {
            addCriterion("u_city not between", value1, value2, "uCity");
            return (Criteria) this;
        }

        public Criteria andUFaceIsNull() {
            addCriterion("u_face is null");
            return (Criteria) this;
        }

        public Criteria andUFaceIsNotNull() {
            addCriterion("u_face is not null");
            return (Criteria) this;
        }

        public Criteria andUFaceEqualTo(String value) {
            addCriterion("u_face =", value, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceNotEqualTo(String value) {
            addCriterion("u_face <>", value, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceGreaterThan(String value) {
            addCriterion("u_face >", value, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceGreaterThanOrEqualTo(String value) {
            addCriterion("u_face >=", value, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceLessThan(String value) {
            addCriterion("u_face <", value, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceLessThanOrEqualTo(String value) {
            addCriterion("u_face <=", value, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceLike(String value) {
            addCriterion("u_face like", value, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceNotLike(String value) {
            addCriterion("u_face not like", value, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceIn(List<String> values) {
            addCriterion("u_face in", values, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceNotIn(List<String> values) {
            addCriterion("u_face not in", values, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceBetween(String value1, String value2) {
            addCriterion("u_face between", value1, value2, "uFace");
            return (Criteria) this;
        }

        public Criteria andUFaceNotBetween(String value1, String value2) {
            addCriterion("u_face not between", value1, value2, "uFace");
            return (Criteria) this;
        }

        public Criteria andUStyle1IsNull() {
            addCriterion("u_style1 is null");
            return (Criteria) this;
        }

        public Criteria andUStyle1IsNotNull() {
            addCriterion("u_style1 is not null");
            return (Criteria) this;
        }

        public Criteria andUStyle1EqualTo(String value) {
            addCriterion("u_style1 =", value, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1NotEqualTo(String value) {
            addCriterion("u_style1 <>", value, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1GreaterThan(String value) {
            addCriterion("u_style1 >", value, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1GreaterThanOrEqualTo(String value) {
            addCriterion("u_style1 >=", value, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1LessThan(String value) {
            addCriterion("u_style1 <", value, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1LessThanOrEqualTo(String value) {
            addCriterion("u_style1 <=", value, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1Like(String value) {
            addCriterion("u_style1 like", value, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1NotLike(String value) {
            addCriterion("u_style1 not like", value, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1In(List<String> values) {
            addCriterion("u_style1 in", values, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1NotIn(List<String> values) {
            addCriterion("u_style1 not in", values, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1Between(String value1, String value2) {
            addCriterion("u_style1 between", value1, value2, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle1NotBetween(String value1, String value2) {
            addCriterion("u_style1 not between", value1, value2, "uStyle1");
            return (Criteria) this;
        }

        public Criteria andUStyle2IsNull() {
            addCriterion("u_style2 is null");
            return (Criteria) this;
        }

        public Criteria andUStyle2IsNotNull() {
            addCriterion("u_style2 is not null");
            return (Criteria) this;
        }

        public Criteria andUStyle2EqualTo(String value) {
            addCriterion("u_style2 =", value, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2NotEqualTo(String value) {
            addCriterion("u_style2 <>", value, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2GreaterThan(String value) {
            addCriterion("u_style2 >", value, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2GreaterThanOrEqualTo(String value) {
            addCriterion("u_style2 >=", value, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2LessThan(String value) {
            addCriterion("u_style2 <", value, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2LessThanOrEqualTo(String value) {
            addCriterion("u_style2 <=", value, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2Like(String value) {
            addCriterion("u_style2 like", value, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2NotLike(String value) {
            addCriterion("u_style2 not like", value, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2In(List<String> values) {
            addCriterion("u_style2 in", values, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2NotIn(List<String> values) {
            addCriterion("u_style2 not in", values, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2Between(String value1, String value2) {
            addCriterion("u_style2 between", value1, value2, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle2NotBetween(String value1, String value2) {
            addCriterion("u_style2 not between", value1, value2, "uStyle2");
            return (Criteria) this;
        }

        public Criteria andUStyle3IsNull() {
            addCriterion("u_style3 is null");
            return (Criteria) this;
        }

        public Criteria andUStyle3IsNotNull() {
            addCriterion("u_style3 is not null");
            return (Criteria) this;
        }

        public Criteria andUStyle3EqualTo(String value) {
            addCriterion("u_style3 =", value, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3NotEqualTo(String value) {
            addCriterion("u_style3 <>", value, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3GreaterThan(String value) {
            addCriterion("u_style3 >", value, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3GreaterThanOrEqualTo(String value) {
            addCriterion("u_style3 >=", value, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3LessThan(String value) {
            addCriterion("u_style3 <", value, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3LessThanOrEqualTo(String value) {
            addCriterion("u_style3 <=", value, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3Like(String value) {
            addCriterion("u_style3 like", value, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3NotLike(String value) {
            addCriterion("u_style3 not like", value, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3In(List<String> values) {
            addCriterion("u_style3 in", values, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3NotIn(List<String> values) {
            addCriterion("u_style3 not in", values, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3Between(String value1, String value2) {
            addCriterion("u_style3 between", value1, value2, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUStyle3NotBetween(String value1, String value2) {
            addCriterion("u_style3 not between", value1, value2, "uStyle3");
            return (Criteria) this;
        }

        public Criteria andUHeightIsNull() {
            addCriterion("u_height is null");
            return (Criteria) this;
        }

        public Criteria andUHeightIsNotNull() {
            addCriterion("u_height is not null");
            return (Criteria) this;
        }

        public Criteria andUHeightEqualTo(Integer value) {
            addCriterion("u_height =", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightNotEqualTo(Integer value) {
            addCriterion("u_height <>", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightGreaterThan(Integer value) {
            addCriterion("u_height >", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_height >=", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightLessThan(Integer value) {
            addCriterion("u_height <", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightLessThanOrEqualTo(Integer value) {
            addCriterion("u_height <=", value, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightIn(List<Integer> values) {
            addCriterion("u_height in", values, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightNotIn(List<Integer> values) {
            addCriterion("u_height not in", values, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightBetween(Integer value1, Integer value2) {
            addCriterion("u_height between", value1, value2, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("u_height not between", value1, value2, "uHeight");
            return (Criteria) this;
        }

        public Criteria andUWeightIsNull() {
            addCriterion("u_weight is null");
            return (Criteria) this;
        }

        public Criteria andUWeightIsNotNull() {
            addCriterion("u_weight is not null");
            return (Criteria) this;
        }

        public Criteria andUWeightEqualTo(Integer value) {
            addCriterion("u_weight =", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightNotEqualTo(Integer value) {
            addCriterion("u_weight <>", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightGreaterThan(Integer value) {
            addCriterion("u_weight >", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_weight >=", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightLessThan(Integer value) {
            addCriterion("u_weight <", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightLessThanOrEqualTo(Integer value) {
            addCriterion("u_weight <=", value, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightIn(List<Integer> values) {
            addCriterion("u_weight in", values, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightNotIn(List<Integer> values) {
            addCriterion("u_weight not in", values, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightBetween(Integer value1, Integer value2) {
            addCriterion("u_weight between", value1, value2, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("u_weight not between", value1, value2, "uWeight");
            return (Criteria) this;
        }

        public Criteria andUSkinIsNull() {
            addCriterion("u_skin is null");
            return (Criteria) this;
        }

        public Criteria andUSkinIsNotNull() {
            addCriterion("u_skin is not null");
            return (Criteria) this;
        }

        public Criteria andUSkinEqualTo(String value) {
            addCriterion("u_skin =", value, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinNotEqualTo(String value) {
            addCriterion("u_skin <>", value, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinGreaterThan(String value) {
            addCriterion("u_skin >", value, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinGreaterThanOrEqualTo(String value) {
            addCriterion("u_skin >=", value, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinLessThan(String value) {
            addCriterion("u_skin <", value, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinLessThanOrEqualTo(String value) {
            addCriterion("u_skin <=", value, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinLike(String value) {
            addCriterion("u_skin like", value, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinNotLike(String value) {
            addCriterion("u_skin not like", value, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinIn(List<String> values) {
            addCriterion("u_skin in", values, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinNotIn(List<String> values) {
            addCriterion("u_skin not in", values, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinBetween(String value1, String value2) {
            addCriterion("u_skin between", value1, value2, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUSkinNotBetween(String value1, String value2) {
            addCriterion("u_skin not between", value1, value2, "uSkin");
            return (Criteria) this;
        }

        public Criteria andUHairIsNull() {
            addCriterion("u_hair is null");
            return (Criteria) this;
        }

        public Criteria andUHairIsNotNull() {
            addCriterion("u_hair is not null");
            return (Criteria) this;
        }

        public Criteria andUHairEqualTo(String value) {
            addCriterion("u_hair =", value, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairNotEqualTo(String value) {
            addCriterion("u_hair <>", value, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairGreaterThan(String value) {
            addCriterion("u_hair >", value, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairGreaterThanOrEqualTo(String value) {
            addCriterion("u_hair >=", value, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairLessThan(String value) {
            addCriterion("u_hair <", value, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairLessThanOrEqualTo(String value) {
            addCriterion("u_hair <=", value, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairLike(String value) {
            addCriterion("u_hair like", value, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairNotLike(String value) {
            addCriterion("u_hair not like", value, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairIn(List<String> values) {
            addCriterion("u_hair in", values, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairNotIn(List<String> values) {
            addCriterion("u_hair not in", values, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairBetween(String value1, String value2) {
            addCriterion("u_hair between", value1, value2, "uHair");
            return (Criteria) this;
        }

        public Criteria andUHairNotBetween(String value1, String value2) {
            addCriterion("u_hair not between", value1, value2, "uHair");
            return (Criteria) this;
        }

        public Criteria andUPositionIsNull() {
            addCriterion("u_position is null");
            return (Criteria) this;
        }

        public Criteria andUPositionIsNotNull() {
            addCriterion("u_position is not null");
            return (Criteria) this;
        }

        public Criteria andUPositionEqualTo(String value) {
            addCriterion("u_position =", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotEqualTo(String value) {
            addCriterion("u_position <>", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionGreaterThan(String value) {
            addCriterion("u_position >", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionGreaterThanOrEqualTo(String value) {
            addCriterion("u_position >=", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionLessThan(String value) {
            addCriterion("u_position <", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionLessThanOrEqualTo(String value) {
            addCriterion("u_position <=", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionLike(String value) {
            addCriterion("u_position like", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotLike(String value) {
            addCriterion("u_position not like", value, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionIn(List<String> values) {
            addCriterion("u_position in", values, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotIn(List<String> values) {
            addCriterion("u_position not in", values, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionBetween(String value1, String value2) {
            addCriterion("u_position between", value1, value2, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPositionNotBetween(String value1, String value2) {
            addCriterion("u_position not between", value1, value2, "uPosition");
            return (Criteria) this;
        }

        public Criteria andUPhotoIsNull() {
            addCriterion("u_photo is null");
            return (Criteria) this;
        }

        public Criteria andUPhotoIsNotNull() {
            addCriterion("u_photo is not null");
            return (Criteria) this;
        }

        public Criteria andUPhotoEqualTo(String value) {
            addCriterion("u_photo =", value, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoNotEqualTo(String value) {
            addCriterion("u_photo <>", value, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoGreaterThan(String value) {
            addCriterion("u_photo >", value, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("u_photo >=", value, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoLessThan(String value) {
            addCriterion("u_photo <", value, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoLessThanOrEqualTo(String value) {
            addCriterion("u_photo <=", value, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoLike(String value) {
            addCriterion("u_photo like", value, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoNotLike(String value) {
            addCriterion("u_photo not like", value, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoIn(List<String> values) {
            addCriterion("u_photo in", values, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoNotIn(List<String> values) {
            addCriterion("u_photo not in", values, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoBetween(String value1, String value2) {
            addCriterion("u_photo between", value1, value2, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUPhotoNotBetween(String value1, String value2) {
            addCriterion("u_photo not between", value1, value2, "uPhoto");
            return (Criteria) this;
        }

        public Criteria andUOtherIsNull() {
            addCriterion("u_other is null");
            return (Criteria) this;
        }

        public Criteria andUOtherIsNotNull() {
            addCriterion("u_other is not null");
            return (Criteria) this;
        }

        public Criteria andUOtherEqualTo(String value) {
            addCriterion("u_other =", value, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherNotEqualTo(String value) {
            addCriterion("u_other <>", value, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherGreaterThan(String value) {
            addCriterion("u_other >", value, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherGreaterThanOrEqualTo(String value) {
            addCriterion("u_other >=", value, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherLessThan(String value) {
            addCriterion("u_other <", value, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherLessThanOrEqualTo(String value) {
            addCriterion("u_other <=", value, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherLike(String value) {
            addCriterion("u_other like", value, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherNotLike(String value) {
            addCriterion("u_other not like", value, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherIn(List<String> values) {
            addCriterion("u_other in", values, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherNotIn(List<String> values) {
            addCriterion("u_other not in", values, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherBetween(String value1, String value2) {
            addCriterion("u_other between", value1, value2, "uOther");
            return (Criteria) this;
        }

        public Criteria andUOtherNotBetween(String value1, String value2) {
            addCriterion("u_other not between", value1, value2, "uOther");
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