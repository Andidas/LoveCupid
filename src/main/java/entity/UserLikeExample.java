package entity;

import java.util.ArrayList;
import java.util.List;

public class UserLikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLikeExample() {
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

        public Criteria andUlidIsNull() {
            addCriterion("ULID is null");
            return (Criteria) this;
        }

        public Criteria andUlidIsNotNull() {
            addCriterion("ULID is not null");
            return (Criteria) this;
        }

        public Criteria andUlidEqualTo(Integer value) {
            addCriterion("ULID =", value, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlidNotEqualTo(Integer value) {
            addCriterion("ULID <>", value, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlidGreaterThan(Integer value) {
            addCriterion("ULID >", value, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ULID >=", value, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlidLessThan(Integer value) {
            addCriterion("ULID <", value, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlidLessThanOrEqualTo(Integer value) {
            addCriterion("ULID <=", value, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlidIn(List<Integer> values) {
            addCriterion("ULID in", values, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlidNotIn(List<Integer> values) {
            addCriterion("ULID not in", values, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlidBetween(Integer value1, Integer value2) {
            addCriterion("ULID between", value1, value2, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlidNotBetween(Integer value1, Integer value2) {
            addCriterion("ULID not between", value1, value2, "ulid");
            return (Criteria) this;
        }

        public Criteria andUlubidIsNull() {
            addCriterion("ULUBID is null");
            return (Criteria) this;
        }

        public Criteria andUlubidIsNotNull() {
            addCriterion("ULUBID is not null");
            return (Criteria) this;
        }

        public Criteria andUlubidEqualTo(Integer value) {
            addCriterion("ULUBID =", value, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlubidNotEqualTo(Integer value) {
            addCriterion("ULUBID <>", value, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlubidGreaterThan(Integer value) {
            addCriterion("ULUBID >", value, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlubidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ULUBID >=", value, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlubidLessThan(Integer value) {
            addCriterion("ULUBID <", value, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlubidLessThanOrEqualTo(Integer value) {
            addCriterion("ULUBID <=", value, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlubidIn(List<Integer> values) {
            addCriterion("ULUBID in", values, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlubidNotIn(List<Integer> values) {
            addCriterion("ULUBID not in", values, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlubidBetween(Integer value1, Integer value2) {
            addCriterion("ULUBID between", value1, value2, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlubidNotBetween(Integer value1, Integer value2) {
            addCriterion("ULUBID not between", value1, value2, "ulubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidIsNull() {
            addCriterion("ULBYUBID is null");
            return (Criteria) this;
        }

        public Criteria andUlbyubidIsNotNull() {
            addCriterion("ULBYUBID is not null");
            return (Criteria) this;
        }

        public Criteria andUlbyubidEqualTo(Integer value) {
            addCriterion("ULBYUBID =", value, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidNotEqualTo(Integer value) {
            addCriterion("ULBYUBID <>", value, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidGreaterThan(Integer value) {
            addCriterion("ULBYUBID >", value, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ULBYUBID >=", value, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidLessThan(Integer value) {
            addCriterion("ULBYUBID <", value, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidLessThanOrEqualTo(Integer value) {
            addCriterion("ULBYUBID <=", value, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidIn(List<Integer> values) {
            addCriterion("ULBYUBID in", values, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidNotIn(List<Integer> values) {
            addCriterion("ULBYUBID not in", values, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidBetween(Integer value1, Integer value2) {
            addCriterion("ULBYUBID between", value1, value2, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUlbyubidNotBetween(Integer value1, Integer value2) {
            addCriterion("ULBYUBID not between", value1, value2, "ulbyubid");
            return (Criteria) this;
        }

        public Criteria andUltimeIsNull() {
            addCriterion("ULTIME is null");
            return (Criteria) this;
        }

        public Criteria andUltimeIsNotNull() {
            addCriterion("ULTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUltimeEqualTo(String value) {
            addCriterion("ULTIME =", value, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeNotEqualTo(String value) {
            addCriterion("ULTIME <>", value, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeGreaterThan(String value) {
            addCriterion("ULTIME >", value, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeGreaterThanOrEqualTo(String value) {
            addCriterion("ULTIME >=", value, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeLessThan(String value) {
            addCriterion("ULTIME <", value, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeLessThanOrEqualTo(String value) {
            addCriterion("ULTIME <=", value, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeLike(String value) {
            addCriterion("ULTIME like", value, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeNotLike(String value) {
            addCriterion("ULTIME not like", value, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeIn(List<String> values) {
            addCriterion("ULTIME in", values, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeNotIn(List<String> values) {
            addCriterion("ULTIME not in", values, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeBetween(String value1, String value2) {
            addCriterion("ULTIME between", value1, value2, "ultime");
            return (Criteria) this;
        }

        public Criteria andUltimeNotBetween(String value1, String value2) {
            addCriterion("ULTIME not between", value1, value2, "ultime");
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