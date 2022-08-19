package top.xiaorang.design.pattern.builder;

import lombok.Data;

/**
 * @author liulei
 * @description 汽车
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/19 2:09
 */
@Data
public class Car {
    /**
     * 座位
     */
    private Integer seats;
    /**
     * gps
     */
    private String gps;
    /**
     * 引擎
     */
    private String engine;
    /**
     * 行车电脑
     */
    private String tripComputer;
    /**
     * 款式
     */
    private String shape;

    private Car(Builder builder) {
        this.seats = builder.seats;
        this.gps = builder.gps;
        this.engine = builder.engine;
        this.tripComputer = builder.tripComputer;
        this.shape = builder.shape;
    }

    public static class Builder {
        private Integer seats;
        private String gps;
        private String engine;
        private String tripComputer;
        private String shape;

        public Builder setSeats(Integer seats) {
            this.seats = seats;
            return this;
        }

        public Builder setGps(String gps) {
            this.gps = gps;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setTripComputer(String tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        public Builder setShape(String shape) {
            this.shape = shape;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
