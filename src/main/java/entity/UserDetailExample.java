package entity;

import java.util.ArrayList;
import java.util.List;

public class UserDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDetailExample() {
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

        public Criteria andUdidIsNull() {
            addCriterion("UDID is null");
            return (Criteria) this;
        }

        public Criteria andUdidIsNotNull() {
            addCriterion("UDID is not null");
            return (Criteria) this;
        }

        public Criteria andUdidEqualTo(Integer value) {
            addCriterion("UDID =", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotEqualTo(Integer value) {
            addCriterion("UDID <>", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidGreaterThan(Integer value) {
            addCriterion("UDID >", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UDID >=", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidLessThan(Integer value) {
            addCriterion("UDID <", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidLessThanOrEqualTo(Integer value) {
            addCriterion("UDID <=", value, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidIn(List<Integer> values) {
            addCriterion("UDID in", values, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotIn(List<Integer> values) {
            addCriterion("UDID not in", values, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidBetween(Integer value1, Integer value2) {
            addCriterion("UDID between", value1, value2, "udid");
            return (Criteria) this;
        }

        public Criteria andUdidNotBetween(Integer value1, Integer value2) {
            addCriterion("UDID not between", value1, value2, "udid");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdIsNull() {
            addCriterion("UDHOUSEHOLD is null");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdIsNotNull() {
            addCriterion("UDHOUSEHOLD is not null");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdEqualTo(String value) {
            addCriterion("UDHOUSEHOLD =", value, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdNotEqualTo(String value) {
            addCriterion("UDHOUSEHOLD <>", value, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdGreaterThan(String value) {
            addCriterion("UDHOUSEHOLD >", value, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdGreaterThanOrEqualTo(String value) {
            addCriterion("UDHOUSEHOLD >=", value, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdLessThan(String value) {
            addCriterion("UDHOUSEHOLD <", value, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdLessThanOrEqualTo(String value) {
            addCriterion("UDHOUSEHOLD <=", value, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdLike(String value) {
            addCriterion("UDHOUSEHOLD like", value, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdNotLike(String value) {
            addCriterion("UDHOUSEHOLD not like", value, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdIn(List<String> values) {
            addCriterion("UDHOUSEHOLD in", values, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdNotIn(List<String> values) {
            addCriterion("UDHOUSEHOLD not in", values, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdBetween(String value1, String value2) {
            addCriterion("UDHOUSEHOLD between", value1, value2, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseholdNotBetween(String value1, String value2) {
            addCriterion("UDHOUSEHOLD not between", value1, value2, "udhousehold");
            return (Criteria) this;
        }

        public Criteria andUdhouseIsNull() {
            addCriterion("UDHOUSE is null");
            return (Criteria) this;
        }

        public Criteria andUdhouseIsNotNull() {
            addCriterion("UDHOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andUdhouseEqualTo(String value) {
            addCriterion("UDHOUSE =", value, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseNotEqualTo(String value) {
            addCriterion("UDHOUSE <>", value, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseGreaterThan(String value) {
            addCriterion("UDHOUSE >", value, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseGreaterThanOrEqualTo(String value) {
            addCriterion("UDHOUSE >=", value, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseLessThan(String value) {
            addCriterion("UDHOUSE <", value, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseLessThanOrEqualTo(String value) {
            addCriterion("UDHOUSE <=", value, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseLike(String value) {
            addCriterion("UDHOUSE like", value, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseNotLike(String value) {
            addCriterion("UDHOUSE not like", value, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseIn(List<String> values) {
            addCriterion("UDHOUSE in", values, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseNotIn(List<String> values) {
            addCriterion("UDHOUSE not in", values, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseBetween(String value1, String value2) {
            addCriterion("UDHOUSE between", value1, value2, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdhouseNotBetween(String value1, String value2) {
            addCriterion("UDHOUSE not between", value1, value2, "udhouse");
            return (Criteria) this;
        }

        public Criteria andUdcarIsNull() {
            addCriterion("UDCAR is null");
            return (Criteria) this;
        }

        public Criteria andUdcarIsNotNull() {
            addCriterion("UDCAR is not null");
            return (Criteria) this;
        }

        public Criteria andUdcarEqualTo(String value) {
            addCriterion("UDCAR =", value, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarNotEqualTo(String value) {
            addCriterion("UDCAR <>", value, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarGreaterThan(String value) {
            addCriterion("UDCAR >", value, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarGreaterThanOrEqualTo(String value) {
            addCriterion("UDCAR >=", value, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarLessThan(String value) {
            addCriterion("UDCAR <", value, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarLessThanOrEqualTo(String value) {
            addCriterion("UDCAR <=", value, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarLike(String value) {
            addCriterion("UDCAR like", value, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarNotLike(String value) {
            addCriterion("UDCAR not like", value, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarIn(List<String> values) {
            addCriterion("UDCAR in", values, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarNotIn(List<String> values) {
            addCriterion("UDCAR not in", values, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarBetween(String value1, String value2) {
            addCriterion("UDCAR between", value1, value2, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdcarNotBetween(String value1, String value2) {
            addCriterion("UDCAR not between", value1, value2, "udcar");
            return (Criteria) this;
        }

        public Criteria andUdnationIsNull() {
            addCriterion("UDNATION is null");
            return (Criteria) this;
        }

        public Criteria andUdnationIsNotNull() {
            addCriterion("UDNATION is not null");
            return (Criteria) this;
        }

        public Criteria andUdnationEqualTo(String value) {
            addCriterion("UDNATION =", value, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationNotEqualTo(String value) {
            addCriterion("UDNATION <>", value, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationGreaterThan(String value) {
            addCriterion("UDNATION >", value, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationGreaterThanOrEqualTo(String value) {
            addCriterion("UDNATION >=", value, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationLessThan(String value) {
            addCriterion("UDNATION <", value, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationLessThanOrEqualTo(String value) {
            addCriterion("UDNATION <=", value, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationLike(String value) {
            addCriterion("UDNATION like", value, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationNotLike(String value) {
            addCriterion("UDNATION not like", value, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationIn(List<String> values) {
            addCriterion("UDNATION in", values, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationNotIn(List<String> values) {
            addCriterion("UDNATION not in", values, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationBetween(String value1, String value2) {
            addCriterion("UDNATION between", value1, value2, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdnationNotBetween(String value1, String value2) {
            addCriterion("UDNATION not between", value1, value2, "udnation");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceIsNull() {
            addCriterion("UDBIRTHPLACE is null");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceIsNotNull() {
            addCriterion("UDBIRTHPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceEqualTo(String value) {
            addCriterion("UDBIRTHPLACE =", value, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceNotEqualTo(String value) {
            addCriterion("UDBIRTHPLACE <>", value, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceGreaterThan(String value) {
            addCriterion("UDBIRTHPLACE >", value, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("UDBIRTHPLACE >=", value, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceLessThan(String value) {
            addCriterion("UDBIRTHPLACE <", value, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceLessThanOrEqualTo(String value) {
            addCriterion("UDBIRTHPLACE <=", value, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceLike(String value) {
            addCriterion("UDBIRTHPLACE like", value, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceNotLike(String value) {
            addCriterion("UDBIRTHPLACE not like", value, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceIn(List<String> values) {
            addCriterion("UDBIRTHPLACE in", values, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceNotIn(List<String> values) {
            addCriterion("UDBIRTHPLACE not in", values, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceBetween(String value1, String value2) {
            addCriterion("UDBIRTHPLACE between", value1, value2, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdbirthplaceNotBetween(String value1, String value2) {
            addCriterion("UDBIRTHPLACE not between", value1, value2, "udbirthplace");
            return (Criteria) this;
        }

        public Criteria andUdrankIsNull() {
            addCriterion("UDRANK is null");
            return (Criteria) this;
        }

        public Criteria andUdrankIsNotNull() {
            addCriterion("UDRANK is not null");
            return (Criteria) this;
        }

        public Criteria andUdrankEqualTo(String value) {
            addCriterion("UDRANK =", value, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankNotEqualTo(String value) {
            addCriterion("UDRANK <>", value, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankGreaterThan(String value) {
            addCriterion("UDRANK >", value, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankGreaterThanOrEqualTo(String value) {
            addCriterion("UDRANK >=", value, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankLessThan(String value) {
            addCriterion("UDRANK <", value, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankLessThanOrEqualTo(String value) {
            addCriterion("UDRANK <=", value, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankLike(String value) {
            addCriterion("UDRANK like", value, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankNotLike(String value) {
            addCriterion("UDRANK not like", value, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankIn(List<String> values) {
            addCriterion("UDRANK in", values, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankNotIn(List<String> values) {
            addCriterion("UDRANK not in", values, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankBetween(String value1, String value2) {
            addCriterion("UDRANK between", value1, value2, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdrankNotBetween(String value1, String value2) {
            addCriterion("UDRANK not between", value1, value2, "udrank");
            return (Criteria) this;
        }

        public Criteria andUdchildIsNull() {
            addCriterion("UDCHILD is null");
            return (Criteria) this;
        }

        public Criteria andUdchildIsNotNull() {
            addCriterion("UDCHILD is not null");
            return (Criteria) this;
        }

        public Criteria andUdchildEqualTo(String value) {
            addCriterion("UDCHILD =", value, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildNotEqualTo(String value) {
            addCriterion("UDCHILD <>", value, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildGreaterThan(String value) {
            addCriterion("UDCHILD >", value, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildGreaterThanOrEqualTo(String value) {
            addCriterion("UDCHILD >=", value, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildLessThan(String value) {
            addCriterion("UDCHILD <", value, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildLessThanOrEqualTo(String value) {
            addCriterion("UDCHILD <=", value, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildLike(String value) {
            addCriterion("UDCHILD like", value, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildNotLike(String value) {
            addCriterion("UDCHILD not like", value, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildIn(List<String> values) {
            addCriterion("UDCHILD in", values, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildNotIn(List<String> values) {
            addCriterion("UDCHILD not in", values, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildBetween(String value1, String value2) {
            addCriterion("UDCHILD between", value1, value2, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdchildNotBetween(String value1, String value2) {
            addCriterion("UDCHILD not between", value1, value2, "udchild");
            return (Criteria) this;
        }

        public Criteria andUdconstellationIsNull() {
            addCriterion("UDCONSTELLATION is null");
            return (Criteria) this;
        }

        public Criteria andUdconstellationIsNotNull() {
            addCriterion("UDCONSTELLATION is not null");
            return (Criteria) this;
        }

        public Criteria andUdconstellationEqualTo(String value) {
            addCriterion("UDCONSTELLATION =", value, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationNotEqualTo(String value) {
            addCriterion("UDCONSTELLATION <>", value, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationGreaterThan(String value) {
            addCriterion("UDCONSTELLATION >", value, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationGreaterThanOrEqualTo(String value) {
            addCriterion("UDCONSTELLATION >=", value, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationLessThan(String value) {
            addCriterion("UDCONSTELLATION <", value, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationLessThanOrEqualTo(String value) {
            addCriterion("UDCONSTELLATION <=", value, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationLike(String value) {
            addCriterion("UDCONSTELLATION like", value, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationNotLike(String value) {
            addCriterion("UDCONSTELLATION not like", value, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationIn(List<String> values) {
            addCriterion("UDCONSTELLATION in", values, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationNotIn(List<String> values) {
            addCriterion("UDCONSTELLATION not in", values, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationBetween(String value1, String value2) {
            addCriterion("UDCONSTELLATION between", value1, value2, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdconstellationNotBetween(String value1, String value2) {
            addCriterion("UDCONSTELLATION not between", value1, value2, "udconstellation");
            return (Criteria) this;
        }

        public Criteria andUdbloodIsNull() {
            addCriterion("UDBLOOD is null");
            return (Criteria) this;
        }

        public Criteria andUdbloodIsNotNull() {
            addCriterion("UDBLOOD is not null");
            return (Criteria) this;
        }

        public Criteria andUdbloodEqualTo(String value) {
            addCriterion("UDBLOOD =", value, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodNotEqualTo(String value) {
            addCriterion("UDBLOOD <>", value, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodGreaterThan(String value) {
            addCriterion("UDBLOOD >", value, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodGreaterThanOrEqualTo(String value) {
            addCriterion("UDBLOOD >=", value, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodLessThan(String value) {
            addCriterion("UDBLOOD <", value, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodLessThanOrEqualTo(String value) {
            addCriterion("UDBLOOD <=", value, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodLike(String value) {
            addCriterion("UDBLOOD like", value, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodNotLike(String value) {
            addCriterion("UDBLOOD not like", value, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodIn(List<String> values) {
            addCriterion("UDBLOOD in", values, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodNotIn(List<String> values) {
            addCriterion("UDBLOOD not in", values, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodBetween(String value1, String value2) {
            addCriterion("UDBLOOD between", value1, value2, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdbloodNotBetween(String value1, String value2) {
            addCriterion("UDBLOOD not between", value1, value2, "udblood");
            return (Criteria) this;
        }

        public Criteria andUdzodiacIsNull() {
            addCriterion("UDZODIAC is null");
            return (Criteria) this;
        }

        public Criteria andUdzodiacIsNotNull() {
            addCriterion("UDZODIAC is not null");
            return (Criteria) this;
        }

        public Criteria andUdzodiacEqualTo(String value) {
            addCriterion("UDZODIAC =", value, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacNotEqualTo(String value) {
            addCriterion("UDZODIAC <>", value, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacGreaterThan(String value) {
            addCriterion("UDZODIAC >", value, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacGreaterThanOrEqualTo(String value) {
            addCriterion("UDZODIAC >=", value, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacLessThan(String value) {
            addCriterion("UDZODIAC <", value, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacLessThanOrEqualTo(String value) {
            addCriterion("UDZODIAC <=", value, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacLike(String value) {
            addCriterion("UDZODIAC like", value, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacNotLike(String value) {
            addCriterion("UDZODIAC not like", value, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacIn(List<String> values) {
            addCriterion("UDZODIAC in", values, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacNotIn(List<String> values) {
            addCriterion("UDZODIAC not in", values, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacBetween(String value1, String value2) {
            addCriterion("UDZODIAC between", value1, value2, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdzodiacNotBetween(String value1, String value2) {
            addCriterion("UDZODIAC not between", value1, value2, "udzodiac");
            return (Criteria) this;
        }

        public Criteria andUdfaithIsNull() {
            addCriterion("UDFAITH is null");
            return (Criteria) this;
        }

        public Criteria andUdfaithIsNotNull() {
            addCriterion("UDFAITH is not null");
            return (Criteria) this;
        }

        public Criteria andUdfaithEqualTo(String value) {
            addCriterion("UDFAITH =", value, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithNotEqualTo(String value) {
            addCriterion("UDFAITH <>", value, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithGreaterThan(String value) {
            addCriterion("UDFAITH >", value, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithGreaterThanOrEqualTo(String value) {
            addCriterion("UDFAITH >=", value, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithLessThan(String value) {
            addCriterion("UDFAITH <", value, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithLessThanOrEqualTo(String value) {
            addCriterion("UDFAITH <=", value, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithLike(String value) {
            addCriterion("UDFAITH like", value, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithNotLike(String value) {
            addCriterion("UDFAITH not like", value, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithIn(List<String> values) {
            addCriterion("UDFAITH in", values, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithNotIn(List<String> values) {
            addCriterion("UDFAITH not in", values, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithBetween(String value1, String value2) {
            addCriterion("UDFAITH between", value1, value2, "udfaith");
            return (Criteria) this;
        }

        public Criteria andUdfaithNotBetween(String value1, String value2) {
            addCriterion("UDFAITH not between", value1, value2, "udfaith");
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