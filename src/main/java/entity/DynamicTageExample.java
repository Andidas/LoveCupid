package entity;

import java.util.ArrayList;
import java.util.List;

public class DynamicTageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicTageExample() {
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

        public Criteria andDtidIsNull() {
            addCriterion("DTID is null");
            return (Criteria) this;
        }

        public Criteria andDtidIsNotNull() {
            addCriterion("DTID is not null");
            return (Criteria) this;
        }

        public Criteria andDtidEqualTo(Integer value) {
            addCriterion("DTID =", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidNotEqualTo(Integer value) {
            addCriterion("DTID <>", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidGreaterThan(Integer value) {
            addCriterion("DTID >", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DTID >=", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidLessThan(Integer value) {
            addCriterion("DTID <", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidLessThanOrEqualTo(Integer value) {
            addCriterion("DTID <=", value, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidIn(List<Integer> values) {
            addCriterion("DTID in", values, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidNotIn(List<Integer> values) {
            addCriterion("DTID not in", values, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidBetween(Integer value1, Integer value2) {
            addCriterion("DTID between", value1, value2, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtidNotBetween(Integer value1, Integer value2) {
            addCriterion("DTID not between", value1, value2, "dtid");
            return (Criteria) this;
        }

        public Criteria andDtudnidIsNull() {
            addCriterion("DTUDNID is null");
            return (Criteria) this;
        }

        public Criteria andDtudnidIsNotNull() {
            addCriterion("DTUDNID is not null");
            return (Criteria) this;
        }

        public Criteria andDtudnidEqualTo(Integer value) {
            addCriterion("DTUDNID =", value, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtudnidNotEqualTo(Integer value) {
            addCriterion("DTUDNID <>", value, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtudnidGreaterThan(Integer value) {
            addCriterion("DTUDNID >", value, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtudnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DTUDNID >=", value, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtudnidLessThan(Integer value) {
            addCriterion("DTUDNID <", value, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtudnidLessThanOrEqualTo(Integer value) {
            addCriterion("DTUDNID <=", value, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtudnidIn(List<Integer> values) {
            addCriterion("DTUDNID in", values, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtudnidNotIn(List<Integer> values) {
            addCriterion("DTUDNID not in", values, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtudnidBetween(Integer value1, Integer value2) {
            addCriterion("DTUDNID between", value1, value2, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtudnidNotBetween(Integer value1, Integer value2) {
            addCriterion("DTUDNID not between", value1, value2, "dtudnid");
            return (Criteria) this;
        }

        public Criteria andDtubidIsNull() {
            addCriterion("DTUBID is null");
            return (Criteria) this;
        }

        public Criteria andDtubidIsNotNull() {
            addCriterion("DTUBID is not null");
            return (Criteria) this;
        }

        public Criteria andDtubidEqualTo(Integer value) {
            addCriterion("DTUBID =", value, "dtubid");
            return (Criteria) this;
        }

        public Criteria andDtubidNotEqualTo(Integer value) {
            addCriterion("DTUBID <>", value, "dtubid");
            return (Criteria) this;
        }

        public Criteria andDtubidGreaterThan(Integer value) {
            addCriterion("DTUBID >", value, "dtubid");
            return (Criteria) this;
        }

        public Criteria andDtubidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DTUBID >=", value, "dtubid");
            return (Criteria) this;
        }

        public Criteria andDtubidLessThan(Integer value) {
            addCriterion("DTUBID <", value, "dtubid");
            return (Criteria) this;
        }

        public Criteria andDtubidLessThanOrEqualTo(Integer value) {
            addCriterion("DTUBID <=", value, "dtubid");
            return (Criteria) this;
        }

        public Criteria andDtubidIn(List<Integer> values) {
            addCriterion("DTUBID in", values, "dtubid");
            return (Criteria) this;
        }

        public Criteria andDtubidNotIn(List<Integer> values) {
            addCriterion("DTUBID not in", values, "dtubid");
            return (Criteria) this;
        }

        public Criteria andDtubidBetween(Integer value1, Integer value2) {
            addCriterion("DTUBID between", value1, value2, "dtubid");
            return (Criteria) this;
        }

        public Criteria andDtubidNotBetween(Integer value1, Integer value2) {
            addCriterion("DTUBID not between", value1, value2, "dtubid");
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