package entity;

import java.util.ArrayList;
import java.util.List;

public class FeedBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedBackExample() {
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

        public Criteria andFbidIsNull() {
            addCriterion("FBID is null");
            return (Criteria) this;
        }

        public Criteria andFbidIsNotNull() {
            addCriterion("FBID is not null");
            return (Criteria) this;
        }

        public Criteria andFbidEqualTo(Integer value) {
            addCriterion("FBID =", value, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbidNotEqualTo(Integer value) {
            addCriterion("FBID <>", value, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbidGreaterThan(Integer value) {
            addCriterion("FBID >", value, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBID >=", value, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbidLessThan(Integer value) {
            addCriterion("FBID <", value, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbidLessThanOrEqualTo(Integer value) {
            addCriterion("FBID <=", value, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbidIn(List<Integer> values) {
            addCriterion("FBID in", values, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbidNotIn(List<Integer> values) {
            addCriterion("FBID not in", values, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbidBetween(Integer value1, Integer value2) {
            addCriterion("FBID between", value1, value2, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbidNotBetween(Integer value1, Integer value2) {
            addCriterion("FBID not between", value1, value2, "fbid");
            return (Criteria) this;
        }

        public Criteria andFbphoneIsNull() {
            addCriterion("FBPHONE is null");
            return (Criteria) this;
        }

        public Criteria andFbphoneIsNotNull() {
            addCriterion("FBPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andFbphoneEqualTo(Integer value) {
            addCriterion("FBPHONE =", value, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbphoneNotEqualTo(Integer value) {
            addCriterion("FBPHONE <>", value, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbphoneGreaterThan(Integer value) {
            addCriterion("FBPHONE >", value, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbphoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("FBPHONE >=", value, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbphoneLessThan(Integer value) {
            addCriterion("FBPHONE <", value, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbphoneLessThanOrEqualTo(Integer value) {
            addCriterion("FBPHONE <=", value, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbphoneIn(List<Integer> values) {
            addCriterion("FBPHONE in", values, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbphoneNotIn(List<Integer> values) {
            addCriterion("FBPHONE not in", values, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbphoneBetween(Integer value1, Integer value2) {
            addCriterion("FBPHONE between", value1, value2, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbphoneNotBetween(Integer value1, Integer value2) {
            addCriterion("FBPHONE not between", value1, value2, "fbphone");
            return (Criteria) this;
        }

        public Criteria andFbcontentIsNull() {
            addCriterion("FBCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andFbcontentIsNotNull() {
            addCriterion("FBCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andFbcontentEqualTo(String value) {
            addCriterion("FBCONTENT =", value, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentNotEqualTo(String value) {
            addCriterion("FBCONTENT <>", value, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentGreaterThan(String value) {
            addCriterion("FBCONTENT >", value, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentGreaterThanOrEqualTo(String value) {
            addCriterion("FBCONTENT >=", value, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentLessThan(String value) {
            addCriterion("FBCONTENT <", value, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentLessThanOrEqualTo(String value) {
            addCriterion("FBCONTENT <=", value, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentLike(String value) {
            addCriterion("FBCONTENT like", value, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentNotLike(String value) {
            addCriterion("FBCONTENT not like", value, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentIn(List<String> values) {
            addCriterion("FBCONTENT in", values, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentNotIn(List<String> values) {
            addCriterion("FBCONTENT not in", values, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentBetween(String value1, String value2) {
            addCriterion("FBCONTENT between", value1, value2, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbcontentNotBetween(String value1, String value2) {
            addCriterion("FBCONTENT not between", value1, value2, "fbcontent");
            return (Criteria) this;
        }

        public Criteria andFbtypeIsNull() {
            addCriterion("FBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFbtypeIsNotNull() {
            addCriterion("FBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFbtypeEqualTo(String value) {
            addCriterion("FBTYPE =", value, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeNotEqualTo(String value) {
            addCriterion("FBTYPE <>", value, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeGreaterThan(String value) {
            addCriterion("FBTYPE >", value, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FBTYPE >=", value, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeLessThan(String value) {
            addCriterion("FBTYPE <", value, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeLessThanOrEqualTo(String value) {
            addCriterion("FBTYPE <=", value, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeLike(String value) {
            addCriterion("FBTYPE like", value, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeNotLike(String value) {
            addCriterion("FBTYPE not like", value, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeIn(List<String> values) {
            addCriterion("FBTYPE in", values, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeNotIn(List<String> values) {
            addCriterion("FBTYPE not in", values, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeBetween(String value1, String value2) {
            addCriterion("FBTYPE between", value1, value2, "fbtype");
            return (Criteria) this;
        }

        public Criteria andFbtypeNotBetween(String value1, String value2) {
            addCriterion("FBTYPE not between", value1, value2, "fbtype");
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