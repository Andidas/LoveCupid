package entity;

import java.util.ArrayList;
import java.util.List;

public class SuccessfulStoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuccessfulStoryExample() {
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

        public Criteria andSsidIsNull() {
            addCriterion("SSID is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("SSID is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(Integer value) {
            addCriterion("SSID =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(Integer value) {
            addCriterion("SSID <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(Integer value) {
            addCriterion("SSID >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SSID >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(Integer value) {
            addCriterion("SSID <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(Integer value) {
            addCriterion("SSID <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<Integer> values) {
            addCriterion("SSID in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<Integer> values) {
            addCriterion("SSID not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(Integer value1, Integer value2) {
            addCriterion("SSID between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(Integer value1, Integer value2) {
            addCriterion("SSID not between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsmeidIsNull() {
            addCriterion("SSMEID is null");
            return (Criteria) this;
        }

        public Criteria andSsmeidIsNotNull() {
            addCriterion("SSMEID is not null");
            return (Criteria) this;
        }

        public Criteria andSsmeidEqualTo(Integer value) {
            addCriterion("SSMEID =", value, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsmeidNotEqualTo(Integer value) {
            addCriterion("SSMEID <>", value, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsmeidGreaterThan(Integer value) {
            addCriterion("SSMEID >", value, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsmeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SSMEID >=", value, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsmeidLessThan(Integer value) {
            addCriterion("SSMEID <", value, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsmeidLessThanOrEqualTo(Integer value) {
            addCriterion("SSMEID <=", value, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsmeidIn(List<Integer> values) {
            addCriterion("SSMEID in", values, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsmeidNotIn(List<Integer> values) {
            addCriterion("SSMEID not in", values, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsmeidBetween(Integer value1, Integer value2) {
            addCriterion("SSMEID between", value1, value2, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsmeidNotBetween(Integer value1, Integer value2) {
            addCriterion("SSMEID not between", value1, value2, "ssmeid");
            return (Criteria) this;
        }

        public Criteria andSsyouridIsNull() {
            addCriterion("SSYOURID is null");
            return (Criteria) this;
        }

        public Criteria andSsyouridIsNotNull() {
            addCriterion("SSYOURID is not null");
            return (Criteria) this;
        }

        public Criteria andSsyouridEqualTo(Integer value) {
            addCriterion("SSYOURID =", value, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSsyouridNotEqualTo(Integer value) {
            addCriterion("SSYOURID <>", value, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSsyouridGreaterThan(Integer value) {
            addCriterion("SSYOURID >", value, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSsyouridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SSYOURID >=", value, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSsyouridLessThan(Integer value) {
            addCriterion("SSYOURID <", value, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSsyouridLessThanOrEqualTo(Integer value) {
            addCriterion("SSYOURID <=", value, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSsyouridIn(List<Integer> values) {
            addCriterion("SSYOURID in", values, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSsyouridNotIn(List<Integer> values) {
            addCriterion("SSYOURID not in", values, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSsyouridBetween(Integer value1, Integer value2) {
            addCriterion("SSYOURID between", value1, value2, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSsyouridNotBetween(Integer value1, Integer value2) {
            addCriterion("SSYOURID not between", value1, value2, "ssyourid");
            return (Criteria) this;
        }

        public Criteria andSscourseIsNull() {
            addCriterion("SSCOURSE is null");
            return (Criteria) this;
        }

        public Criteria andSscourseIsNotNull() {
            addCriterion("SSCOURSE is not null");
            return (Criteria) this;
        }

        public Criteria andSscourseEqualTo(String value) {
            addCriterion("SSCOURSE =", value, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseNotEqualTo(String value) {
            addCriterion("SSCOURSE <>", value, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseGreaterThan(String value) {
            addCriterion("SSCOURSE >", value, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseGreaterThanOrEqualTo(String value) {
            addCriterion("SSCOURSE >=", value, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseLessThan(String value) {
            addCriterion("SSCOURSE <", value, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseLessThanOrEqualTo(String value) {
            addCriterion("SSCOURSE <=", value, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseLike(String value) {
            addCriterion("SSCOURSE like", value, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseNotLike(String value) {
            addCriterion("SSCOURSE not like", value, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseIn(List<String> values) {
            addCriterion("SSCOURSE in", values, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseNotIn(List<String> values) {
            addCriterion("SSCOURSE not in", values, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseBetween(String value1, String value2) {
            addCriterion("SSCOURSE between", value1, value2, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSscourseNotBetween(String value1, String value2) {
            addCriterion("SSCOURSE not between", value1, value2, "sscourse");
            return (Criteria) this;
        }

        public Criteria andSsdateIsNull() {
            addCriterion("SSDATE is null");
            return (Criteria) this;
        }

        public Criteria andSsdateIsNotNull() {
            addCriterion("SSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSsdateEqualTo(String value) {
            addCriterion("SSDATE =", value, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateNotEqualTo(String value) {
            addCriterion("SSDATE <>", value, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateGreaterThan(String value) {
            addCriterion("SSDATE >", value, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateGreaterThanOrEqualTo(String value) {
            addCriterion("SSDATE >=", value, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateLessThan(String value) {
            addCriterion("SSDATE <", value, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateLessThanOrEqualTo(String value) {
            addCriterion("SSDATE <=", value, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateLike(String value) {
            addCriterion("SSDATE like", value, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateNotLike(String value) {
            addCriterion("SSDATE not like", value, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateIn(List<String> values) {
            addCriterion("SSDATE in", values, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateNotIn(List<String> values) {
            addCriterion("SSDATE not in", values, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateBetween(String value1, String value2) {
            addCriterion("SSDATE between", value1, value2, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSsdateNotBetween(String value1, String value2) {
            addCriterion("SSDATE not between", value1, value2, "ssdate");
            return (Criteria) this;
        }

        public Criteria andSstitleIsNull() {
            addCriterion("SSTITLE is null");
            return (Criteria) this;
        }

        public Criteria andSstitleIsNotNull() {
            addCriterion("SSTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSstitleEqualTo(String value) {
            addCriterion("SSTITLE =", value, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleNotEqualTo(String value) {
            addCriterion("SSTITLE <>", value, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleGreaterThan(String value) {
            addCriterion("SSTITLE >", value, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleGreaterThanOrEqualTo(String value) {
            addCriterion("SSTITLE >=", value, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleLessThan(String value) {
            addCriterion("SSTITLE <", value, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleLessThanOrEqualTo(String value) {
            addCriterion("SSTITLE <=", value, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleLike(String value) {
            addCriterion("SSTITLE like", value, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleNotLike(String value) {
            addCriterion("SSTITLE not like", value, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleIn(List<String> values) {
            addCriterion("SSTITLE in", values, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleNotIn(List<String> values) {
            addCriterion("SSTITLE not in", values, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleBetween(String value1, String value2) {
            addCriterion("SSTITLE between", value1, value2, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSstitleNotBetween(String value1, String value2) {
            addCriterion("SSTITLE not between", value1, value2, "sstitle");
            return (Criteria) this;
        }

        public Criteria andSscontentIsNull() {
            addCriterion("SSCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSscontentIsNotNull() {
            addCriterion("SSCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSscontentEqualTo(String value) {
            addCriterion("SSCONTENT =", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentNotEqualTo(String value) {
            addCriterion("SSCONTENT <>", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentGreaterThan(String value) {
            addCriterion("SSCONTENT >", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentGreaterThanOrEqualTo(String value) {
            addCriterion("SSCONTENT >=", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentLessThan(String value) {
            addCriterion("SSCONTENT <", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentLessThanOrEqualTo(String value) {
            addCriterion("SSCONTENT <=", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentLike(String value) {
            addCriterion("SSCONTENT like", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentNotLike(String value) {
            addCriterion("SSCONTENT not like", value, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentIn(List<String> values) {
            addCriterion("SSCONTENT in", values, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentNotIn(List<String> values) {
            addCriterion("SSCONTENT not in", values, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentBetween(String value1, String value2) {
            addCriterion("SSCONTENT between", value1, value2, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSscontentNotBetween(String value1, String value2) {
            addCriterion("SSCONTENT not between", value1, value2, "sscontent");
            return (Criteria) this;
        }

        public Criteria andSsphotoIsNull() {
            addCriterion("SSPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andSsphotoIsNotNull() {
            addCriterion("SSPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andSsphotoEqualTo(String value) {
            addCriterion("SSPHOTO =", value, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoNotEqualTo(String value) {
            addCriterion("SSPHOTO <>", value, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoGreaterThan(String value) {
            addCriterion("SSPHOTO >", value, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoGreaterThanOrEqualTo(String value) {
            addCriterion("SSPHOTO >=", value, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoLessThan(String value) {
            addCriterion("SSPHOTO <", value, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoLessThanOrEqualTo(String value) {
            addCriterion("SSPHOTO <=", value, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoLike(String value) {
            addCriterion("SSPHOTO like", value, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoNotLike(String value) {
            addCriterion("SSPHOTO not like", value, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoIn(List<String> values) {
            addCriterion("SSPHOTO in", values, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoNotIn(List<String> values) {
            addCriterion("SSPHOTO not in", values, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoBetween(String value1, String value2) {
            addCriterion("SSPHOTO between", value1, value2, "ssphoto");
            return (Criteria) this;
        }

        public Criteria andSsphotoNotBetween(String value1, String value2) {
            addCriterion("SSPHOTO not between", value1, value2, "ssphoto");
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