package entity;

import java.util.ArrayList;
import java.util.List;

public class UserDynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDynamicExample() {
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

        public Criteria andUdnidIsNull() {
            addCriterion("UDNID is null");
            return (Criteria) this;
        }

        public Criteria andUdnidIsNotNull() {
            addCriterion("UDNID is not null");
            return (Criteria) this;
        }

        public Criteria andUdnidEqualTo(Integer value) {
            addCriterion("UDNID =", value, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdnidNotEqualTo(Integer value) {
            addCriterion("UDNID <>", value, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdnidGreaterThan(Integer value) {
            addCriterion("UDNID >", value, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdnidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UDNID >=", value, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdnidLessThan(Integer value) {
            addCriterion("UDNID <", value, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdnidLessThanOrEqualTo(Integer value) {
            addCriterion("UDNID <=", value, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdnidIn(List<Integer> values) {
            addCriterion("UDNID in", values, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdnidNotIn(List<Integer> values) {
            addCriterion("UDNID not in", values, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdnidBetween(Integer value1, Integer value2) {
            addCriterion("UDNID between", value1, value2, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdnidNotBetween(Integer value1, Integer value2) {
            addCriterion("UDNID not between", value1, value2, "udnid");
            return (Criteria) this;
        }

        public Criteria andUdntypeIsNull() {
            addCriterion("UDNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUdntypeIsNotNull() {
            addCriterion("UDNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUdntypeEqualTo(String value) {
            addCriterion("UDNTYPE =", value, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeNotEqualTo(String value) {
            addCriterion("UDNTYPE <>", value, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeGreaterThan(String value) {
            addCriterion("UDNTYPE >", value, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeGreaterThanOrEqualTo(String value) {
            addCriterion("UDNTYPE >=", value, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeLessThan(String value) {
            addCriterion("UDNTYPE <", value, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeLessThanOrEqualTo(String value) {
            addCriterion("UDNTYPE <=", value, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeLike(String value) {
            addCriterion("UDNTYPE like", value, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeNotLike(String value) {
            addCriterion("UDNTYPE not like", value, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeIn(List<String> values) {
            addCriterion("UDNTYPE in", values, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeNotIn(List<String> values) {
            addCriterion("UDNTYPE not in", values, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeBetween(String value1, String value2) {
            addCriterion("UDNTYPE between", value1, value2, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntypeNotBetween(String value1, String value2) {
            addCriterion("UDNTYPE not between", value1, value2, "udntype");
            return (Criteria) this;
        }

        public Criteria andUdntopicIsNull() {
            addCriterion("UDNTOPIC is null");
            return (Criteria) this;
        }

        public Criteria andUdntopicIsNotNull() {
            addCriterion("UDNTOPIC is not null");
            return (Criteria) this;
        }

        public Criteria andUdntopicEqualTo(String value) {
            addCriterion("UDNTOPIC =", value, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicNotEqualTo(String value) {
            addCriterion("UDNTOPIC <>", value, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicGreaterThan(String value) {
            addCriterion("UDNTOPIC >", value, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicGreaterThanOrEqualTo(String value) {
            addCriterion("UDNTOPIC >=", value, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicLessThan(String value) {
            addCriterion("UDNTOPIC <", value, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicLessThanOrEqualTo(String value) {
            addCriterion("UDNTOPIC <=", value, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicLike(String value) {
            addCriterion("UDNTOPIC like", value, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicNotLike(String value) {
            addCriterion("UDNTOPIC not like", value, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicIn(List<String> values) {
            addCriterion("UDNTOPIC in", values, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicNotIn(List<String> values) {
            addCriterion("UDNTOPIC not in", values, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicBetween(String value1, String value2) {
            addCriterion("UDNTOPIC between", value1, value2, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdntopicNotBetween(String value1, String value2) {
            addCriterion("UDNTOPIC not between", value1, value2, "udntopic");
            return (Criteria) this;
        }

        public Criteria andUdncontentIsNull() {
            addCriterion("UDNCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andUdncontentIsNotNull() {
            addCriterion("UDNCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andUdncontentEqualTo(String value) {
            addCriterion("UDNCONTENT =", value, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentNotEqualTo(String value) {
            addCriterion("UDNCONTENT <>", value, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentGreaterThan(String value) {
            addCriterion("UDNCONTENT >", value, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentGreaterThanOrEqualTo(String value) {
            addCriterion("UDNCONTENT >=", value, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentLessThan(String value) {
            addCriterion("UDNCONTENT <", value, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentLessThanOrEqualTo(String value) {
            addCriterion("UDNCONTENT <=", value, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentLike(String value) {
            addCriterion("UDNCONTENT like", value, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentNotLike(String value) {
            addCriterion("UDNCONTENT not like", value, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentIn(List<String> values) {
            addCriterion("UDNCONTENT in", values, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentNotIn(List<String> values) {
            addCriterion("UDNCONTENT not in", values, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentBetween(String value1, String value2) {
            addCriterion("UDNCONTENT between", value1, value2, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdncontentNotBetween(String value1, String value2) {
            addCriterion("UDNCONTENT not between", value1, value2, "udncontent");
            return (Criteria) this;
        }

        public Criteria andUdnphotoIsNull() {
            addCriterion("UDNPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andUdnphotoIsNotNull() {
            addCriterion("UDNPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andUdnphotoEqualTo(String value) {
            addCriterion("UDNPHOTO =", value, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoNotEqualTo(String value) {
            addCriterion("UDNPHOTO <>", value, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoGreaterThan(String value) {
            addCriterion("UDNPHOTO >", value, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoGreaterThanOrEqualTo(String value) {
            addCriterion("UDNPHOTO >=", value, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoLessThan(String value) {
            addCriterion("UDNPHOTO <", value, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoLessThanOrEqualTo(String value) {
            addCriterion("UDNPHOTO <=", value, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoLike(String value) {
            addCriterion("UDNPHOTO like", value, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoNotLike(String value) {
            addCriterion("UDNPHOTO not like", value, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoIn(List<String> values) {
            addCriterion("UDNPHOTO in", values, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoNotIn(List<String> values) {
            addCriterion("UDNPHOTO not in", values, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoBetween(String value1, String value2) {
            addCriterion("UDNPHOTO between", value1, value2, "udnphoto");
            return (Criteria) this;
        }

        public Criteria andUdnphotoNotBetween(String value1, String value2) {
            addCriterion("UDNPHOTO not between", value1, value2, "udnphoto");
            return (Criteria) this;
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