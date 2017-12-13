package entity;

import java.util.ArrayList;
import java.util.List;

public class SelfNominationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SelfNominationExample() {
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

        public Criteria andSnidIsNull() {
            addCriterion("SNID is null");
            return (Criteria) this;
        }

        public Criteria andSnidIsNotNull() {
            addCriterion("SNID is not null");
            return (Criteria) this;
        }

        public Criteria andSnidEqualTo(Integer value) {
            addCriterion("SNID =", value, "snid");
            return (Criteria) this;
        }

        public Criteria andSnidNotEqualTo(Integer value) {
            addCriterion("SNID <>", value, "snid");
            return (Criteria) this;
        }

        public Criteria andSnidGreaterThan(Integer value) {
            addCriterion("SNID >", value, "snid");
            return (Criteria) this;
        }

        public Criteria andSnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SNID >=", value, "snid");
            return (Criteria) this;
        }

        public Criteria andSnidLessThan(Integer value) {
            addCriterion("SNID <", value, "snid");
            return (Criteria) this;
        }

        public Criteria andSnidLessThanOrEqualTo(Integer value) {
            addCriterion("SNID <=", value, "snid");
            return (Criteria) this;
        }

        public Criteria andSnidIn(List<Integer> values) {
            addCriterion("SNID in", values, "snid");
            return (Criteria) this;
        }

        public Criteria andSnidNotIn(List<Integer> values) {
            addCriterion("SNID not in", values, "snid");
            return (Criteria) this;
        }

        public Criteria andSnidBetween(Integer value1, Integer value2) {
            addCriterion("SNID between", value1, value2, "snid");
            return (Criteria) this;
        }

        public Criteria andSnidNotBetween(Integer value1, Integer value2) {
            addCriterion("SNID not between", value1, value2, "snid");
            return (Criteria) this;
        }

        public Criteria andSnsexIsNull() {
            addCriterion("SNSEX is null");
            return (Criteria) this;
        }

        public Criteria andSnsexIsNotNull() {
            addCriterion("SNSEX is not null");
            return (Criteria) this;
        }

        public Criteria andSnsexEqualTo(String value) {
            addCriterion("SNSEX =", value, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexNotEqualTo(String value) {
            addCriterion("SNSEX <>", value, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexGreaterThan(String value) {
            addCriterion("SNSEX >", value, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexGreaterThanOrEqualTo(String value) {
            addCriterion("SNSEX >=", value, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexLessThan(String value) {
            addCriterion("SNSEX <", value, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexLessThanOrEqualTo(String value) {
            addCriterion("SNSEX <=", value, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexLike(String value) {
            addCriterion("SNSEX like", value, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexNotLike(String value) {
            addCriterion("SNSEX not like", value, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexIn(List<String> values) {
            addCriterion("SNSEX in", values, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexNotIn(List<String> values) {
            addCriterion("SNSEX not in", values, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexBetween(String value1, String value2) {
            addCriterion("SNSEX between", value1, value2, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnsexNotBetween(String value1, String value2) {
            addCriterion("SNSEX not between", value1, value2, "snsex");
            return (Criteria) this;
        }

        public Criteria andSnselfIsNull() {
            addCriterion("SNSELF is null");
            return (Criteria) this;
        }

        public Criteria andSnselfIsNotNull() {
            addCriterion("SNSELF is not null");
            return (Criteria) this;
        }

        public Criteria andSnselfEqualTo(String value) {
            addCriterion("SNSELF =", value, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfNotEqualTo(String value) {
            addCriterion("SNSELF <>", value, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfGreaterThan(String value) {
            addCriterion("SNSELF >", value, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfGreaterThanOrEqualTo(String value) {
            addCriterion("SNSELF >=", value, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfLessThan(String value) {
            addCriterion("SNSELF <", value, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfLessThanOrEqualTo(String value) {
            addCriterion("SNSELF <=", value, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfLike(String value) {
            addCriterion("SNSELF like", value, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfNotLike(String value) {
            addCriterion("SNSELF not like", value, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfIn(List<String> values) {
            addCriterion("SNSELF in", values, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfNotIn(List<String> values) {
            addCriterion("SNSELF not in", values, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfBetween(String value1, String value2) {
            addCriterion("SNSELF between", value1, value2, "snself");
            return (Criteria) this;
        }

        public Criteria andSnselfNotBetween(String value1, String value2) {
            addCriterion("SNSELF not between", value1, value2, "snself");
            return (Criteria) this;
        }

        public Criteria andSnrequiredIsNull() {
            addCriterion("SNREQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andSnrequiredIsNotNull() {
            addCriterion("SNREQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andSnrequiredEqualTo(String value) {
            addCriterion("SNREQUIRED =", value, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredNotEqualTo(String value) {
            addCriterion("SNREQUIRED <>", value, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredGreaterThan(String value) {
            addCriterion("SNREQUIRED >", value, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredGreaterThanOrEqualTo(String value) {
            addCriterion("SNREQUIRED >=", value, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredLessThan(String value) {
            addCriterion("SNREQUIRED <", value, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredLessThanOrEqualTo(String value) {
            addCriterion("SNREQUIRED <=", value, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredLike(String value) {
            addCriterion("SNREQUIRED like", value, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredNotLike(String value) {
            addCriterion("SNREQUIRED not like", value, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredIn(List<String> values) {
            addCriterion("SNREQUIRED in", values, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredNotIn(List<String> values) {
            addCriterion("SNREQUIRED not in", values, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredBetween(String value1, String value2) {
            addCriterion("SNREQUIRED between", value1, value2, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnrequiredNotBetween(String value1, String value2) {
            addCriterion("SNREQUIRED not between", value1, value2, "snrequired");
            return (Criteria) this;
        }

        public Criteria andSnphotoIsNull() {
            addCriterion("SNPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andSnphotoIsNotNull() {
            addCriterion("SNPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andSnphotoEqualTo(String value) {
            addCriterion("SNPHOTO =", value, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoNotEqualTo(String value) {
            addCriterion("SNPHOTO <>", value, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoGreaterThan(String value) {
            addCriterion("SNPHOTO >", value, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoGreaterThanOrEqualTo(String value) {
            addCriterion("SNPHOTO >=", value, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoLessThan(String value) {
            addCriterion("SNPHOTO <", value, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoLessThanOrEqualTo(String value) {
            addCriterion("SNPHOTO <=", value, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoLike(String value) {
            addCriterion("SNPHOTO like", value, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoNotLike(String value) {
            addCriterion("SNPHOTO not like", value, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoIn(List<String> values) {
            addCriterion("SNPHOTO in", values, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoNotIn(List<String> values) {
            addCriterion("SNPHOTO not in", values, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoBetween(String value1, String value2) {
            addCriterion("SNPHOTO between", value1, value2, "snphoto");
            return (Criteria) this;
        }

        public Criteria andSnphotoNotBetween(String value1, String value2) {
            addCriterion("SNPHOTO not between", value1, value2, "snphoto");
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