package com.yi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrouseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrouseInfoExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andTecidIsNull() {
            addCriterion("tecid is null");
            return (Criteria) this;
        }

        public Criteria andTecidIsNotNull() {
            addCriterion("tecid is not null");
            return (Criteria) this;
        }

        public Criteria andTecidEqualTo(String value) {
            addCriterion("tecid =", value, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidNotEqualTo(String value) {
            addCriterion("tecid <>", value, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidGreaterThan(String value) {
            addCriterion("tecid >", value, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidGreaterThanOrEqualTo(String value) {
            addCriterion("tecid >=", value, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidLessThan(String value) {
            addCriterion("tecid <", value, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidLessThanOrEqualTo(String value) {
            addCriterion("tecid <=", value, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidLike(String value) {
            addCriterion("tecid like", value, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidNotLike(String value) {
            addCriterion("tecid not like", value, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidIn(List<String> values) {
            addCriterion("tecid in", values, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidNotIn(List<String> values) {
            addCriterion("tecid not in", values, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidBetween(String value1, String value2) {
            addCriterion("tecid between", value1, value2, "tecid");
            return (Criteria) this;
        }

        public Criteria andTecidNotBetween(String value1, String value2) {
            addCriterion("tecid not between", value1, value2, "tecid");
            return (Criteria) this;
        }

        public Criteria andKidIsNull() {
            addCriterion("kid is null");
            return (Criteria) this;
        }

        public Criteria andKidIsNotNull() {
            addCriterion("kid is not null");
            return (Criteria) this;
        }

        public Criteria andKidEqualTo(Integer value) {
            addCriterion("kid =", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(Integer value) {
            addCriterion("kid <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(Integer value) {
            addCriterion("kid >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kid >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThan(Integer value) {
            addCriterion("kid <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(Integer value) {
            addCriterion("kid <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidIn(List<Integer> values) {
            addCriterion("kid in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotIn(List<Integer> values) {
            addCriterion("kid not in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidBetween(Integer value1, Integer value2) {
            addCriterion("kid between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotBetween(Integer value1, Integer value2) {
            addCriterion("kid not between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAddDayIsNull() {
            addCriterion("add_day is null");
            return (Criteria) this;
        }

        public Criteria andAddDayIsNotNull() {
            addCriterion("add_day is not null");
            return (Criteria) this;
        }

        public Criteria andAddDayEqualTo(Date value) {
            addCriterion("add_day =", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayNotEqualTo(Date value) {
            addCriterion("add_day <>", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayGreaterThan(Date value) {
            addCriterion("add_day >", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayGreaterThanOrEqualTo(Date value) {
            addCriterion("add_day >=", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayLessThan(Date value) {
            addCriterion("add_day <", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayLessThanOrEqualTo(Date value) {
            addCriterion("add_day <=", value, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayIn(List<Date> values) {
            addCriterion("add_day in", values, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayNotIn(List<Date> values) {
            addCriterion("add_day not in", values, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayBetween(Date value1, Date value2) {
            addCriterion("add_day between", value1, value2, "addDay");
            return (Criteria) this;
        }

        public Criteria andAddDayNotBetween(Date value1, Date value2) {
            addCriterion("add_day not between", value1, value2, "addDay");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeIsNull() {
            addCriterion("crouse_time is null");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeIsNotNull() {
            addCriterion("crouse_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeEqualTo(Integer value) {
            addCriterion("crouse_time =", value, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeNotEqualTo(Integer value) {
            addCriterion("crouse_time <>", value, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeGreaterThan(Integer value) {
            addCriterion("crouse_time >", value, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("crouse_time >=", value, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeLessThan(Integer value) {
            addCriterion("crouse_time <", value, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("crouse_time <=", value, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeIn(List<Integer> values) {
            addCriterion("crouse_time in", values, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeNotIn(List<Integer> values) {
            addCriterion("crouse_time not in", values, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeBetween(Integer value1, Integer value2) {
            addCriterion("crouse_time between", value1, value2, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andCrouseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("crouse_time not between", value1, value2, "crouseTime");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Double value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Double value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Double value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Double value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Double value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Double value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Double> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Double> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Double value1, Double value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Double value1, Double value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andOnchooseIsNull() {
            addCriterion("onchoose is null");
            return (Criteria) this;
        }

        public Criteria andOnchooseIsNotNull() {
            addCriterion("onchoose is not null");
            return (Criteria) this;
        }

        public Criteria andOnchooseEqualTo(String value) {
            addCriterion("onchoose =", value, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseNotEqualTo(String value) {
            addCriterion("onchoose <>", value, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseGreaterThan(String value) {
            addCriterion("onchoose >", value, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseGreaterThanOrEqualTo(String value) {
            addCriterion("onchoose >=", value, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseLessThan(String value) {
            addCriterion("onchoose <", value, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseLessThanOrEqualTo(String value) {
            addCriterion("onchoose <=", value, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseLike(String value) {
            addCriterion("onchoose like", value, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseNotLike(String value) {
            addCriterion("onchoose not like", value, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseIn(List<String> values) {
            addCriterion("onchoose in", values, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseNotIn(List<String> values) {
            addCriterion("onchoose not in", values, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseBetween(String value1, String value2) {
            addCriterion("onchoose between", value1, value2, "onchoose");
            return (Criteria) this;
        }

        public Criteria andOnchooseNotBetween(String value1, String value2) {
            addCriterion("onchoose not between", value1, value2, "onchoose");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceIsNull() {
            addCriterion("crouse_introduce is null");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceIsNotNull() {
            addCriterion("crouse_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceEqualTo(String value) {
            addCriterion("crouse_introduce =", value, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceNotEqualTo(String value) {
            addCriterion("crouse_introduce <>", value, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceGreaterThan(String value) {
            addCriterion("crouse_introduce >", value, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("crouse_introduce >=", value, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceLessThan(String value) {
            addCriterion("crouse_introduce <", value, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceLessThanOrEqualTo(String value) {
            addCriterion("crouse_introduce <=", value, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceLike(String value) {
            addCriterion("crouse_introduce like", value, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceNotLike(String value) {
            addCriterion("crouse_introduce not like", value, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceIn(List<String> values) {
            addCriterion("crouse_introduce in", values, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceNotIn(List<String> values) {
            addCriterion("crouse_introduce not in", values, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceBetween(String value1, String value2) {
            addCriterion("crouse_introduce between", value1, value2, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andCrouseIntroduceNotBetween(String value1, String value2) {
            addCriterion("crouse_introduce not between", value1, value2, "crouseIntroduce");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
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