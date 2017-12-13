package entity;

import java.util.ArrayList;
import java.util.List;

public class PrivateLetterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrivateLetterExample() {
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

        public Criteria andPlidIsNull() {
            addCriterion("PLID is null");
            return (Criteria) this;
        }

        public Criteria andPlidIsNotNull() {
            addCriterion("PLID is not null");
            return (Criteria) this;
        }

        public Criteria andPlidEqualTo(Integer value) {
            addCriterion("PLID =", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidNotEqualTo(Integer value) {
            addCriterion("PLID <>", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidGreaterThan(Integer value) {
            addCriterion("PLID >", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLID >=", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidLessThan(Integer value) {
            addCriterion("PLID <", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidLessThanOrEqualTo(Integer value) {
            addCriterion("PLID <=", value, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidIn(List<Integer> values) {
            addCriterion("PLID in", values, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidNotIn(List<Integer> values) {
            addCriterion("PLID not in", values, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidBetween(Integer value1, Integer value2) {
            addCriterion("PLID between", value1, value2, "plid");
            return (Criteria) this;
        }

        public Criteria andPlidNotBetween(Integer value1, Integer value2) {
            addCriterion("PLID not between", value1, value2, "plid");
            return (Criteria) this;
        }

        public Criteria andPlcontentIsNull() {
            addCriterion("PLCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andPlcontentIsNotNull() {
            addCriterion("PLCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andPlcontentEqualTo(String value) {
            addCriterion("PLCONTENT =", value, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentNotEqualTo(String value) {
            addCriterion("PLCONTENT <>", value, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentGreaterThan(String value) {
            addCriterion("PLCONTENT >", value, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentGreaterThanOrEqualTo(String value) {
            addCriterion("PLCONTENT >=", value, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentLessThan(String value) {
            addCriterion("PLCONTENT <", value, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentLessThanOrEqualTo(String value) {
            addCriterion("PLCONTENT <=", value, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentLike(String value) {
            addCriterion("PLCONTENT like", value, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentNotLike(String value) {
            addCriterion("PLCONTENT not like", value, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentIn(List<String> values) {
            addCriterion("PLCONTENT in", values, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentNotIn(List<String> values) {
            addCriterion("PLCONTENT not in", values, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentBetween(String value1, String value2) {
            addCriterion("PLCONTENT between", value1, value2, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPlcontentNotBetween(String value1, String value2) {
            addCriterion("PLCONTENT not between", value1, value2, "plcontent");
            return (Criteria) this;
        }

        public Criteria andPldataIsNull() {
            addCriterion("PLDATA is null");
            return (Criteria) this;
        }

        public Criteria andPldataIsNotNull() {
            addCriterion("PLDATA is not null");
            return (Criteria) this;
        }

        public Criteria andPldataEqualTo(String value) {
            addCriterion("PLDATA =", value, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataNotEqualTo(String value) {
            addCriterion("PLDATA <>", value, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataGreaterThan(String value) {
            addCriterion("PLDATA >", value, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataGreaterThanOrEqualTo(String value) {
            addCriterion("PLDATA >=", value, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataLessThan(String value) {
            addCriterion("PLDATA <", value, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataLessThanOrEqualTo(String value) {
            addCriterion("PLDATA <=", value, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataLike(String value) {
            addCriterion("PLDATA like", value, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataNotLike(String value) {
            addCriterion("PLDATA not like", value, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataIn(List<String> values) {
            addCriterion("PLDATA in", values, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataNotIn(List<String> values) {
            addCriterion("PLDATA not in", values, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataBetween(String value1, String value2) {
            addCriterion("PLDATA between", value1, value2, "pldata");
            return (Criteria) this;
        }

        public Criteria andPldataNotBetween(String value1, String value2) {
            addCriterion("PLDATA not between", value1, value2, "pldata");
            return (Criteria) this;
        }

        public Criteria andPlsendidIsNull() {
            addCriterion("PLSENDID is null");
            return (Criteria) this;
        }

        public Criteria andPlsendidIsNotNull() {
            addCriterion("PLSENDID is not null");
            return (Criteria) this;
        }

        public Criteria andPlsendidEqualTo(Integer value) {
            addCriterion("PLSENDID =", value, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlsendidNotEqualTo(Integer value) {
            addCriterion("PLSENDID <>", value, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlsendidGreaterThan(Integer value) {
            addCriterion("PLSENDID >", value, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlsendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLSENDID >=", value, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlsendidLessThan(Integer value) {
            addCriterion("PLSENDID <", value, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlsendidLessThanOrEqualTo(Integer value) {
            addCriterion("PLSENDID <=", value, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlsendidIn(List<Integer> values) {
            addCriterion("PLSENDID in", values, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlsendidNotIn(List<Integer> values) {
            addCriterion("PLSENDID not in", values, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlsendidBetween(Integer value1, Integer value2) {
            addCriterion("PLSENDID between", value1, value2, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlsendidNotBetween(Integer value1, Integer value2) {
            addCriterion("PLSENDID not between", value1, value2, "plsendid");
            return (Criteria) this;
        }

        public Criteria andPlacceptIsNull() {
            addCriterion("PLACCEPT is null");
            return (Criteria) this;
        }

        public Criteria andPlacceptIsNotNull() {
            addCriterion("PLACCEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPlacceptEqualTo(Integer value) {
            addCriterion("PLACCEPT =", value, "placcept");
            return (Criteria) this;
        }

        public Criteria andPlacceptNotEqualTo(Integer value) {
            addCriterion("PLACCEPT <>", value, "placcept");
            return (Criteria) this;
        }

        public Criteria andPlacceptGreaterThan(Integer value) {
            addCriterion("PLACCEPT >", value, "placcept");
            return (Criteria) this;
        }

        public Criteria andPlacceptGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLACCEPT >=", value, "placcept");
            return (Criteria) this;
        }

        public Criteria andPlacceptLessThan(Integer value) {
            addCriterion("PLACCEPT <", value, "placcept");
            return (Criteria) this;
        }

        public Criteria andPlacceptLessThanOrEqualTo(Integer value) {
            addCriterion("PLACCEPT <=", value, "placcept");
            return (Criteria) this;
        }

        public Criteria andPlacceptIn(List<Integer> values) {
            addCriterion("PLACCEPT in", values, "placcept");
            return (Criteria) this;
        }

        public Criteria andPlacceptNotIn(List<Integer> values) {
            addCriterion("PLACCEPT not in", values, "placcept");
            return (Criteria) this;
        }

        public Criteria andPlacceptBetween(Integer value1, Integer value2) {
            addCriterion("PLACCEPT between", value1, value2, "placcept");
            return (Criteria) this;
        }

        public Criteria andPlacceptNotBetween(Integer value1, Integer value2) {
            addCriterion("PLACCEPT not between", value1, value2, "placcept");
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