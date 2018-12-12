// Generated by delombok at Wed Dec 12 18:59:26 EST 2018
/*
* Copyright 2018 Basis Technology Corp.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.basistech.rosette.apimodel;

import com.basistech.rosette.annotations.JacksonMixin;

@JacksonMixin
public final class CategoryLabel {
    /**
     */
    private final String label;
    /**
     */
    private final Double confidence;
    /**
     */
    private final Double score;

    @java.beans.ConstructorProperties({"label", "confidence", "score"})
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    CategoryLabel(final String label, final Double confidence, final Double score) {
        this.label = label;
        this.confidence = confidence;
        this.score = score;
    }


    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static class CategoryLabelBuilder {
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private String label;
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private Double confidence;
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        private Double score;

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        CategoryLabelBuilder() {
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public CategoryLabelBuilder label(final String label) {
            this.label = label;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public CategoryLabelBuilder confidence(final Double confidence) {
            this.confidence = confidence;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public CategoryLabelBuilder score(final Double score) {
            this.score = score;
            return this;
        }

        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public CategoryLabel build() {
            return new CategoryLabel(label, confidence, score);
        }

        @Override
        @SuppressWarnings("all")
        @javax.annotation.Generated("lombok")
        public String toString() {
            return "CategoryLabel.CategoryLabelBuilder(label=" + this.label + ", confidence=" + this.confidence + ", score=" + this.score + ")";
        }
    }

    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public static CategoryLabelBuilder builder() {
        return new CategoryLabelBuilder();
    }

    /**
     * @return the label.
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public String getLabel() {
        return this.label;
    }

    /**
     * @return the confidence score  (0.0-1.0)
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * @return the raw score (-INF-INF)
     */
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public Double getScore() {
        return this.score;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CategoryLabel)) return false;
        final CategoryLabel other = (CategoryLabel) o;
        final Object this$label = this.getLabel();
        final Object other$label = other.getLabel();
        if (this$label == null ? other$label != null : !this$label.equals(other$label)) return false;
        final Object this$confidence = this.getConfidence();
        final Object other$confidence = other.getConfidence();
        if (this$confidence == null ? other$confidence != null : !this$confidence.equals(other$confidence)) return false;
        final Object this$score = this.getScore();
        final Object other$score = other.getScore();
        if (this$score == null ? other$score != null : !this$score.equals(other$score)) return false;
        return true;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $label = this.getLabel();
        result = result * PRIME + ($label == null ? 43 : $label.hashCode());
        final Object $confidence = this.getConfidence();
        result = result * PRIME + ($confidence == null ? 43 : $confidence.hashCode());
        final Object $score = this.getScore();
        result = result * PRIME + ($score == null ? 43 : $score.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public String toString() {
        return "CategoryLabel(label=" + this.getLabel() + ", confidence=" + this.getConfidence() + ", score=" + this.getScore() + ")";
    }
}
