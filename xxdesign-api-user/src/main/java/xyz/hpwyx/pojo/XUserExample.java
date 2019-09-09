package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XUserExample() {
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

        public Criteria andUPasswordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("u_password =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("u_password >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("u_password <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("u_password like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("u_password not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("u_password in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("u_phone is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("u_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("u_phone =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("u_phone <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("u_phone >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("u_phone >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("u_phone <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("u_phone <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("u_phone like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("u_phone not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("u_phone in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("u_phone not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("u_phone between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("u_phone not between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUOpenidIsNull() {
            addCriterion("u_openid is null");
            return (Criteria) this;
        }

        public Criteria andUOpenidIsNotNull() {
            addCriterion("u_openid is not null");
            return (Criteria) this;
        }

        public Criteria andUOpenidEqualTo(String value) {
            addCriterion("u_openid =", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotEqualTo(String value) {
            addCriterion("u_openid <>", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidGreaterThan(String value) {
            addCriterion("u_openid >", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("u_openid >=", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLessThan(String value) {
            addCriterion("u_openid <", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLessThanOrEqualTo(String value) {
            addCriterion("u_openid <=", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLike(String value) {
            addCriterion("u_openid like", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotLike(String value) {
            addCriterion("u_openid not like", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidIn(List<String> values) {
            addCriterion("u_openid in", values, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotIn(List<String> values) {
            addCriterion("u_openid not in", values, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidBetween(String value1, String value2) {
            addCriterion("u_openid between", value1, value2, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotBetween(String value1, String value2) {
            addCriterion("u_openid not between", value1, value2, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUIpIsNull() {
            addCriterion("u_ip is null");
            return (Criteria) this;
        }

        public Criteria andUIpIsNotNull() {
            addCriterion("u_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUIpEqualTo(String value) {
            addCriterion("u_ip =", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpNotEqualTo(String value) {
            addCriterion("u_ip <>", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpGreaterThan(String value) {
            addCriterion("u_ip >", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpGreaterThanOrEqualTo(String value) {
            addCriterion("u_ip >=", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpLessThan(String value) {
            addCriterion("u_ip <", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpLessThanOrEqualTo(String value) {
            addCriterion("u_ip <=", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpLike(String value) {
            addCriterion("u_ip like", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpNotLike(String value) {
            addCriterion("u_ip not like", value, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpIn(List<String> values) {
            addCriterion("u_ip in", values, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpNotIn(List<String> values) {
            addCriterion("u_ip not in", values, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpBetween(String value1, String value2) {
            addCriterion("u_ip between", value1, value2, "uIp");
            return (Criteria) this;
        }

        public Criteria andUIpNotBetween(String value1, String value2) {
            addCriterion("u_ip not between", value1, value2, "uIp");
            return (Criteria) this;
        }

        public Criteria andUCreateAtIsNull() {
            addCriterion("u_create_at is null");
            return (Criteria) this;
        }

        public Criteria andUCreateAtIsNotNull() {
            addCriterion("u_create_at is not null");
            return (Criteria) this;
        }

        public Criteria andUCreateAtEqualTo(Date value) {
            addCriterion("u_create_at =", value, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andUCreateAtNotEqualTo(Date value) {
            addCriterion("u_create_at <>", value, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andUCreateAtGreaterThan(Date value) {
            addCriterion("u_create_at >", value, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andUCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("u_create_at >=", value, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andUCreateAtLessThan(Date value) {
            addCriterion("u_create_at <", value, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andUCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("u_create_at <=", value, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andUCreateAtIn(List<Date> values) {
            addCriterion("u_create_at in", values, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andUCreateAtNotIn(List<Date> values) {
            addCriterion("u_create_at not in", values, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andUCreateAtBetween(Date value1, Date value2) {
            addCriterion("u_create_at between", value1, value2, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andUCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("u_create_at not between", value1, value2, "uCreateAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtIsNull() {
            addCriterion("u_login_at is null");
            return (Criteria) this;
        }

        public Criteria andULoginAtIsNotNull() {
            addCriterion("u_login_at is not null");
            return (Criteria) this;
        }

        public Criteria andULoginAtEqualTo(Date value) {
            addCriterion("u_login_at =", value, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtNotEqualTo(Date value) {
            addCriterion("u_login_at <>", value, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtGreaterThan(Date value) {
            addCriterion("u_login_at >", value, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtGreaterThanOrEqualTo(Date value) {
            addCriterion("u_login_at >=", value, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtLessThan(Date value) {
            addCriterion("u_login_at <", value, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtLessThanOrEqualTo(Date value) {
            addCriterion("u_login_at <=", value, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtIn(List<Date> values) {
            addCriterion("u_login_at in", values, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtNotIn(List<Date> values) {
            addCriterion("u_login_at not in", values, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtBetween(Date value1, Date value2) {
            addCriterion("u_login_at between", value1, value2, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andULoginAtNotBetween(Date value1, Date value2) {
            addCriterion("u_login_at not between", value1, value2, "uLoginAt");
            return (Criteria) this;
        }

        public Criteria andUIsdesignIsNull() {
            addCriterion("u_isdesign is null");
            return (Criteria) this;
        }

        public Criteria andUIsdesignIsNotNull() {
            addCriterion("u_isdesign is not null");
            return (Criteria) this;
        }

        public Criteria andUIsdesignEqualTo(String value) {
            addCriterion("u_isdesign =", value, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignNotEqualTo(String value) {
            addCriterion("u_isdesign <>", value, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignGreaterThan(String value) {
            addCriterion("u_isdesign >", value, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignGreaterThanOrEqualTo(String value) {
            addCriterion("u_isdesign >=", value, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignLessThan(String value) {
            addCriterion("u_isdesign <", value, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignLessThanOrEqualTo(String value) {
            addCriterion("u_isdesign <=", value, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignLike(String value) {
            addCriterion("u_isdesign like", value, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignNotLike(String value) {
            addCriterion("u_isdesign not like", value, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignIn(List<String> values) {
            addCriterion("u_isdesign in", values, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignNotIn(List<String> values) {
            addCriterion("u_isdesign not in", values, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignBetween(String value1, String value2) {
            addCriterion("u_isdesign between", value1, value2, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUIsdesignNotBetween(String value1, String value2) {
            addCriterion("u_isdesign not between", value1, value2, "uIsdesign");
            return (Criteria) this;
        }

        public Criteria andUEx1IsNull() {
            addCriterion("u_ex1 is null");
            return (Criteria) this;
        }

        public Criteria andUEx1IsNotNull() {
            addCriterion("u_ex1 is not null");
            return (Criteria) this;
        }

        public Criteria andUEx1EqualTo(String value) {
            addCriterion("u_ex1 =", value, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1NotEqualTo(String value) {
            addCriterion("u_ex1 <>", value, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1GreaterThan(String value) {
            addCriterion("u_ex1 >", value, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1GreaterThanOrEqualTo(String value) {
            addCriterion("u_ex1 >=", value, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1LessThan(String value) {
            addCriterion("u_ex1 <", value, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1LessThanOrEqualTo(String value) {
            addCriterion("u_ex1 <=", value, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1Like(String value) {
            addCriterion("u_ex1 like", value, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1NotLike(String value) {
            addCriterion("u_ex1 not like", value, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1In(List<String> values) {
            addCriterion("u_ex1 in", values, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1NotIn(List<String> values) {
            addCriterion("u_ex1 not in", values, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1Between(String value1, String value2) {
            addCriterion("u_ex1 between", value1, value2, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx1NotBetween(String value1, String value2) {
            addCriterion("u_ex1 not between", value1, value2, "uEx1");
            return (Criteria) this;
        }

        public Criteria andUEx2IsNull() {
            addCriterion("u_ex2 is null");
            return (Criteria) this;
        }

        public Criteria andUEx2IsNotNull() {
            addCriterion("u_ex2 is not null");
            return (Criteria) this;
        }

        public Criteria andUEx2EqualTo(String value) {
            addCriterion("u_ex2 =", value, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2NotEqualTo(String value) {
            addCriterion("u_ex2 <>", value, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2GreaterThan(String value) {
            addCriterion("u_ex2 >", value, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2GreaterThanOrEqualTo(String value) {
            addCriterion("u_ex2 >=", value, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2LessThan(String value) {
            addCriterion("u_ex2 <", value, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2LessThanOrEqualTo(String value) {
            addCriterion("u_ex2 <=", value, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2Like(String value) {
            addCriterion("u_ex2 like", value, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2NotLike(String value) {
            addCriterion("u_ex2 not like", value, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2In(List<String> values) {
            addCriterion("u_ex2 in", values, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2NotIn(List<String> values) {
            addCriterion("u_ex2 not in", values, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2Between(String value1, String value2) {
            addCriterion("u_ex2 between", value1, value2, "uEx2");
            return (Criteria) this;
        }

        public Criteria andUEx2NotBetween(String value1, String value2) {
            addCriterion("u_ex2 not between", value1, value2, "uEx2");
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