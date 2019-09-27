package xyz.hpwyx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XWardrobeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XWardrobeExample() {
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

        public Criteria andWIdIsNull() {
            addCriterion("w_id is null");
            return (Criteria) this;
        }

        public Criteria andWIdIsNotNull() {
            addCriterion("w_id is not null");
            return (Criteria) this;
        }

        public Criteria andWIdEqualTo(Integer value) {
            addCriterion("w_id =", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotEqualTo(Integer value) {
            addCriterion("w_id <>", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThan(Integer value) {
            addCriterion("w_id >", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_id >=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThan(Integer value) {
            addCriterion("w_id <", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdLessThanOrEqualTo(Integer value) {
            addCriterion("w_id <=", value, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdIn(List<Integer> values) {
            addCriterion("w_id in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotIn(List<Integer> values) {
            addCriterion("w_id not in", values, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdBetween(Integer value1, Integer value2) {
            addCriterion("w_id between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWIdNotBetween(Integer value1, Integer value2) {
            addCriterion("w_id not between", value1, value2, "wId");
            return (Criteria) this;
        }

        public Criteria andWBroudIsNull() {
            addCriterion("w_broud is null");
            return (Criteria) this;
        }

        public Criteria andWBroudIsNotNull() {
            addCriterion("w_broud is not null");
            return (Criteria) this;
        }

        public Criteria andWBroudEqualTo(String value) {
            addCriterion("w_broud =", value, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudNotEqualTo(String value) {
            addCriterion("w_broud <>", value, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudGreaterThan(String value) {
            addCriterion("w_broud >", value, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudGreaterThanOrEqualTo(String value) {
            addCriterion("w_broud >=", value, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudLessThan(String value) {
            addCriterion("w_broud <", value, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudLessThanOrEqualTo(String value) {
            addCriterion("w_broud <=", value, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudLike(String value) {
            addCriterion("w_broud like", value, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudNotLike(String value) {
            addCriterion("w_broud not like", value, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudIn(List<String> values) {
            addCriterion("w_broud in", values, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudNotIn(List<String> values) {
            addCriterion("w_broud not in", values, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudBetween(String value1, String value2) {
            addCriterion("w_broud between", value1, value2, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWBroudNotBetween(String value1, String value2) {
            addCriterion("w_broud not between", value1, value2, "wBroud");
            return (Criteria) this;
        }

        public Criteria andWDateIsNull() {
            addCriterion("w_date is null");
            return (Criteria) this;
        }

        public Criteria andWDateIsNotNull() {
            addCriterion("w_date is not null");
            return (Criteria) this;
        }

        public Criteria andWDateEqualTo(Date value) {
            addCriterion("w_date =", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateNotEqualTo(Date value) {
            addCriterion("w_date <>", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateGreaterThan(Date value) {
            addCriterion("w_date >", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateGreaterThanOrEqualTo(Date value) {
            addCriterion("w_date >=", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateLessThan(Date value) {
            addCriterion("w_date <", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateLessThanOrEqualTo(Date value) {
            addCriterion("w_date <=", value, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateIn(List<Date> values) {
            addCriterion("w_date in", values, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateNotIn(List<Date> values) {
            addCriterion("w_date not in", values, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateBetween(Date value1, Date value2) {
            addCriterion("w_date between", value1, value2, "wDate");
            return (Criteria) this;
        }

        public Criteria andWDateNotBetween(Date value1, Date value2) {
            addCriterion("w_date not between", value1, value2, "wDate");
            return (Criteria) this;
        }

        public Criteria andWImgIsNull() {
            addCriterion("w_img is null");
            return (Criteria) this;
        }

        public Criteria andWImgIsNotNull() {
            addCriterion("w_img is not null");
            return (Criteria) this;
        }

        public Criteria andWImgEqualTo(String value) {
            addCriterion("w_img =", value, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgNotEqualTo(String value) {
            addCriterion("w_img <>", value, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgGreaterThan(String value) {
            addCriterion("w_img >", value, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgGreaterThanOrEqualTo(String value) {
            addCriterion("w_img >=", value, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgLessThan(String value) {
            addCriterion("w_img <", value, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgLessThanOrEqualTo(String value) {
            addCriterion("w_img <=", value, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgLike(String value) {
            addCriterion("w_img like", value, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgNotLike(String value) {
            addCriterion("w_img not like", value, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgIn(List<String> values) {
            addCriterion("w_img in", values, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgNotIn(List<String> values) {
            addCriterion("w_img not in", values, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgBetween(String value1, String value2) {
            addCriterion("w_img between", value1, value2, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImgNotBetween(String value1, String value2) {
            addCriterion("w_img not between", value1, value2, "wImg");
            return (Criteria) this;
        }

        public Criteria andWImg2IsNull() {
            addCriterion("w_img2 is null");
            return (Criteria) this;
        }

        public Criteria andWImg2IsNotNull() {
            addCriterion("w_img2 is not null");
            return (Criteria) this;
        }

        public Criteria andWImg2EqualTo(String value) {
            addCriterion("w_img2 =", value, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2NotEqualTo(String value) {
            addCriterion("w_img2 <>", value, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2GreaterThan(String value) {
            addCriterion("w_img2 >", value, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2GreaterThanOrEqualTo(String value) {
            addCriterion("w_img2 >=", value, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2LessThan(String value) {
            addCriterion("w_img2 <", value, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2LessThanOrEqualTo(String value) {
            addCriterion("w_img2 <=", value, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2Like(String value) {
            addCriterion("w_img2 like", value, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2NotLike(String value) {
            addCriterion("w_img2 not like", value, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2In(List<String> values) {
            addCriterion("w_img2 in", values, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2NotIn(List<String> values) {
            addCriterion("w_img2 not in", values, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2Between(String value1, String value2) {
            addCriterion("w_img2 between", value1, value2, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg2NotBetween(String value1, String value2) {
            addCriterion("w_img2 not between", value1, value2, "wImg2");
            return (Criteria) this;
        }

        public Criteria andWImg3IsNull() {
            addCriterion("w_img3 is null");
            return (Criteria) this;
        }

        public Criteria andWImg3IsNotNull() {
            addCriterion("w_img3 is not null");
            return (Criteria) this;
        }

        public Criteria andWImg3EqualTo(String value) {
            addCriterion("w_img3 =", value, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3NotEqualTo(String value) {
            addCriterion("w_img3 <>", value, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3GreaterThan(String value) {
            addCriterion("w_img3 >", value, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3GreaterThanOrEqualTo(String value) {
            addCriterion("w_img3 >=", value, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3LessThan(String value) {
            addCriterion("w_img3 <", value, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3LessThanOrEqualTo(String value) {
            addCriterion("w_img3 <=", value, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3Like(String value) {
            addCriterion("w_img3 like", value, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3NotLike(String value) {
            addCriterion("w_img3 not like", value, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3In(List<String> values) {
            addCriterion("w_img3 in", values, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3NotIn(List<String> values) {
            addCriterion("w_img3 not in", values, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3Between(String value1, String value2) {
            addCriterion("w_img3 between", value1, value2, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWImg3NotBetween(String value1, String value2) {
            addCriterion("w_img3 not between", value1, value2, "wImg3");
            return (Criteria) this;
        }

        public Criteria andWStyleIsNull() {
            addCriterion("w_style is null");
            return (Criteria) this;
        }

        public Criteria andWStyleIsNotNull() {
            addCriterion("w_style is not null");
            return (Criteria) this;
        }

        public Criteria andWStyleEqualTo(String value) {
            addCriterion("w_style =", value, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleNotEqualTo(String value) {
            addCriterion("w_style <>", value, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleGreaterThan(String value) {
            addCriterion("w_style >", value, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleGreaterThanOrEqualTo(String value) {
            addCriterion("w_style >=", value, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleLessThan(String value) {
            addCriterion("w_style <", value, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleLessThanOrEqualTo(String value) {
            addCriterion("w_style <=", value, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleLike(String value) {
            addCriterion("w_style like", value, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleNotLike(String value) {
            addCriterion("w_style not like", value, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleIn(List<String> values) {
            addCriterion("w_style in", values, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleNotIn(List<String> values) {
            addCriterion("w_style not in", values, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleBetween(String value1, String value2) {
            addCriterion("w_style between", value1, value2, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWStyleNotBetween(String value1, String value2) {
            addCriterion("w_style not between", value1, value2, "wStyle");
            return (Criteria) this;
        }

        public Criteria andWSeasonIsNull() {
            addCriterion("w_season is null");
            return (Criteria) this;
        }

        public Criteria andWSeasonIsNotNull() {
            addCriterion("w_season is not null");
            return (Criteria) this;
        }

        public Criteria andWSeasonEqualTo(String value) {
            addCriterion("w_season =", value, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonNotEqualTo(String value) {
            addCriterion("w_season <>", value, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonGreaterThan(String value) {
            addCriterion("w_season >", value, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("w_season >=", value, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonLessThan(String value) {
            addCriterion("w_season <", value, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonLessThanOrEqualTo(String value) {
            addCriterion("w_season <=", value, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonLike(String value) {
            addCriterion("w_season like", value, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonNotLike(String value) {
            addCriterion("w_season not like", value, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonIn(List<String> values) {
            addCriterion("w_season in", values, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonNotIn(List<String> values) {
            addCriterion("w_season not in", values, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonBetween(String value1, String value2) {
            addCriterion("w_season between", value1, value2, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWSeasonNotBetween(String value1, String value2) {
            addCriterion("w_season not between", value1, value2, "wSeason");
            return (Criteria) this;
        }

        public Criteria andWPriceIsNull() {
            addCriterion("w_price is null");
            return (Criteria) this;
        }

        public Criteria andWPriceIsNotNull() {
            addCriterion("w_price is not null");
            return (Criteria) this;
        }

        public Criteria andWPriceEqualTo(Float value) {
            addCriterion("w_price =", value, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWPriceNotEqualTo(Float value) {
            addCriterion("w_price <>", value, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWPriceGreaterThan(Float value) {
            addCriterion("w_price >", value, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("w_price >=", value, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWPriceLessThan(Float value) {
            addCriterion("w_price <", value, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWPriceLessThanOrEqualTo(Float value) {
            addCriterion("w_price <=", value, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWPriceIn(List<Float> values) {
            addCriterion("w_price in", values, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWPriceNotIn(List<Float> values) {
            addCriterion("w_price not in", values, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWPriceBetween(Float value1, Float value2) {
            addCriterion("w_price between", value1, value2, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWPriceNotBetween(Float value1, Float value2) {
            addCriterion("w_price not between", value1, value2, "wPrice");
            return (Criteria) this;
        }

        public Criteria andWUseridIsNull() {
            addCriterion("w_userid is null");
            return (Criteria) this;
        }

        public Criteria andWUseridIsNotNull() {
            addCriterion("w_userid is not null");
            return (Criteria) this;
        }

        public Criteria andWUseridEqualTo(Integer value) {
            addCriterion("w_userid =", value, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWUseridNotEqualTo(Integer value) {
            addCriterion("w_userid <>", value, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWUseridGreaterThan(Integer value) {
            addCriterion("w_userid >", value, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_userid >=", value, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWUseridLessThan(Integer value) {
            addCriterion("w_userid <", value, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWUseridLessThanOrEqualTo(Integer value) {
            addCriterion("w_userid <=", value, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWUseridIn(List<Integer> values) {
            addCriterion("w_userid in", values, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWUseridNotIn(List<Integer> values) {
            addCriterion("w_userid not in", values, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWUseridBetween(Integer value1, Integer value2) {
            addCriterion("w_userid between", value1, value2, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("w_userid not between", value1, value2, "wUserid");
            return (Criteria) this;
        }

        public Criteria andWMarkIsNull() {
            addCriterion("w_mark is null");
            return (Criteria) this;
        }

        public Criteria andWMarkIsNotNull() {
            addCriterion("w_mark is not null");
            return (Criteria) this;
        }

        public Criteria andWMarkEqualTo(String value) {
            addCriterion("w_mark =", value, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkNotEqualTo(String value) {
            addCriterion("w_mark <>", value, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkGreaterThan(String value) {
            addCriterion("w_mark >", value, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkGreaterThanOrEqualTo(String value) {
            addCriterion("w_mark >=", value, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkLessThan(String value) {
            addCriterion("w_mark <", value, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkLessThanOrEqualTo(String value) {
            addCriterion("w_mark <=", value, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkLike(String value) {
            addCriterion("w_mark like", value, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkNotLike(String value) {
            addCriterion("w_mark not like", value, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkIn(List<String> values) {
            addCriterion("w_mark in", values, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkNotIn(List<String> values) {
            addCriterion("w_mark not in", values, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkBetween(String value1, String value2) {
            addCriterion("w_mark between", value1, value2, "wMark");
            return (Criteria) this;
        }

        public Criteria andWMarkNotBetween(String value1, String value2) {
            addCriterion("w_mark not between", value1, value2, "wMark");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeIsNull() {
            addCriterion("w_create_time is null");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeIsNotNull() {
            addCriterion("w_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("w_create_time =", value, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("w_create_time <>", value, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("w_create_time >", value, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("w_create_time >=", value, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("w_create_time <", value, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("w_create_time <=", value, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("w_create_time in", values, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("w_create_time not in", values, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("w_create_time between", value1, value2, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("w_create_time not between", value1, value2, "wCreateTime");
            return (Criteria) this;
        }

        public Criteria andWExxIsNull() {
            addCriterion("w_exx is null");
            return (Criteria) this;
        }

        public Criteria andWExxIsNotNull() {
            addCriterion("w_exx is not null");
            return (Criteria) this;
        }

        public Criteria andWExxEqualTo(String value) {
            addCriterion("w_exx =", value, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxNotEqualTo(String value) {
            addCriterion("w_exx <>", value, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxGreaterThan(String value) {
            addCriterion("w_exx >", value, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxGreaterThanOrEqualTo(String value) {
            addCriterion("w_exx >=", value, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxLessThan(String value) {
            addCriterion("w_exx <", value, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxLessThanOrEqualTo(String value) {
            addCriterion("w_exx <=", value, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxLike(String value) {
            addCriterion("w_exx like", value, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxNotLike(String value) {
            addCriterion("w_exx not like", value, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxIn(List<String> values) {
            addCriterion("w_exx in", values, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxNotIn(List<String> values) {
            addCriterion("w_exx not in", values, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxBetween(String value1, String value2) {
            addCriterion("w_exx between", value1, value2, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExxNotBetween(String value1, String value2) {
            addCriterion("w_exx not between", value1, value2, "wExx");
            return (Criteria) this;
        }

        public Criteria andWExeIsNull() {
            addCriterion("w_exe is null");
            return (Criteria) this;
        }

        public Criteria andWExeIsNotNull() {
            addCriterion("w_exe is not null");
            return (Criteria) this;
        }

        public Criteria andWExeEqualTo(String value) {
            addCriterion("w_exe =", value, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeNotEqualTo(String value) {
            addCriterion("w_exe <>", value, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeGreaterThan(String value) {
            addCriterion("w_exe >", value, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeGreaterThanOrEqualTo(String value) {
            addCriterion("w_exe >=", value, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeLessThan(String value) {
            addCriterion("w_exe <", value, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeLessThanOrEqualTo(String value) {
            addCriterion("w_exe <=", value, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeLike(String value) {
            addCriterion("w_exe like", value, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeNotLike(String value) {
            addCriterion("w_exe not like", value, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeIn(List<String> values) {
            addCriterion("w_exe in", values, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeNotIn(List<String> values) {
            addCriterion("w_exe not in", values, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeBetween(String value1, String value2) {
            addCriterion("w_exe between", value1, value2, "wExe");
            return (Criteria) this;
        }

        public Criteria andWExeNotBetween(String value1, String value2) {
            addCriterion("w_exe not between", value1, value2, "wExe");
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