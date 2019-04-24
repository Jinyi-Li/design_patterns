public class Clazz {
        private Integer firstField;
        private Long secondField;
        @Generated("SparkTools")
        private Clazz(Builder builder) {
            this.firstField = builder.firstField;
            this.secondField = builder.secondField;
        }
        /**
         * Creates builder to build {@link Clazz}.
         * @return created builder
         */
        @Generated("SparkTools")
        public static Builder builder() {
            return new Builder();
        }
        /**
         * Builder to build {@link Clazz}.
         */
        @Generated("SparkTools")
        public static class Builder {
            private Integer firstField;
            private Long secondField;

            private Builder() {
            }

            /**
            * Builder method for firstField parameter.
            * @return builder
            */
            @Nonnull
            public Builder withFirstField(@Nonnull Integer firstField) {
                this.firstField = firstField;
                return this;
            }

            /**
            * Builder method for secondField parameter.
            * @return builder
            */
            @Nonnull
            public Builder withSecondField(@Nonnull Long secondField) {
                this.secondField = secondField;
                return this;
            }

            /**
            * Builder method of the builder.
            * @return built class
            */
            @Nonnull
            public Clazz build() {
                return new Clazz(this);
            }
        }
    }