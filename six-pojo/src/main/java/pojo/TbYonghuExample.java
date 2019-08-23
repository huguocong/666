package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbYonghuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbYonghuExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTemaIsNull() {
            addCriterion("tema is null");
            return (Criteria) this;
        }

        public Criteria andTemaIsNotNull() {
            addCriterion("tema is not null");
            return (Criteria) this;
        }

        public Criteria andTemaEqualTo(String value) {
            addCriterion("tema =", value, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaNotEqualTo(String value) {
            addCriterion("tema <>", value, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaGreaterThan(String value) {
            addCriterion("tema >", value, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaGreaterThanOrEqualTo(String value) {
            addCriterion("tema >=", value, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaLessThan(String value) {
            addCriterion("tema <", value, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaLessThanOrEqualTo(String value) {
            addCriterion("tema <=", value, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaLike(String value) {
            addCriterion("tema like", value, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaNotLike(String value) {
            addCriterion("tema not like", value, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaIn(List<String> values) {
            addCriterion("tema in", values, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaNotIn(List<String> values) {
            addCriterion("tema not in", values, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaBetween(String value1, String value2) {
            addCriterion("tema between", value1, value2, "tema");
            return (Criteria) this;
        }

        public Criteria andTemaNotBetween(String value1, String value2) {
            addCriterion("tema not between", value1, value2, "tema");
            return (Criteria) this;
        }

        public Criteria andPinIsNull() {
            addCriterion("pin is null");
            return (Criteria) this;
        }

        public Criteria andPinIsNotNull() {
            addCriterion("pin is not null");
            return (Criteria) this;
        }

        public Criteria andPinEqualTo(String value) {
            addCriterion("pin =", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotEqualTo(String value) {
            addCriterion("pin <>", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinGreaterThan(String value) {
            addCriterion("pin >", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinGreaterThanOrEqualTo(String value) {
            addCriterion("pin >=", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinLessThan(String value) {
            addCriterion("pin <", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinLessThanOrEqualTo(String value) {
            addCriterion("pin <=", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinLike(String value) {
            addCriterion("pin like", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotLike(String value) {
            addCriterion("pin not like", value, "pin");
            return (Criteria) this;
        }

        public Criteria andPinIn(List<String> values) {
            addCriterion("pin in", values, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotIn(List<String> values) {
            addCriterion("pin not in", values, "pin");
            return (Criteria) this;
        }

        public Criteria andPinBetween(String value1, String value2) {
            addCriterion("pin between", value1, value2, "pin");
            return (Criteria) this;
        }

        public Criteria andPinNotBetween(String value1, String value2) {
            addCriterion("pin not between", value1, value2, "pin");
            return (Criteria) this;
        }

        public Criteria andLianxiaoIsNull() {
            addCriterion("lianxiao is null");
            return (Criteria) this;
        }

        public Criteria andLianxiaoIsNotNull() {
            addCriterion("lianxiao is not null");
            return (Criteria) this;
        }

        public Criteria andLianxiaoEqualTo(String value) {
            addCriterion("lianxiao =", value, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoNotEqualTo(String value) {
            addCriterion("lianxiao <>", value, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoGreaterThan(String value) {
            addCriterion("lianxiao >", value, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoGreaterThanOrEqualTo(String value) {
            addCriterion("lianxiao >=", value, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoLessThan(String value) {
            addCriterion("lianxiao <", value, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoLessThanOrEqualTo(String value) {
            addCriterion("lianxiao <=", value, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoLike(String value) {
            addCriterion("lianxiao like", value, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoNotLike(String value) {
            addCriterion("lianxiao not like", value, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoIn(List<String> values) {
            addCriterion("lianxiao in", values, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoNotIn(List<String> values) {
            addCriterion("lianxiao not in", values, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoBetween(String value1, String value2) {
            addCriterion("lianxiao between", value1, value2, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andLianxiaoNotBetween(String value1, String value2) {
            addCriterion("lianxiao not between", value1, value2, "lianxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuIsNull() {
            addCriterion("yingfu is null");
            return (Criteria) this;
        }

        public Criteria andYingfuIsNotNull() {
            addCriterion("yingfu is not null");
            return (Criteria) this;
        }

        public Criteria andYingfuEqualTo(Integer value) {
            addCriterion("yingfu =", value, "yingfu");
            return (Criteria) this;
        }

        public Criteria andYingfuNotEqualTo(Integer value) {
            addCriterion("yingfu <>", value, "yingfu");
            return (Criteria) this;
        }

        public Criteria andYingfuGreaterThan(Integer value) {
            addCriterion("yingfu >", value, "yingfu");
            return (Criteria) this;
        }

        public Criteria andYingfuGreaterThanOrEqualTo(Integer value) {
            addCriterion("yingfu >=", value, "yingfu");
            return (Criteria) this;
        }

        public Criteria andYingfuLessThan(Integer value) {
            addCriterion("yingfu <", value, "yingfu");
            return (Criteria) this;
        }

        public Criteria andYingfuLessThanOrEqualTo(Integer value) {
            addCriterion("yingfu <=", value, "yingfu");
            return (Criteria) this;
        }

        public Criteria andYingfuIn(List<Integer> values) {
            addCriterion("yingfu in", values, "yingfu");
            return (Criteria) this;
        }

        public Criteria andYingfuNotIn(List<Integer> values) {
            addCriterion("yingfu not in", values, "yingfu");
            return (Criteria) this;
        }

        public Criteria andYingfuBetween(Integer value1, Integer value2) {
            addCriterion("yingfu between", value1, value2, "yingfu");
            return (Criteria) this;
        }

        public Criteria andYingfuNotBetween(Integer value1, Integer value2) {
            addCriterion("yingfu not between", value1, value2, "yingfu");
            return (Criteria) this;
        }

        public Criteria andShifuIsNull() {
            addCriterion("shifu is null");
            return (Criteria) this;
        }

        public Criteria andShifuIsNotNull() {
            addCriterion("shifu is not null");
            return (Criteria) this;
        }

        public Criteria andShifuEqualTo(Integer value) {
            addCriterion("shifu =", value, "shifu");
            return (Criteria) this;
        }

        public Criteria andShifuNotEqualTo(Integer value) {
            addCriterion("shifu <>", value, "shifu");
            return (Criteria) this;
        }

        public Criteria andShifuGreaterThan(Integer value) {
            addCriterion("shifu >", value, "shifu");
            return (Criteria) this;
        }

        public Criteria andShifuGreaterThanOrEqualTo(Integer value) {
            addCriterion("shifu >=", value, "shifu");
            return (Criteria) this;
        }

        public Criteria andShifuLessThan(Integer value) {
            addCriterion("shifu <", value, "shifu");
            return (Criteria) this;
        }

        public Criteria andShifuLessThanOrEqualTo(Integer value) {
            addCriterion("shifu <=", value, "shifu");
            return (Criteria) this;
        }

        public Criteria andShifuIn(List<Integer> values) {
            addCriterion("shifu in", values, "shifu");
            return (Criteria) this;
        }

        public Criteria andShifuNotIn(List<Integer> values) {
            addCriterion("shifu not in", values, "shifu");
            return (Criteria) this;
        }

        public Criteria andShifuBetween(Integer value1, Integer value2) {
            addCriterion("shifu between", value1, value2, "shifu");
            return (Criteria) this;
        }

        public Criteria andShifuNotBetween(Integer value1, Integer value2) {
            addCriterion("shifu not between", value1, value2, "shifu");
            return (Criteria) this;
        }

        public Criteria andBeishuIsNull() {
            addCriterion("beishu is null");
            return (Criteria) this;
        }

        public Criteria andBeishuIsNotNull() {
            addCriterion("beishu is not null");
            return (Criteria) this;
        }

        public Criteria andBeishuEqualTo(Integer value) {
            addCriterion("beishu =", value, "beishu");
            return (Criteria) this;
        }

        public Criteria andBeishuNotEqualTo(Integer value) {
            addCriterion("beishu <>", value, "beishu");
            return (Criteria) this;
        }

        public Criteria andBeishuGreaterThan(Integer value) {
            addCriterion("beishu >", value, "beishu");
            return (Criteria) this;
        }

        public Criteria andBeishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("beishu >=", value, "beishu");
            return (Criteria) this;
        }

        public Criteria andBeishuLessThan(Integer value) {
            addCriterion("beishu <", value, "beishu");
            return (Criteria) this;
        }

        public Criteria andBeishuLessThanOrEqualTo(Integer value) {
            addCriterion("beishu <=", value, "beishu");
            return (Criteria) this;
        }

        public Criteria andBeishuIn(List<Integer> values) {
            addCriterion("beishu in", values, "beishu");
            return (Criteria) this;
        }

        public Criteria andBeishuNotIn(List<Integer> values) {
            addCriterion("beishu not in", values, "beishu");
            return (Criteria) this;
        }

        public Criteria andBeishuBetween(Integer value1, Integer value2) {
            addCriterion("beishu between", value1, value2, "beishu");
            return (Criteria) this;
        }

        public Criteria andBeishuNotBetween(Integer value1, Integer value2) {
            addCriterion("beishu not between", value1, value2, "beishu");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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