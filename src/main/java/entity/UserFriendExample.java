package entity;

import java.util.ArrayList;
import java.util.List;

public class UserFriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFriendExample() {
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

        public Criteria andUfidIsNull() {
            addCriterion("UFID is null");
            return (Criteria) this;
        }

        public Criteria andUfidIsNotNull() {
            addCriterion("UFID is not null");
            return (Criteria) this;
        }

        public Criteria andUfidEqualTo(Integer value) {
            addCriterion("UFID =", value, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfidNotEqualTo(Integer value) {
            addCriterion("UFID <>", value, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfidGreaterThan(Integer value) {
            addCriterion("UFID >", value, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UFID >=", value, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfidLessThan(Integer value) {
            addCriterion("UFID <", value, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfidLessThanOrEqualTo(Integer value) {
            addCriterion("UFID <=", value, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfidIn(List<Integer> values) {
            addCriterion("UFID in", values, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfidNotIn(List<Integer> values) {
            addCriterion("UFID not in", values, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfidBetween(Integer value1, Integer value2) {
            addCriterion("UFID between", value1, value2, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfidNotBetween(Integer value1, Integer value2) {
            addCriterion("UFID not between", value1, value2, "ufid");
            return (Criteria) this;
        }

        public Criteria andUfstartheightIsNull() {
            addCriterion("UFSTARTHEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andUfstartheightIsNotNull() {
            addCriterion("UFSTARTHEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andUfstartheightEqualTo(Integer value) {
            addCriterion("UFSTARTHEIGHT =", value, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfstartheightNotEqualTo(Integer value) {
            addCriterion("UFSTARTHEIGHT <>", value, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfstartheightGreaterThan(Integer value) {
            addCriterion("UFSTARTHEIGHT >", value, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfstartheightGreaterThanOrEqualTo(Integer value) {
            addCriterion("UFSTARTHEIGHT >=", value, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfstartheightLessThan(Integer value) {
            addCriterion("UFSTARTHEIGHT <", value, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfstartheightLessThanOrEqualTo(Integer value) {
            addCriterion("UFSTARTHEIGHT <=", value, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfstartheightIn(List<Integer> values) {
            addCriterion("UFSTARTHEIGHT in", values, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfstartheightNotIn(List<Integer> values) {
            addCriterion("UFSTARTHEIGHT not in", values, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfstartheightBetween(Integer value1, Integer value2) {
            addCriterion("UFSTARTHEIGHT between", value1, value2, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfstartheightNotBetween(Integer value1, Integer value2) {
            addCriterion("UFSTARTHEIGHT not between", value1, value2, "ufstartheight");
            return (Criteria) this;
        }

        public Criteria andUfendheigheIsNull() {
            addCriterion("UFENDHEIGHE is null");
            return (Criteria) this;
        }

        public Criteria andUfendheigheIsNotNull() {
            addCriterion("UFENDHEIGHE is not null");
            return (Criteria) this;
        }

        public Criteria andUfendheigheEqualTo(Integer value) {
            addCriterion("UFENDHEIGHE =", value, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfendheigheNotEqualTo(Integer value) {
            addCriterion("UFENDHEIGHE <>", value, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfendheigheGreaterThan(Integer value) {
            addCriterion("UFENDHEIGHE >", value, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfendheigheGreaterThanOrEqualTo(Integer value) {
            addCriterion("UFENDHEIGHE >=", value, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfendheigheLessThan(Integer value) {
            addCriterion("UFENDHEIGHE <", value, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfendheigheLessThanOrEqualTo(Integer value) {
            addCriterion("UFENDHEIGHE <=", value, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfendheigheIn(List<Integer> values) {
            addCriterion("UFENDHEIGHE in", values, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfendheigheNotIn(List<Integer> values) {
            addCriterion("UFENDHEIGHE not in", values, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfendheigheBetween(Integer value1, Integer value2) {
            addCriterion("UFENDHEIGHE between", value1, value2, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfendheigheNotBetween(Integer value1, Integer value2) {
            addCriterion("UFENDHEIGHE not between", value1, value2, "ufendheighe");
            return (Criteria) this;
        }

        public Criteria andUfstartageIsNull() {
            addCriterion("UFSTARTAGE is null");
            return (Criteria) this;
        }

        public Criteria andUfstartageIsNotNull() {
            addCriterion("UFSTARTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andUfstartageEqualTo(Integer value) {
            addCriterion("UFSTARTAGE =", value, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfstartageNotEqualTo(Integer value) {
            addCriterion("UFSTARTAGE <>", value, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfstartageGreaterThan(Integer value) {
            addCriterion("UFSTARTAGE >", value, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfstartageGreaterThanOrEqualTo(Integer value) {
            addCriterion("UFSTARTAGE >=", value, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfstartageLessThan(Integer value) {
            addCriterion("UFSTARTAGE <", value, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfstartageLessThanOrEqualTo(Integer value) {
            addCriterion("UFSTARTAGE <=", value, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfstartageIn(List<Integer> values) {
            addCriterion("UFSTARTAGE in", values, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfstartageNotIn(List<Integer> values) {
            addCriterion("UFSTARTAGE not in", values, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfstartageBetween(Integer value1, Integer value2) {
            addCriterion("UFSTARTAGE between", value1, value2, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfstartageNotBetween(Integer value1, Integer value2) {
            addCriterion("UFSTARTAGE not between", value1, value2, "ufstartage");
            return (Criteria) this;
        }

        public Criteria andUfendageIsNull() {
            addCriterion("UFENDAGE is null");
            return (Criteria) this;
        }

        public Criteria andUfendageIsNotNull() {
            addCriterion("UFENDAGE is not null");
            return (Criteria) this;
        }

        public Criteria andUfendageEqualTo(Integer value) {
            addCriterion("UFENDAGE =", value, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfendageNotEqualTo(Integer value) {
            addCriterion("UFENDAGE <>", value, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfendageGreaterThan(Integer value) {
            addCriterion("UFENDAGE >", value, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfendageGreaterThanOrEqualTo(Integer value) {
            addCriterion("UFENDAGE >=", value, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfendageLessThan(Integer value) {
            addCriterion("UFENDAGE <", value, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfendageLessThanOrEqualTo(Integer value) {
            addCriterion("UFENDAGE <=", value, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfendageIn(List<Integer> values) {
            addCriterion("UFENDAGE in", values, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfendageNotIn(List<Integer> values) {
            addCriterion("UFENDAGE not in", values, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfendageBetween(Integer value1, Integer value2) {
            addCriterion("UFENDAGE between", value1, value2, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfendageNotBetween(Integer value1, Integer value2) {
            addCriterion("UFENDAGE not between", value1, value2, "ufendage");
            return (Criteria) this;
        }

        public Criteria andUfdegreeIsNull() {
            addCriterion("UFDEGREE is null");
            return (Criteria) this;
        }

        public Criteria andUfdegreeIsNotNull() {
            addCriterion("UFDEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andUfdegreeEqualTo(String value) {
            addCriterion("UFDEGREE =", value, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeNotEqualTo(String value) {
            addCriterion("UFDEGREE <>", value, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeGreaterThan(String value) {
            addCriterion("UFDEGREE >", value, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("UFDEGREE >=", value, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeLessThan(String value) {
            addCriterion("UFDEGREE <", value, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeLessThanOrEqualTo(String value) {
            addCriterion("UFDEGREE <=", value, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeLike(String value) {
            addCriterion("UFDEGREE like", value, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeNotLike(String value) {
            addCriterion("UFDEGREE not like", value, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeIn(List<String> values) {
            addCriterion("UFDEGREE in", values, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeNotIn(List<String> values) {
            addCriterion("UFDEGREE not in", values, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeBetween(String value1, String value2) {
            addCriterion("UFDEGREE between", value1, value2, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfdegreeNotBetween(String value1, String value2) {
            addCriterion("UFDEGREE not between", value1, value2, "ufdegree");
            return (Criteria) this;
        }

        public Criteria andUfstartsalIsNull() {
            addCriterion("UFSTARTSAL is null");
            return (Criteria) this;
        }

        public Criteria andUfstartsalIsNotNull() {
            addCriterion("UFSTARTSAL is not null");
            return (Criteria) this;
        }

        public Criteria andUfstartsalEqualTo(Integer value) {
            addCriterion("UFSTARTSAL =", value, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfstartsalNotEqualTo(Integer value) {
            addCriterion("UFSTARTSAL <>", value, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfstartsalGreaterThan(Integer value) {
            addCriterion("UFSTARTSAL >", value, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfstartsalGreaterThanOrEqualTo(Integer value) {
            addCriterion("UFSTARTSAL >=", value, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfstartsalLessThan(Integer value) {
            addCriterion("UFSTARTSAL <", value, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfstartsalLessThanOrEqualTo(Integer value) {
            addCriterion("UFSTARTSAL <=", value, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfstartsalIn(List<Integer> values) {
            addCriterion("UFSTARTSAL in", values, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfstartsalNotIn(List<Integer> values) {
            addCriterion("UFSTARTSAL not in", values, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfstartsalBetween(Integer value1, Integer value2) {
            addCriterion("UFSTARTSAL between", value1, value2, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfstartsalNotBetween(Integer value1, Integer value2) {
            addCriterion("UFSTARTSAL not between", value1, value2, "ufstartsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalIsNull() {
            addCriterion("UFENDSAL is null");
            return (Criteria) this;
        }

        public Criteria andUfendsalIsNotNull() {
            addCriterion("UFENDSAL is not null");
            return (Criteria) this;
        }

        public Criteria andUfendsalEqualTo(Integer value) {
            addCriterion("UFENDSAL =", value, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalNotEqualTo(Integer value) {
            addCriterion("UFENDSAL <>", value, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalGreaterThan(Integer value) {
            addCriterion("UFENDSAL >", value, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalGreaterThanOrEqualTo(Integer value) {
            addCriterion("UFENDSAL >=", value, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalLessThan(Integer value) {
            addCriterion("UFENDSAL <", value, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalLessThanOrEqualTo(Integer value) {
            addCriterion("UFENDSAL <=", value, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalIn(List<Integer> values) {
            addCriterion("UFENDSAL in", values, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalNotIn(List<Integer> values) {
            addCriterion("UFENDSAL not in", values, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalBetween(Integer value1, Integer value2) {
            addCriterion("UFENDSAL between", value1, value2, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfendsalNotBetween(Integer value1, Integer value2) {
            addCriterion("UFENDSAL not between", value1, value2, "ufendsal");
            return (Criteria) this;
        }

        public Criteria andUfapartmentIsNull() {
            addCriterion("UFAPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andUfapartmentIsNotNull() {
            addCriterion("UFAPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andUfapartmentEqualTo(String value) {
            addCriterion("UFAPARTMENT =", value, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentNotEqualTo(String value) {
            addCriterion("UFAPARTMENT <>", value, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentGreaterThan(String value) {
            addCriterion("UFAPARTMENT >", value, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentGreaterThanOrEqualTo(String value) {
            addCriterion("UFAPARTMENT >=", value, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentLessThan(String value) {
            addCriterion("UFAPARTMENT <", value, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentLessThanOrEqualTo(String value) {
            addCriterion("UFAPARTMENT <=", value, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentLike(String value) {
            addCriterion("UFAPARTMENT like", value, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentNotLike(String value) {
            addCriterion("UFAPARTMENT not like", value, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentIn(List<String> values) {
            addCriterion("UFAPARTMENT in", values, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentNotIn(List<String> values) {
            addCriterion("UFAPARTMENT not in", values, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentBetween(String value1, String value2) {
            addCriterion("UFAPARTMENT between", value1, value2, "ufapartment");
            return (Criteria) this;
        }

        public Criteria andUfapartmentNotBetween(String value1, String value2) {
            addCriterion("UFAPARTMENT not between", value1, value2, "ufapartment");
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