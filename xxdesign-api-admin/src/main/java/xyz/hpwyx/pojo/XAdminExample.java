package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XAdminExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAUsernameIsNull() {
            addCriterion("a_username is null");
            return (Criteria) this;
        }

        public Criteria andAUsernameIsNotNull() {
            addCriterion("a_username is not null");
            return (Criteria) this;
        }

        public Criteria andAUsernameEqualTo(String value) {
            addCriterion("a_username =", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotEqualTo(String value) {
            addCriterion("a_username <>", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameGreaterThan(String value) {
            addCriterion("a_username >", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("a_username >=", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLessThan(String value) {
            addCriterion("a_username <", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLessThanOrEqualTo(String value) {
            addCriterion("a_username <=", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameLike(String value) {
            addCriterion("a_username like", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotLike(String value) {
            addCriterion("a_username not like", value, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameIn(List<String> values) {
            addCriterion("a_username in", values, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotIn(List<String> values) {
            addCriterion("a_username not in", values, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameBetween(String value1, String value2) {
            addCriterion("a_username between", value1, value2, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAUsernameNotBetween(String value1, String value2) {
            addCriterion("a_username not between", value1, value2, "aUsername");
            return (Criteria) this;
        }

        public Criteria andAPwdIsNull() {
            addCriterion("a_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAPwdIsNotNull() {
            addCriterion("a_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAPwdEqualTo(String value) {
            addCriterion("a_pwd =", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdNotEqualTo(String value) {
            addCriterion("a_pwd <>", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdGreaterThan(String value) {
            addCriterion("a_pwd >", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdGreaterThanOrEqualTo(String value) {
            addCriterion("a_pwd >=", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdLessThan(String value) {
            addCriterion("a_pwd <", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdLessThanOrEqualTo(String value) {
            addCriterion("a_pwd <=", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdLike(String value) {
            addCriterion("a_pwd like", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdNotLike(String value) {
            addCriterion("a_pwd not like", value, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdIn(List<String> values) {
            addCriterion("a_pwd in", values, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdNotIn(List<String> values) {
            addCriterion("a_pwd not in", values, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdBetween(String value1, String value2) {
            addCriterion("a_pwd between", value1, value2, "aPwd");
            return (Criteria) this;
        }

        public Criteria andAPwdNotBetween(String value1, String value2) {
            addCriterion("a_pwd not between", value1, value2, "aPwd");
            return (Criteria) this;
        }

        public Criteria andALevelIsNull() {
            addCriterion("a_level is null");
            return (Criteria) this;
        }

        public Criteria andALevelIsNotNull() {
            addCriterion("a_level is not null");
            return (Criteria) this;
        }

        public Criteria andALevelEqualTo(String value) {
            addCriterion("a_level =", value, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelNotEqualTo(String value) {
            addCriterion("a_level <>", value, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelGreaterThan(String value) {
            addCriterion("a_level >", value, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelGreaterThanOrEqualTo(String value) {
            addCriterion("a_level >=", value, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelLessThan(String value) {
            addCriterion("a_level <", value, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelLessThanOrEqualTo(String value) {
            addCriterion("a_level <=", value, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelLike(String value) {
            addCriterion("a_level like", value, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelNotLike(String value) {
            addCriterion("a_level not like", value, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelIn(List<String> values) {
            addCriterion("a_level in", values, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelNotIn(List<String> values) {
            addCriterion("a_level not in", values, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelBetween(String value1, String value2) {
            addCriterion("a_level between", value1, value2, "aLevel");
            return (Criteria) this;
        }

        public Criteria andALevelNotBetween(String value1, String value2) {
            addCriterion("a_level not between", value1, value2, "aLevel");
            return (Criteria) this;
        }

        public Criteria andARegTimeIsNull() {
            addCriterion("a_reg_time is null");
            return (Criteria) this;
        }

        public Criteria andARegTimeIsNotNull() {
            addCriterion("a_reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andARegTimeEqualTo(Date value) {
            addCriterion("a_reg_time =", value, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andARegTimeNotEqualTo(Date value) {
            addCriterion("a_reg_time <>", value, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andARegTimeGreaterThan(Date value) {
            addCriterion("a_reg_time >", value, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andARegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("a_reg_time >=", value, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andARegTimeLessThan(Date value) {
            addCriterion("a_reg_time <", value, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andARegTimeLessThanOrEqualTo(Date value) {
            addCriterion("a_reg_time <=", value, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andARegTimeIn(List<Date> values) {
            addCriterion("a_reg_time in", values, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andARegTimeNotIn(List<Date> values) {
            addCriterion("a_reg_time not in", values, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andARegTimeBetween(Date value1, Date value2) {
            addCriterion("a_reg_time between", value1, value2, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andARegTimeNotBetween(Date value1, Date value2) {
            addCriterion("a_reg_time not between", value1, value2, "aRegTime");
            return (Criteria) this;
        }

        public Criteria andAIpIsNull() {
            addCriterion("a_ip is null");
            return (Criteria) this;
        }

        public Criteria andAIpIsNotNull() {
            addCriterion("a_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAIpEqualTo(String value) {
            addCriterion("a_ip =", value, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpNotEqualTo(String value) {
            addCriterion("a_ip <>", value, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpGreaterThan(String value) {
            addCriterion("a_ip >", value, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpGreaterThanOrEqualTo(String value) {
            addCriterion("a_ip >=", value, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpLessThan(String value) {
            addCriterion("a_ip <", value, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpLessThanOrEqualTo(String value) {
            addCriterion("a_ip <=", value, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpLike(String value) {
            addCriterion("a_ip like", value, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpNotLike(String value) {
            addCriterion("a_ip not like", value, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpIn(List<String> values) {
            addCriterion("a_ip in", values, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpNotIn(List<String> values) {
            addCriterion("a_ip not in", values, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpBetween(String value1, String value2) {
            addCriterion("a_ip between", value1, value2, "aIp");
            return (Criteria) this;
        }

        public Criteria andAIpNotBetween(String value1, String value2) {
            addCriterion("a_ip not between", value1, value2, "aIp");
            return (Criteria) this;
        }

        public Criteria andAUserIdIsNull() {
            addCriterion("a_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAUserIdIsNotNull() {
            addCriterion("a_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAUserIdEqualTo(Integer value) {
            addCriterion("a_user_id =", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdNotEqualTo(Integer value) {
            addCriterion("a_user_id <>", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdGreaterThan(Integer value) {
            addCriterion("a_user_id >", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_user_id >=", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdLessThan(Integer value) {
            addCriterion("a_user_id <", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_user_id <=", value, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdIn(List<Integer> values) {
            addCriterion("a_user_id in", values, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdNotIn(List<Integer> values) {
            addCriterion("a_user_id not in", values, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdBetween(Integer value1, Integer value2) {
            addCriterion("a_user_id between", value1, value2, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_user_id not between", value1, value2, "aUserId");
            return (Criteria) this;
        }

        public Criteria andAMarkIsNull() {
            addCriterion("a_mark is null");
            return (Criteria) this;
        }

        public Criteria andAMarkIsNotNull() {
            addCriterion("a_mark is not null");
            return (Criteria) this;
        }

        public Criteria andAMarkEqualTo(String value) {
            addCriterion("a_mark =", value, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkNotEqualTo(String value) {
            addCriterion("a_mark <>", value, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkGreaterThan(String value) {
            addCriterion("a_mark >", value, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkGreaterThanOrEqualTo(String value) {
            addCriterion("a_mark >=", value, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkLessThan(String value) {
            addCriterion("a_mark <", value, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkLessThanOrEqualTo(String value) {
            addCriterion("a_mark <=", value, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkLike(String value) {
            addCriterion("a_mark like", value, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkNotLike(String value) {
            addCriterion("a_mark not like", value, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkIn(List<String> values) {
            addCriterion("a_mark in", values, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkNotIn(List<String> values) {
            addCriterion("a_mark not in", values, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkBetween(String value1, String value2) {
            addCriterion("a_mark between", value1, value2, "aMark");
            return (Criteria) this;
        }

        public Criteria andAMarkNotBetween(String value1, String value2) {
            addCriterion("a_mark not between", value1, value2, "aMark");
            return (Criteria) this;
        }

        public Criteria andAUuidIsNull() {
            addCriterion("a_uuid is null");
            return (Criteria) this;
        }

        public Criteria andAUuidIsNotNull() {
            addCriterion("a_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andAUuidEqualTo(String value) {
            addCriterion("a_uuid =", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidNotEqualTo(String value) {
            addCriterion("a_uuid <>", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidGreaterThan(String value) {
            addCriterion("a_uuid >", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidGreaterThanOrEqualTo(String value) {
            addCriterion("a_uuid >=", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidLessThan(String value) {
            addCriterion("a_uuid <", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidLessThanOrEqualTo(String value) {
            addCriterion("a_uuid <=", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidLike(String value) {
            addCriterion("a_uuid like", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidNotLike(String value) {
            addCriterion("a_uuid not like", value, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidIn(List<String> values) {
            addCriterion("a_uuid in", values, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidNotIn(List<String> values) {
            addCriterion("a_uuid not in", values, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidBetween(String value1, String value2) {
            addCriterion("a_uuid between", value1, value2, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAUuidNotBetween(String value1, String value2) {
            addCriterion("a_uuid not between", value1, value2, "aUuid");
            return (Criteria) this;
        }

        public Criteria andAPicIsNull() {
            addCriterion("a_pic is null");
            return (Criteria) this;
        }

        public Criteria andAPicIsNotNull() {
            addCriterion("a_pic is not null");
            return (Criteria) this;
        }

        public Criteria andAPicEqualTo(String value) {
            addCriterion("a_pic =", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicNotEqualTo(String value) {
            addCriterion("a_pic <>", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicGreaterThan(String value) {
            addCriterion("a_pic >", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicGreaterThanOrEqualTo(String value) {
            addCriterion("a_pic >=", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicLessThan(String value) {
            addCriterion("a_pic <", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicLessThanOrEqualTo(String value) {
            addCriterion("a_pic <=", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicLike(String value) {
            addCriterion("a_pic like", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicNotLike(String value) {
            addCriterion("a_pic not like", value, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicIn(List<String> values) {
            addCriterion("a_pic in", values, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicNotIn(List<String> values) {
            addCriterion("a_pic not in", values, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicBetween(String value1, String value2) {
            addCriterion("a_pic between", value1, value2, "aPic");
            return (Criteria) this;
        }

        public Criteria andAPicNotBetween(String value1, String value2) {
            addCriterion("a_pic not between", value1, value2, "aPic");
            return (Criteria) this;
        }

        public Criteria andATokenIsNull() {
            addCriterion("a_token is null");
            return (Criteria) this;
        }

        public Criteria andATokenIsNotNull() {
            addCriterion("a_token is not null");
            return (Criteria) this;
        }

        public Criteria andATokenEqualTo(String value) {
            addCriterion("a_token =", value, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenNotEqualTo(String value) {
            addCriterion("a_token <>", value, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenGreaterThan(String value) {
            addCriterion("a_token >", value, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenGreaterThanOrEqualTo(String value) {
            addCriterion("a_token >=", value, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenLessThan(String value) {
            addCriterion("a_token <", value, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenLessThanOrEqualTo(String value) {
            addCriterion("a_token <=", value, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenLike(String value) {
            addCriterion("a_token like", value, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenNotLike(String value) {
            addCriterion("a_token not like", value, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenIn(List<String> values) {
            addCriterion("a_token in", values, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenNotIn(List<String> values) {
            addCriterion("a_token not in", values, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenBetween(String value1, String value2) {
            addCriterion("a_token between", value1, value2, "aToken");
            return (Criteria) this;
        }

        public Criteria andATokenNotBetween(String value1, String value2) {
            addCriterion("a_token not between", value1, value2, "aToken");
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