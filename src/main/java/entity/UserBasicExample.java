package entity;

import java.util.ArrayList;
import java.util.List;

public class UserBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBasicExample() {
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

        public Criteria andUbidIsNull() {
            addCriterion("UBID is null");
            return (Criteria) this;
        }

        public Criteria andUbidIsNotNull() {
            addCriterion("UBID is not null");
            return (Criteria) this;
        }

        public Criteria andUbidEqualTo(Integer value) {
            addCriterion("UBID =", value, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbidNotEqualTo(Integer value) {
            addCriterion("UBID <>", value, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbidGreaterThan(Integer value) {
            addCriterion("UBID >", value, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UBID >=", value, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbidLessThan(Integer value) {
            addCriterion("UBID <", value, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbidLessThanOrEqualTo(Integer value) {
            addCriterion("UBID <=", value, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbidIn(List<Integer> values) {
            addCriterion("UBID in", values, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbidNotIn(List<Integer> values) {
            addCriterion("UBID not in", values, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbidBetween(Integer value1, Integer value2) {
            addCriterion("UBID between", value1, value2, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbidNotBetween(Integer value1, Integer value2) {
            addCriterion("UBID not between", value1, value2, "ubid");
            return (Criteria) this;
        }

        public Criteria andUbphoneIsNull() {
            addCriterion("UBPHONE is null");
            return (Criteria) this;
        }

        public Criteria andUbphoneIsNotNull() {
            addCriterion("UBPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUbphoneEqualTo(Integer value) {
            addCriterion("UBPHONE =", value, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbphoneNotEqualTo(Integer value) {
            addCriterion("UBPHONE <>", value, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbphoneGreaterThan(Integer value) {
            addCriterion("UBPHONE >", value, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("UBPHONE >=", value, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbphoneLessThan(Integer value) {
            addCriterion("UBPHONE <", value, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbphoneLessThanOrEqualTo(Integer value) {
            addCriterion("UBPHONE <=", value, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbphoneIn(List<Integer> values) {
            addCriterion("UBPHONE in", values, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbphoneNotIn(List<Integer> values) {
            addCriterion("UBPHONE not in", values, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbphoneBetween(Integer value1, Integer value2) {
            addCriterion("UBPHONE between", value1, value2, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("UBPHONE not between", value1, value2, "ubphone");
            return (Criteria) this;
        }

        public Criteria andUbemailIsNull() {
            addCriterion("UBEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUbemailIsNotNull() {
            addCriterion("UBEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUbemailEqualTo(String value) {
            addCriterion("UBEMAIL =", value, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailNotEqualTo(String value) {
            addCriterion("UBEMAIL <>", value, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailGreaterThan(String value) {
            addCriterion("UBEMAIL >", value, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailGreaterThanOrEqualTo(String value) {
            addCriterion("UBEMAIL >=", value, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailLessThan(String value) {
            addCriterion("UBEMAIL <", value, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailLessThanOrEqualTo(String value) {
            addCriterion("UBEMAIL <=", value, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailLike(String value) {
            addCriterion("UBEMAIL like", value, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailNotLike(String value) {
            addCriterion("UBEMAIL not like", value, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailIn(List<String> values) {
            addCriterion("UBEMAIL in", values, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailNotIn(List<String> values) {
            addCriterion("UBEMAIL not in", values, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailBetween(String value1, String value2) {
            addCriterion("UBEMAIL between", value1, value2, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbemailNotBetween(String value1, String value2) {
            addCriterion("UBEMAIL not between", value1, value2, "ubemail");
            return (Criteria) this;
        }

        public Criteria andUbpwdIsNull() {
            addCriterion("UBPWD is null");
            return (Criteria) this;
        }

        public Criteria andUbpwdIsNotNull() {
            addCriterion("UBPWD is not null");
            return (Criteria) this;
        }

        public Criteria andUbpwdEqualTo(String value) {
            addCriterion("UBPWD =", value, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdNotEqualTo(String value) {
            addCriterion("UBPWD <>", value, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdGreaterThan(String value) {
            addCriterion("UBPWD >", value, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdGreaterThanOrEqualTo(String value) {
            addCriterion("UBPWD >=", value, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdLessThan(String value) {
            addCriterion("UBPWD <", value, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdLessThanOrEqualTo(String value) {
            addCriterion("UBPWD <=", value, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdLike(String value) {
            addCriterion("UBPWD like", value, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdNotLike(String value) {
            addCriterion("UBPWD not like", value, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdIn(List<String> values) {
            addCriterion("UBPWD in", values, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdNotIn(List<String> values) {
            addCriterion("UBPWD not in", values, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdBetween(String value1, String value2) {
            addCriterion("UBPWD between", value1, value2, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbpwdNotBetween(String value1, String value2) {
            addCriterion("UBPWD not between", value1, value2, "ubpwd");
            return (Criteria) this;
        }

        public Criteria andUbnameIsNull() {
            addCriterion("UBNAME is null");
            return (Criteria) this;
        }

        public Criteria andUbnameIsNotNull() {
            addCriterion("UBNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUbnameEqualTo(String value) {
            addCriterion("UBNAME =", value, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameNotEqualTo(String value) {
            addCriterion("UBNAME <>", value, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameGreaterThan(String value) {
            addCriterion("UBNAME >", value, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameGreaterThanOrEqualTo(String value) {
            addCriterion("UBNAME >=", value, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameLessThan(String value) {
            addCriterion("UBNAME <", value, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameLessThanOrEqualTo(String value) {
            addCriterion("UBNAME <=", value, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameLike(String value) {
            addCriterion("UBNAME like", value, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameNotLike(String value) {
            addCriterion("UBNAME not like", value, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameIn(List<String> values) {
            addCriterion("UBNAME in", values, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameNotIn(List<String> values) {
            addCriterion("UBNAME not in", values, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameBetween(String value1, String value2) {
            addCriterion("UBNAME between", value1, value2, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbnameNotBetween(String value1, String value2) {
            addCriterion("UBNAME not between", value1, value2, "ubname");
            return (Criteria) this;
        }

        public Criteria andUbsexIsNull() {
            addCriterion("UBSEX is null");
            return (Criteria) this;
        }

        public Criteria andUbsexIsNotNull() {
            addCriterion("UBSEX is not null");
            return (Criteria) this;
        }

        public Criteria andUbsexEqualTo(String value) {
            addCriterion("UBSEX =", value, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexNotEqualTo(String value) {
            addCriterion("UBSEX <>", value, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexGreaterThan(String value) {
            addCriterion("UBSEX >", value, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexGreaterThanOrEqualTo(String value) {
            addCriterion("UBSEX >=", value, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexLessThan(String value) {
            addCriterion("UBSEX <", value, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexLessThanOrEqualTo(String value) {
            addCriterion("UBSEX <=", value, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexLike(String value) {
            addCriterion("UBSEX like", value, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexNotLike(String value) {
            addCriterion("UBSEX not like", value, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexIn(List<String> values) {
            addCriterion("UBSEX in", values, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexNotIn(List<String> values) {
            addCriterion("UBSEX not in", values, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexBetween(String value1, String value2) {
            addCriterion("UBSEX between", value1, value2, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbsexNotBetween(String value1, String value2) {
            addCriterion("UBSEX not between", value1, value2, "ubsex");
            return (Criteria) this;
        }

        public Criteria andUbbirthIsNull() {
            addCriterion("UBBIRTH is null");
            return (Criteria) this;
        }

        public Criteria andUbbirthIsNotNull() {
            addCriterion("UBBIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andUbbirthEqualTo(String value) {
            addCriterion("UBBIRTH =", value, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthNotEqualTo(String value) {
            addCriterion("UBBIRTH <>", value, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthGreaterThan(String value) {
            addCriterion("UBBIRTH >", value, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthGreaterThanOrEqualTo(String value) {
            addCriterion("UBBIRTH >=", value, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthLessThan(String value) {
            addCriterion("UBBIRTH <", value, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthLessThanOrEqualTo(String value) {
            addCriterion("UBBIRTH <=", value, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthLike(String value) {
            addCriterion("UBBIRTH like", value, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthNotLike(String value) {
            addCriterion("UBBIRTH not like", value, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthIn(List<String> values) {
            addCriterion("UBBIRTH in", values, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthNotIn(List<String> values) {
            addCriterion("UBBIRTH not in", values, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthBetween(String value1, String value2) {
            addCriterion("UBBIRTH between", value1, value2, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbbirthNotBetween(String value1, String value2) {
            addCriterion("UBBIRTH not between", value1, value2, "ubbirth");
            return (Criteria) this;
        }

        public Criteria andUbheightIsNull() {
            addCriterion("UBHEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andUbheightIsNotNull() {
            addCriterion("UBHEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andUbheightEqualTo(Integer value) {
            addCriterion("UBHEIGHT =", value, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbheightNotEqualTo(Integer value) {
            addCriterion("UBHEIGHT <>", value, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbheightGreaterThan(Integer value) {
            addCriterion("UBHEIGHT >", value, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbheightGreaterThanOrEqualTo(Integer value) {
            addCriterion("UBHEIGHT >=", value, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbheightLessThan(Integer value) {
            addCriterion("UBHEIGHT <", value, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbheightLessThanOrEqualTo(Integer value) {
            addCriterion("UBHEIGHT <=", value, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbheightIn(List<Integer> values) {
            addCriterion("UBHEIGHT in", values, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbheightNotIn(List<Integer> values) {
            addCriterion("UBHEIGHT not in", values, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbheightBetween(Integer value1, Integer value2) {
            addCriterion("UBHEIGHT between", value1, value2, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbheightNotBetween(Integer value1, Integer value2) {
            addCriterion("UBHEIGHT not between", value1, value2, "ubheight");
            return (Criteria) this;
        }

        public Criteria andUbdegreeIsNull() {
            addCriterion("UBDEGREE is null");
            return (Criteria) this;
        }

        public Criteria andUbdegreeIsNotNull() {
            addCriterion("UBDEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andUbdegreeEqualTo(String value) {
            addCriterion("UBDEGREE =", value, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeNotEqualTo(String value) {
            addCriterion("UBDEGREE <>", value, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeGreaterThan(String value) {
            addCriterion("UBDEGREE >", value, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("UBDEGREE >=", value, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeLessThan(String value) {
            addCriterion("UBDEGREE <", value, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeLessThanOrEqualTo(String value) {
            addCriterion("UBDEGREE <=", value, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeLike(String value) {
            addCriterion("UBDEGREE like", value, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeNotLike(String value) {
            addCriterion("UBDEGREE not like", value, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeIn(List<String> values) {
            addCriterion("UBDEGREE in", values, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeNotIn(List<String> values) {
            addCriterion("UBDEGREE not in", values, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeBetween(String value1, String value2) {
            addCriterion("UBDEGREE between", value1, value2, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbdegreeNotBetween(String value1, String value2) {
            addCriterion("UBDEGREE not between", value1, value2, "ubdegree");
            return (Criteria) this;
        }

        public Criteria andUbapartmentIsNull() {
            addCriterion("UBAPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andUbapartmentIsNotNull() {
            addCriterion("UBAPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andUbapartmentEqualTo(String value) {
            addCriterion("UBAPARTMENT =", value, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentNotEqualTo(String value) {
            addCriterion("UBAPARTMENT <>", value, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentGreaterThan(String value) {
            addCriterion("UBAPARTMENT >", value, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentGreaterThanOrEqualTo(String value) {
            addCriterion("UBAPARTMENT >=", value, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentLessThan(String value) {
            addCriterion("UBAPARTMENT <", value, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentLessThanOrEqualTo(String value) {
            addCriterion("UBAPARTMENT <=", value, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentLike(String value) {
            addCriterion("UBAPARTMENT like", value, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentNotLike(String value) {
            addCriterion("UBAPARTMENT not like", value, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentIn(List<String> values) {
            addCriterion("UBAPARTMENT in", values, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentNotIn(List<String> values) {
            addCriterion("UBAPARTMENT not in", values, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentBetween(String value1, String value2) {
            addCriterion("UBAPARTMENT between", value1, value2, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbapartmentNotBetween(String value1, String value2) {
            addCriterion("UBAPARTMENT not between", value1, value2, "ubapartment");
            return (Criteria) this;
        }

        public Criteria andUbsalIsNull() {
            addCriterion("UBSAL is null");
            return (Criteria) this;
        }

        public Criteria andUbsalIsNotNull() {
            addCriterion("UBSAL is not null");
            return (Criteria) this;
        }

        public Criteria andUbsalEqualTo(String value) {
            addCriterion("UBSAL =", value, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalNotEqualTo(String value) {
            addCriterion("UBSAL <>", value, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalGreaterThan(String value) {
            addCriterion("UBSAL >", value, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalGreaterThanOrEqualTo(String value) {
            addCriterion("UBSAL >=", value, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalLessThan(String value) {
            addCriterion("UBSAL <", value, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalLessThanOrEqualTo(String value) {
            addCriterion("UBSAL <=", value, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalLike(String value) {
            addCriterion("UBSAL like", value, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalNotLike(String value) {
            addCriterion("UBSAL not like", value, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalIn(List<String> values) {
            addCriterion("UBSAL in", values, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalNotIn(List<String> values) {
            addCriterion("UBSAL not in", values, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalBetween(String value1, String value2) {
            addCriterion("UBSAL between", value1, value2, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbsalNotBetween(String value1, String value2) {
            addCriterion("UBSAL not between", value1, value2, "ubsal");
            return (Criteria) this;
        }

        public Criteria andUbrightIsNull() {
            addCriterion("UBRIGHT is null");
            return (Criteria) this;
        }

        public Criteria andUbrightIsNotNull() {
            addCriterion("UBRIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andUbrightEqualTo(String value) {
            addCriterion("UBRIGHT =", value, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightNotEqualTo(String value) {
            addCriterion("UBRIGHT <>", value, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightGreaterThan(String value) {
            addCriterion("UBRIGHT >", value, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightGreaterThanOrEqualTo(String value) {
            addCriterion("UBRIGHT >=", value, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightLessThan(String value) {
            addCriterion("UBRIGHT <", value, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightLessThanOrEqualTo(String value) {
            addCriterion("UBRIGHT <=", value, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightLike(String value) {
            addCriterion("UBRIGHT like", value, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightNotLike(String value) {
            addCriterion("UBRIGHT not like", value, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightIn(List<String> values) {
            addCriterion("UBRIGHT in", values, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightNotIn(List<String> values) {
            addCriterion("UBRIGHT not in", values, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightBetween(String value1, String value2) {
            addCriterion("UBRIGHT between", value1, value2, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbrightNotBetween(String value1, String value2) {
            addCriterion("UBRIGHT not between", value1, value2, "ubright");
            return (Criteria) this;
        }

        public Criteria andUbintroduceIsNull() {
            addCriterion("UBINTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andUbintroduceIsNotNull() {
            addCriterion("UBINTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andUbintroduceEqualTo(String value) {
            addCriterion("UBINTRODUCE =", value, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceNotEqualTo(String value) {
            addCriterion("UBINTRODUCE <>", value, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceGreaterThan(String value) {
            addCriterion("UBINTRODUCE >", value, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("UBINTRODUCE >=", value, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceLessThan(String value) {
            addCriterion("UBINTRODUCE <", value, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceLessThanOrEqualTo(String value) {
            addCriterion("UBINTRODUCE <=", value, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceLike(String value) {
            addCriterion("UBINTRODUCE like", value, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceNotLike(String value) {
            addCriterion("UBINTRODUCE not like", value, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceIn(List<String> values) {
            addCriterion("UBINTRODUCE in", values, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceNotIn(List<String> values) {
            addCriterion("UBINTRODUCE not in", values, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceBetween(String value1, String value2) {
            addCriterion("UBINTRODUCE between", value1, value2, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbintroduceNotBetween(String value1, String value2) {
            addCriterion("UBINTRODUCE not between", value1, value2, "ubintroduce");
            return (Criteria) this;
        }

        public Criteria andUbphotoIsNull() {
            addCriterion("UBPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andUbphotoIsNotNull() {
            addCriterion("UBPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andUbphotoEqualTo(String value) {
            addCriterion("UBPHOTO =", value, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoNotEqualTo(String value) {
            addCriterion("UBPHOTO <>", value, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoGreaterThan(String value) {
            addCriterion("UBPHOTO >", value, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoGreaterThanOrEqualTo(String value) {
            addCriterion("UBPHOTO >=", value, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoLessThan(String value) {
            addCriterion("UBPHOTO <", value, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoLessThanOrEqualTo(String value) {
            addCriterion("UBPHOTO <=", value, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoLike(String value) {
            addCriterion("UBPHOTO like", value, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoNotLike(String value) {
            addCriterion("UBPHOTO not like", value, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoIn(List<String> values) {
            addCriterion("UBPHOTO in", values, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoNotIn(List<String> values) {
            addCriterion("UBPHOTO not in", values, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoBetween(String value1, String value2) {
            addCriterion("UBPHOTO between", value1, value2, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbphotoNotBetween(String value1, String value2) {
            addCriterion("UBPHOTO not between", value1, value2, "ubphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoIsNull() {
            addCriterion("UBIMGPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoIsNotNull() {
            addCriterion("UBIMGPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoEqualTo(String value) {
            addCriterion("UBIMGPHOTO =", value, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoNotEqualTo(String value) {
            addCriterion("UBIMGPHOTO <>", value, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoGreaterThan(String value) {
            addCriterion("UBIMGPHOTO >", value, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoGreaterThanOrEqualTo(String value) {
            addCriterion("UBIMGPHOTO >=", value, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoLessThan(String value) {
            addCriterion("UBIMGPHOTO <", value, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoLessThanOrEqualTo(String value) {
            addCriterion("UBIMGPHOTO <=", value, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoLike(String value) {
            addCriterion("UBIMGPHOTO like", value, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoNotLike(String value) {
            addCriterion("UBIMGPHOTO not like", value, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoIn(List<String> values) {
            addCriterion("UBIMGPHOTO in", values, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoNotIn(List<String> values) {
            addCriterion("UBIMGPHOTO not in", values, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoBetween(String value1, String value2) {
            addCriterion("UBIMGPHOTO between", value1, value2, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbimgphotoNotBetween(String value1, String value2) {
            addCriterion("UBIMGPHOTO not between", value1, value2, "ubimgphoto");
            return (Criteria) this;
        }

        public Criteria andUbhanIsNull() {
            addCriterion("UBHAN is null");
            return (Criteria) this;
        }

        public Criteria andUbhanIsNotNull() {
            addCriterion("UBHAN is not null");
            return (Criteria) this;
        }

        public Criteria andUbhanEqualTo(String value) {
            addCriterion("UBHAN =", value, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanNotEqualTo(String value) {
            addCriterion("UBHAN <>", value, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanGreaterThan(String value) {
            addCriterion("UBHAN >", value, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanGreaterThanOrEqualTo(String value) {
            addCriterion("UBHAN >=", value, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanLessThan(String value) {
            addCriterion("UBHAN <", value, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanLessThanOrEqualTo(String value) {
            addCriterion("UBHAN <=", value, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanLike(String value) {
            addCriterion("UBHAN like", value, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanNotLike(String value) {
            addCriterion("UBHAN not like", value, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanIn(List<String> values) {
            addCriterion("UBHAN in", values, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanNotIn(List<String> values) {
            addCriterion("UBHAN not in", values, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanBetween(String value1, String value2) {
            addCriterion("UBHAN between", value1, value2, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUbhanNotBetween(String value1, String value2) {
            addCriterion("UBHAN not between", value1, value2, "ubhan");
            return (Criteria) this;
        }

        public Criteria andUblookforIsNull() {
            addCriterion("UBLOOKFOR is null");
            return (Criteria) this;
        }

        public Criteria andUblookforIsNotNull() {
            addCriterion("UBLOOKFOR is not null");
            return (Criteria) this;
        }

        public Criteria andUblookforEqualTo(String value) {
            addCriterion("UBLOOKFOR =", value, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforNotEqualTo(String value) {
            addCriterion("UBLOOKFOR <>", value, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforGreaterThan(String value) {
            addCriterion("UBLOOKFOR >", value, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforGreaterThanOrEqualTo(String value) {
            addCriterion("UBLOOKFOR >=", value, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforLessThan(String value) {
            addCriterion("UBLOOKFOR <", value, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforLessThanOrEqualTo(String value) {
            addCriterion("UBLOOKFOR <=", value, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforLike(String value) {
            addCriterion("UBLOOKFOR like", value, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforNotLike(String value) {
            addCriterion("UBLOOKFOR not like", value, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforIn(List<String> values) {
            addCriterion("UBLOOKFOR in", values, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforNotIn(List<String> values) {
            addCriterion("UBLOOKFOR not in", values, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforBetween(String value1, String value2) {
            addCriterion("UBLOOKFOR between", value1, value2, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUblookforNotBetween(String value1, String value2) {
            addCriterion("UBLOOKFOR not between", value1, value2, "ublookfor");
            return (Criteria) this;
        }

        public Criteria andUbweightIsNull() {
            addCriterion("UBWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andUbweightIsNotNull() {
            addCriterion("UBWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andUbweightEqualTo(Integer value) {
            addCriterion("UBWEIGHT =", value, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbweightNotEqualTo(Integer value) {
            addCriterion("UBWEIGHT <>", value, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbweightGreaterThan(Integer value) {
            addCriterion("UBWEIGHT >", value, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("UBWEIGHT >=", value, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbweightLessThan(Integer value) {
            addCriterion("UBWEIGHT <", value, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbweightLessThanOrEqualTo(Integer value) {
            addCriterion("UBWEIGHT <=", value, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbweightIn(List<Integer> values) {
            addCriterion("UBWEIGHT in", values, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbweightNotIn(List<Integer> values) {
            addCriterion("UBWEIGHT not in", values, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbweightBetween(Integer value1, Integer value2) {
            addCriterion("UBWEIGHT between", value1, value2, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbweightNotBetween(Integer value1, Integer value2) {
            addCriterion("UBWEIGHT not between", value1, value2, "ubweight");
            return (Criteria) this;
        }

        public Criteria andUbschoolIsNull() {
            addCriterion("UBSCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andUbschoolIsNotNull() {
            addCriterion("UBSCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andUbschoolEqualTo(String value) {
            addCriterion("UBSCHOOL =", value, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolNotEqualTo(String value) {
            addCriterion("UBSCHOOL <>", value, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolGreaterThan(String value) {
            addCriterion("UBSCHOOL >", value, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolGreaterThanOrEqualTo(String value) {
            addCriterion("UBSCHOOL >=", value, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolLessThan(String value) {
            addCriterion("UBSCHOOL <", value, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolLessThanOrEqualTo(String value) {
            addCriterion("UBSCHOOL <=", value, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolLike(String value) {
            addCriterion("UBSCHOOL like", value, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolNotLike(String value) {
            addCriterion("UBSCHOOL not like", value, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolIn(List<String> values) {
            addCriterion("UBSCHOOL in", values, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolNotIn(List<String> values) {
            addCriterion("UBSCHOOL not in", values, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolBetween(String value1, String value2) {
            addCriterion("UBSCHOOL between", value1, value2, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbschoolNotBetween(String value1, String value2) {
            addCriterion("UBSCHOOL not between", value1, value2, "ubschool");
            return (Criteria) this;
        }

        public Criteria andUbprofessionIsNull() {
            addCriterion("UBPROFESSION is null");
            return (Criteria) this;
        }

        public Criteria andUbprofessionIsNotNull() {
            addCriterion("UBPROFESSION is not null");
            return (Criteria) this;
        }

        public Criteria andUbprofessionEqualTo(String value) {
            addCriterion("UBPROFESSION =", value, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionNotEqualTo(String value) {
            addCriterion("UBPROFESSION <>", value, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionGreaterThan(String value) {
            addCriterion("UBPROFESSION >", value, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionGreaterThanOrEqualTo(String value) {
            addCriterion("UBPROFESSION >=", value, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionLessThan(String value) {
            addCriterion("UBPROFESSION <", value, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionLessThanOrEqualTo(String value) {
            addCriterion("UBPROFESSION <=", value, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionLike(String value) {
            addCriterion("UBPROFESSION like", value, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionNotLike(String value) {
            addCriterion("UBPROFESSION not like", value, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionIn(List<String> values) {
            addCriterion("UBPROFESSION in", values, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionNotIn(List<String> values) {
            addCriterion("UBPROFESSION not in", values, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionBetween(String value1, String value2) {
            addCriterion("UBPROFESSION between", value1, value2, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbprofessionNotBetween(String value1, String value2) {
            addCriterion("UBPROFESSION not between", value1, value2, "ubprofession");
            return (Criteria) this;
        }

        public Criteria andUbcomparryIsNull() {
            addCriterion("UBCOMPARRY is null");
            return (Criteria) this;
        }

        public Criteria andUbcomparryIsNotNull() {
            addCriterion("UBCOMPARRY is not null");
            return (Criteria) this;
        }

        public Criteria andUbcomparryEqualTo(String value) {
            addCriterion("UBCOMPARRY =", value, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryNotEqualTo(String value) {
            addCriterion("UBCOMPARRY <>", value, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryGreaterThan(String value) {
            addCriterion("UBCOMPARRY >", value, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryGreaterThanOrEqualTo(String value) {
            addCriterion("UBCOMPARRY >=", value, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryLessThan(String value) {
            addCriterion("UBCOMPARRY <", value, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryLessThanOrEqualTo(String value) {
            addCriterion("UBCOMPARRY <=", value, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryLike(String value) {
            addCriterion("UBCOMPARRY like", value, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryNotLike(String value) {
            addCriterion("UBCOMPARRY not like", value, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryIn(List<String> values) {
            addCriterion("UBCOMPARRY in", values, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryNotIn(List<String> values) {
            addCriterion("UBCOMPARRY not in", values, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryBetween(String value1, String value2) {
            addCriterion("UBCOMPARRY between", value1, value2, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbcomparryNotBetween(String value1, String value2) {
            addCriterion("UBCOMPARRY not between", value1, value2, "ubcomparry");
            return (Criteria) this;
        }

        public Criteria andUbpositionIsNull() {
            addCriterion("UBPOSITION is null");
            return (Criteria) this;
        }

        public Criteria andUbpositionIsNotNull() {
            addCriterion("UBPOSITION is not null");
            return (Criteria) this;
        }

        public Criteria andUbpositionEqualTo(String value) {
            addCriterion("UBPOSITION =", value, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionNotEqualTo(String value) {
            addCriterion("UBPOSITION <>", value, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionGreaterThan(String value) {
            addCriterion("UBPOSITION >", value, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionGreaterThanOrEqualTo(String value) {
            addCriterion("UBPOSITION >=", value, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionLessThan(String value) {
            addCriterion("UBPOSITION <", value, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionLessThanOrEqualTo(String value) {
            addCriterion("UBPOSITION <=", value, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionLike(String value) {
            addCriterion("UBPOSITION like", value, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionNotLike(String value) {
            addCriterion("UBPOSITION not like", value, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionIn(List<String> values) {
            addCriterion("UBPOSITION in", values, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionNotIn(List<String> values) {
            addCriterion("UBPOSITION not in", values, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionBetween(String value1, String value2) {
            addCriterion("UBPOSITION between", value1, value2, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUbpositionNotBetween(String value1, String value2) {
            addCriterion("UBPOSITION not between", value1, value2, "ubposition");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeIsNull() {
            addCriterion("UBLASTLOGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeIsNotNull() {
            addCriterion("UBLASTLOGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeEqualTo(String value) {
            addCriterion("UBLASTLOGINTIME =", value, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeNotEqualTo(String value) {
            addCriterion("UBLASTLOGINTIME <>", value, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeGreaterThan(String value) {
            addCriterion("UBLASTLOGINTIME >", value, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("UBLASTLOGINTIME >=", value, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeLessThan(String value) {
            addCriterion("UBLASTLOGINTIME <", value, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeLessThanOrEqualTo(String value) {
            addCriterion("UBLASTLOGINTIME <=", value, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeLike(String value) {
            addCriterion("UBLASTLOGINTIME like", value, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeNotLike(String value) {
            addCriterion("UBLASTLOGINTIME not like", value, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeIn(List<String> values) {
            addCriterion("UBLASTLOGINTIME in", values, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeNotIn(List<String> values) {
            addCriterion("UBLASTLOGINTIME not in", values, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeBetween(String value1, String value2) {
            addCriterion("UBLASTLOGINTIME between", value1, value2, "ublastlogintime");
            return (Criteria) this;
        }

        public Criteria andUblastlogintimeNotBetween(String value1, String value2) {
            addCriterion("UBLASTLOGINTIME not between", value1, value2, "ublastlogintime");
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