package com.yi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andTecnameIsNull() {
            addCriterion("tecname is null");
            return (Criteria) this;
        }

        public Criteria andTecnameIsNotNull() {
            addCriterion("tecname is not null");
            return (Criteria) this;
        }

        public Criteria andTecnameEqualTo(String value) {
            addCriterion("tecname =", value, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameNotEqualTo(String value) {
            addCriterion("tecname <>", value, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameGreaterThan(String value) {
            addCriterion("tecname >", value, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameGreaterThanOrEqualTo(String value) {
            addCriterion("tecname >=", value, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameLessThan(String value) {
            addCriterion("tecname <", value, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameLessThanOrEqualTo(String value) {
            addCriterion("tecname <=", value, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameLike(String value) {
            addCriterion("tecname like", value, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameNotLike(String value) {
            addCriterion("tecname not like", value, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameIn(List<String> values) {
            addCriterion("tecname in", values, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameNotIn(List<String> values) {
            addCriterion("tecname not in", values, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameBetween(String value1, String value2) {
            addCriterion("tecname between", value1, value2, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecnameNotBetween(String value1, String value2) {
            addCriterion("tecname not between", value1, value2, "tecname");
            return (Criteria) this;
        }

        public Criteria andTecpasswordIsNull() {
            addCriterion("tecpassword is null");
            return (Criteria) this;
        }

        public Criteria andTecpasswordIsNotNull() {
            addCriterion("tecpassword is not null");
            return (Criteria) this;
        }

        public Criteria andTecpasswordEqualTo(String value) {
            addCriterion("tecpassword =", value, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordNotEqualTo(String value) {
            addCriterion("tecpassword <>", value, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordGreaterThan(String value) {
            addCriterion("tecpassword >", value, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("tecpassword >=", value, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordLessThan(String value) {
            addCriterion("tecpassword <", value, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordLessThanOrEqualTo(String value) {
            addCriterion("tecpassword <=", value, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordLike(String value) {
            addCriterion("tecpassword like", value, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordNotLike(String value) {
            addCriterion("tecpassword not like", value, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordIn(List<String> values) {
            addCriterion("tecpassword in", values, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordNotIn(List<String> values) {
            addCriterion("tecpassword not in", values, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordBetween(String value1, String value2) {
            addCriterion("tecpassword between", value1, value2, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andTecpasswordNotBetween(String value1, String value2) {
            addCriterion("tecpassword not between", value1, value2, "tecpassword");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andTecageIsNull() {
            addCriterion("tecage is null");
            return (Criteria) this;
        }

        public Criteria andTecageIsNotNull() {
            addCriterion("tecage is not null");
            return (Criteria) this;
        }

        public Criteria andTecageEqualTo(Integer value) {
            addCriterion("tecage =", value, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecageNotEqualTo(Integer value) {
            addCriterion("tecage <>", value, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecageGreaterThan(Integer value) {
            addCriterion("tecage >", value, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tecage >=", value, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecageLessThan(Integer value) {
            addCriterion("tecage <", value, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecageLessThanOrEqualTo(Integer value) {
            addCriterion("tecage <=", value, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecageIn(List<Integer> values) {
            addCriterion("tecage in", values, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecageNotIn(List<Integer> values) {
            addCriterion("tecage not in", values, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecageBetween(Integer value1, Integer value2) {
            addCriterion("tecage between", value1, value2, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecageNotBetween(Integer value1, Integer value2) {
            addCriterion("tecage not between", value1, value2, "tecage");
            return (Criteria) this;
        }

        public Criteria andTecsexIsNull() {
            addCriterion("tecsex is null");
            return (Criteria) this;
        }

        public Criteria andTecsexIsNotNull() {
            addCriterion("tecsex is not null");
            return (Criteria) this;
        }

        public Criteria andTecsexEqualTo(String value) {
            addCriterion("tecsex =", value, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexNotEqualTo(String value) {
            addCriterion("tecsex <>", value, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexGreaterThan(String value) {
            addCriterion("tecsex >", value, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexGreaterThanOrEqualTo(String value) {
            addCriterion("tecsex >=", value, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexLessThan(String value) {
            addCriterion("tecsex <", value, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexLessThanOrEqualTo(String value) {
            addCriterion("tecsex <=", value, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexLike(String value) {
            addCriterion("tecsex like", value, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexNotLike(String value) {
            addCriterion("tecsex not like", value, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexIn(List<String> values) {
            addCriterion("tecsex in", values, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexNotIn(List<String> values) {
            addCriterion("tecsex not in", values, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexBetween(String value1, String value2) {
            addCriterion("tecsex between", value1, value2, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecsexNotBetween(String value1, String value2) {
            addCriterion("tecsex not between", value1, value2, "tecsex");
            return (Criteria) this;
        }

        public Criteria andTecmajorIsNull() {
            addCriterion("tecmajor is null");
            return (Criteria) this;
        }

        public Criteria andTecmajorIsNotNull() {
            addCriterion("tecmajor is not null");
            return (Criteria) this;
        }

        public Criteria andTecmajorEqualTo(String value) {
            addCriterion("tecmajor =", value, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorNotEqualTo(String value) {
            addCriterion("tecmajor <>", value, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorGreaterThan(String value) {
            addCriterion("tecmajor >", value, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorGreaterThanOrEqualTo(String value) {
            addCriterion("tecmajor >=", value, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorLessThan(String value) {
            addCriterion("tecmajor <", value, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorLessThanOrEqualTo(String value) {
            addCriterion("tecmajor <=", value, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorLike(String value) {
            addCriterion("tecmajor like", value, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorNotLike(String value) {
            addCriterion("tecmajor not like", value, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorIn(List<String> values) {
            addCriterion("tecmajor in", values, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorNotIn(List<String> values) {
            addCriterion("tecmajor not in", values, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorBetween(String value1, String value2) {
            addCriterion("tecmajor between", value1, value2, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andTecmajorNotBetween(String value1, String value2) {
            addCriterion("tecmajor not between", value1, value2, "tecmajor");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registertime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registertime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("registertime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("registertime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("registertime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registertime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("registertime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("registertime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("registertime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("registertime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("registertime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("registertime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTecintroduceIsNull() {
            addCriterion("tecintroduce is null");
            return (Criteria) this;
        }

        public Criteria andTecintroduceIsNotNull() {
            addCriterion("tecintroduce is not null");
            return (Criteria) this;
        }

        public Criteria andTecintroduceEqualTo(String value) {
            addCriterion("tecintroduce =", value, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceNotEqualTo(String value) {
            addCriterion("tecintroduce <>", value, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceGreaterThan(String value) {
            addCriterion("tecintroduce >", value, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("tecintroduce >=", value, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceLessThan(String value) {
            addCriterion("tecintroduce <", value, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceLessThanOrEqualTo(String value) {
            addCriterion("tecintroduce <=", value, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceLike(String value) {
            addCriterion("tecintroduce like", value, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceNotLike(String value) {
            addCriterion("tecintroduce not like", value, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceIn(List<String> values) {
            addCriterion("tecintroduce in", values, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceNotIn(List<String> values) {
            addCriterion("tecintroduce not in", values, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceBetween(String value1, String value2) {
            addCriterion("tecintroduce between", value1, value2, "tecintroduce");
            return (Criteria) this;
        }

        public Criteria andTecintroduceNotBetween(String value1, String value2) {
            addCriterion("tecintroduce not between", value1, value2, "tecintroduce");
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