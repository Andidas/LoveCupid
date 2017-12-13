package entity;

import java.util.ArrayList;
import java.util.List;

public class MemberScreenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberScreenExample() {
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

        public Criteria andMsidIsNull() {
            addCriterion("MSID is null");
            return (Criteria) this;
        }

        public Criteria andMsidIsNotNull() {
            addCriterion("MSID is not null");
            return (Criteria) this;
        }

        public Criteria andMsidEqualTo(Integer value) {
            addCriterion("MSID =", value, "msid");
            return (Criteria) this;
        }

        public Criteria andMsidNotEqualTo(Integer value) {
            addCriterion("MSID <>", value, "msid");
            return (Criteria) this;
        }

        public Criteria andMsidGreaterThan(Integer value) {
            addCriterion("MSID >", value, "msid");
            return (Criteria) this;
        }

        public Criteria andMsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MSID >=", value, "msid");
            return (Criteria) this;
        }

        public Criteria andMsidLessThan(Integer value) {
            addCriterion("MSID <", value, "msid");
            return (Criteria) this;
        }

        public Criteria andMsidLessThanOrEqualTo(Integer value) {
            addCriterion("MSID <=", value, "msid");
            return (Criteria) this;
        }

        public Criteria andMsidIn(List<Integer> values) {
            addCriterion("MSID in", values, "msid");
            return (Criteria) this;
        }

        public Criteria andMsidNotIn(List<Integer> values) {
            addCriterion("MSID not in", values, "msid");
            return (Criteria) this;
        }

        public Criteria andMsidBetween(Integer value1, Integer value2) {
            addCriterion("MSID between", value1, value2, "msid");
            return (Criteria) this;
        }

        public Criteria andMsidNotBetween(Integer value1, Integer value2) {
            addCriterion("MSID not between", value1, value2, "msid");
            return (Criteria) this;
        }

        public Criteria andMslogintimeIsNull() {
            addCriterion("MSLOGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andMslogintimeIsNotNull() {
            addCriterion("MSLOGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMslogintimeEqualTo(String value) {
            addCriterion("MSLOGINTIME =", value, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeNotEqualTo(String value) {
            addCriterion("MSLOGINTIME <>", value, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeGreaterThan(String value) {
            addCriterion("MSLOGINTIME >", value, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeGreaterThanOrEqualTo(String value) {
            addCriterion("MSLOGINTIME >=", value, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeLessThan(String value) {
            addCriterion("MSLOGINTIME <", value, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeLessThanOrEqualTo(String value) {
            addCriterion("MSLOGINTIME <=", value, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeLike(String value) {
            addCriterion("MSLOGINTIME like", value, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeNotLike(String value) {
            addCriterion("MSLOGINTIME not like", value, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeIn(List<String> values) {
            addCriterion("MSLOGINTIME in", values, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeNotIn(List<String> values) {
            addCriterion("MSLOGINTIME not in", values, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeBetween(String value1, String value2) {
            addCriterion("MSLOGINTIME between", value1, value2, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMslogintimeNotBetween(String value1, String value2) {
            addCriterion("MSLOGINTIME not between", value1, value2, "mslogintime");
            return (Criteria) this;
        }

        public Criteria andMshouseIsNull() {
            addCriterion("MSHOUSE is null");
            return (Criteria) this;
        }

        public Criteria andMshouseIsNotNull() {
            addCriterion("MSHOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andMshouseEqualTo(String value) {
            addCriterion("MSHOUSE =", value, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseNotEqualTo(String value) {
            addCriterion("MSHOUSE <>", value, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseGreaterThan(String value) {
            addCriterion("MSHOUSE >", value, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseGreaterThanOrEqualTo(String value) {
            addCriterion("MSHOUSE >=", value, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseLessThan(String value) {
            addCriterion("MSHOUSE <", value, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseLessThanOrEqualTo(String value) {
            addCriterion("MSHOUSE <=", value, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseLike(String value) {
            addCriterion("MSHOUSE like", value, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseNotLike(String value) {
            addCriterion("MSHOUSE not like", value, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseIn(List<String> values) {
            addCriterion("MSHOUSE in", values, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseNotIn(List<String> values) {
            addCriterion("MSHOUSE not in", values, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseBetween(String value1, String value2) {
            addCriterion("MSHOUSE between", value1, value2, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMshouseNotBetween(String value1, String value2) {
            addCriterion("MSHOUSE not between", value1, value2, "mshouse");
            return (Criteria) this;
        }

        public Criteria andMscarIsNull() {
            addCriterion("MSCAR is null");
            return (Criteria) this;
        }

        public Criteria andMscarIsNotNull() {
            addCriterion("MSCAR is not null");
            return (Criteria) this;
        }

        public Criteria andMscarEqualTo(String value) {
            addCriterion("MSCAR =", value, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarNotEqualTo(String value) {
            addCriterion("MSCAR <>", value, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarGreaterThan(String value) {
            addCriterion("MSCAR >", value, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarGreaterThanOrEqualTo(String value) {
            addCriterion("MSCAR >=", value, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarLessThan(String value) {
            addCriterion("MSCAR <", value, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarLessThanOrEqualTo(String value) {
            addCriterion("MSCAR <=", value, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarLike(String value) {
            addCriterion("MSCAR like", value, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarNotLike(String value) {
            addCriterion("MSCAR not like", value, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarIn(List<String> values) {
            addCriterion("MSCAR in", values, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarNotIn(List<String> values) {
            addCriterion("MSCAR not in", values, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarBetween(String value1, String value2) {
            addCriterion("MSCAR between", value1, value2, "mscar");
            return (Criteria) this;
        }

        public Criteria andMscarNotBetween(String value1, String value2) {
            addCriterion("MSCAR not between", value1, value2, "mscar");
            return (Criteria) this;
        }

        public Criteria andMsconstellationIsNull() {
            addCriterion("MSCONSTELLATION is null");
            return (Criteria) this;
        }

        public Criteria andMsconstellationIsNotNull() {
            addCriterion("MSCONSTELLATION is not null");
            return (Criteria) this;
        }

        public Criteria andMsconstellationEqualTo(String value) {
            addCriterion("MSCONSTELLATION =", value, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationNotEqualTo(String value) {
            addCriterion("MSCONSTELLATION <>", value, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationGreaterThan(String value) {
            addCriterion("MSCONSTELLATION >", value, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationGreaterThanOrEqualTo(String value) {
            addCriterion("MSCONSTELLATION >=", value, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationLessThan(String value) {
            addCriterion("MSCONSTELLATION <", value, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationLessThanOrEqualTo(String value) {
            addCriterion("MSCONSTELLATION <=", value, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationLike(String value) {
            addCriterion("MSCONSTELLATION like", value, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationNotLike(String value) {
            addCriterion("MSCONSTELLATION not like", value, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationIn(List<String> values) {
            addCriterion("MSCONSTELLATION in", values, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationNotIn(List<String> values) {
            addCriterion("MSCONSTELLATION not in", values, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationBetween(String value1, String value2) {
            addCriterion("MSCONSTELLATION between", value1, value2, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsconstellationNotBetween(String value1, String value2) {
            addCriterion("MSCONSTELLATION not between", value1, value2, "msconstellation");
            return (Criteria) this;
        }

        public Criteria andMsprofessionIsNull() {
            addCriterion("MSPROFESSION is null");
            return (Criteria) this;
        }

        public Criteria andMsprofessionIsNotNull() {
            addCriterion("MSPROFESSION is not null");
            return (Criteria) this;
        }

        public Criteria andMsprofessionEqualTo(String value) {
            addCriterion("MSPROFESSION =", value, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionNotEqualTo(String value) {
            addCriterion("MSPROFESSION <>", value, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionGreaterThan(String value) {
            addCriterion("MSPROFESSION >", value, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionGreaterThanOrEqualTo(String value) {
            addCriterion("MSPROFESSION >=", value, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionLessThan(String value) {
            addCriterion("MSPROFESSION <", value, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionLessThanOrEqualTo(String value) {
            addCriterion("MSPROFESSION <=", value, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionLike(String value) {
            addCriterion("MSPROFESSION like", value, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionNotLike(String value) {
            addCriterion("MSPROFESSION not like", value, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionIn(List<String> values) {
            addCriterion("MSPROFESSION in", values, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionNotIn(List<String> values) {
            addCriterion("MSPROFESSION not in", values, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionBetween(String value1, String value2) {
            addCriterion("MSPROFESSION between", value1, value2, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsprofessionNotBetween(String value1, String value2) {
            addCriterion("MSPROFESSION not between", value1, value2, "msprofession");
            return (Criteria) this;
        }

        public Criteria andMsnationIsNull() {
            addCriterion("MSNATION is null");
            return (Criteria) this;
        }

        public Criteria andMsnationIsNotNull() {
            addCriterion("MSNATION is not null");
            return (Criteria) this;
        }

        public Criteria andMsnationEqualTo(String value) {
            addCriterion("MSNATION =", value, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationNotEqualTo(String value) {
            addCriterion("MSNATION <>", value, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationGreaterThan(String value) {
            addCriterion("MSNATION >", value, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationGreaterThanOrEqualTo(String value) {
            addCriterion("MSNATION >=", value, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationLessThan(String value) {
            addCriterion("MSNATION <", value, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationLessThanOrEqualTo(String value) {
            addCriterion("MSNATION <=", value, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationLike(String value) {
            addCriterion("MSNATION like", value, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationNotLike(String value) {
            addCriterion("MSNATION not like", value, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationIn(List<String> values) {
            addCriterion("MSNATION in", values, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationNotIn(List<String> values) {
            addCriterion("MSNATION not in", values, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationBetween(String value1, String value2) {
            addCriterion("MSNATION between", value1, value2, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsnationNotBetween(String value1, String value2) {
            addCriterion("MSNATION not between", value1, value2, "msnation");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceIsNull() {
            addCriterion("MSBIRTHPLACE is null");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceIsNotNull() {
            addCriterion("MSBIRTHPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceEqualTo(String value) {
            addCriterion("MSBIRTHPLACE =", value, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceNotEqualTo(String value) {
            addCriterion("MSBIRTHPLACE <>", value, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceGreaterThan(String value) {
            addCriterion("MSBIRTHPLACE >", value, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("MSBIRTHPLACE >=", value, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceLessThan(String value) {
            addCriterion("MSBIRTHPLACE <", value, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceLessThanOrEqualTo(String value) {
            addCriterion("MSBIRTHPLACE <=", value, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceLike(String value) {
            addCriterion("MSBIRTHPLACE like", value, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceNotLike(String value) {
            addCriterion("MSBIRTHPLACE not like", value, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceIn(List<String> values) {
            addCriterion("MSBIRTHPLACE in", values, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceNotIn(List<String> values) {
            addCriterion("MSBIRTHPLACE not in", values, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceBetween(String value1, String value2) {
            addCriterion("MSBIRTHPLACE between", value1, value2, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMsbirthplaceNotBetween(String value1, String value2) {
            addCriterion("MSBIRTHPLACE not between", value1, value2, "msbirthplace");
            return (Criteria) this;
        }

        public Criteria andMshanIsNull() {
            addCriterion("MSHAN is null");
            return (Criteria) this;
        }

        public Criteria andMshanIsNotNull() {
            addCriterion("MSHAN is not null");
            return (Criteria) this;
        }

        public Criteria andMshanEqualTo(String value) {
            addCriterion("MSHAN =", value, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanNotEqualTo(String value) {
            addCriterion("MSHAN <>", value, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanGreaterThan(String value) {
            addCriterion("MSHAN >", value, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanGreaterThanOrEqualTo(String value) {
            addCriterion("MSHAN >=", value, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanLessThan(String value) {
            addCriterion("MSHAN <", value, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanLessThanOrEqualTo(String value) {
            addCriterion("MSHAN <=", value, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanLike(String value) {
            addCriterion("MSHAN like", value, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanNotLike(String value) {
            addCriterion("MSHAN not like", value, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanIn(List<String> values) {
            addCriterion("MSHAN in", values, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanNotIn(List<String> values) {
            addCriterion("MSHAN not in", values, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanBetween(String value1, String value2) {
            addCriterion("MSHAN between", value1, value2, "mshan");
            return (Criteria) this;
        }

        public Criteria andMshanNotBetween(String value1, String value2) {
            addCriterion("MSHAN not between", value1, value2, "mshan");
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