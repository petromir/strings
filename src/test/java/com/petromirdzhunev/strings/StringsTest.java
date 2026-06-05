package com.petromirdzhunev.strings;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StringsTest {

    @Test
    void isEmptyReturnsTrueForNull() {
        assertThat(Strings.isEmpty(null)).isTrue();
    }

    @Test
    void isEmptyReturnsTrueForEmptyString() {
        assertThat(Strings.isEmpty("")).isTrue();
    }

    @Test
    void isEmptyReturnsTrueForEmptyStringBuilder() {
        assertThat(Strings.isEmpty(new StringBuilder())).isTrue();
    }

    @Test
    void isEmptyReturnsFalseForNonEmptyString() {
        assertThat(Strings.isEmpty("hello")).isFalse();
    }

    @Test
    void isEmptyReturnsFalseForNonEmptyStringBuilder() {
        assertThat(Strings.isEmpty(new StringBuilder("hello"))).isFalse();
    }

    @Test
    void isNotEmptyReturnsFalseForNull() {
        assertThat(Strings.isNotEmpty(null)).isFalse();
    }

    @Test
    void isNotEmptyReturnsFalseForEmptyString() {
        assertThat(Strings.isNotEmpty("")).isFalse();
    }

    @Test
    void isNotEmptyReturnsTrueForNonEmptyString() {
        assertThat(Strings.isNotEmpty("hello")).isTrue();
    }

    @Test
    void isBlankReturnsTrueForNull() {
        assertThat(Strings.isBlank(null)).isTrue();
    }

    @Test
    void isBlankReturnsTrueForEmptyString() {
        assertThat(Strings.isBlank("")).isTrue();
    }

    @Test
    void isBlankReturnsTrueForWhitespaceOnly() {
        assertThat(Strings.isBlank("   ")).isTrue();
    }

    @Test
    void isBlankReturnsTrueForTabsAndNewlines() {
        assertThat(Strings.isBlank("\t\n\r")).isTrue();
    }

    @Test
    void isBlankReturnsFalseForNonEmptyString() {
        assertThat(Strings.isBlank("hello")).isFalse();
    }

    @Test
    void isBlankReturnsFalseForStringWithLeadingWhitespace() {
        assertThat(Strings.isBlank("  hello")).isFalse();
    }

    @Test
    void isBlankReturnsTrueForEmptyStringBuilder() {
        assertThat(Strings.isBlank(new StringBuilder())).isTrue();
    }

    @Test
    void isBlankReturnsTrueForWhitespaceOnlyStringBuilder() {
        assertThat(Strings.isBlank(new StringBuilder("   "))).isTrue();
    }

    @Test
    void isBlankReturnsFalseForNonEmptyStringBuilder() {
        assertThat(Strings.isBlank(new StringBuilder("hello"))).isFalse();
    }

    @Test
    void capitalizeReturnsNullForNull() {
        assertThat(Strings.capitalize(null)).isNull();
    }

    @Test
    void capitalizeReturnsEmptyStringForEmptyString() {
        assertThat(Strings.capitalize("")).isEqualTo("");
    }

    @Test
    void capitalizeReturnsUnchangedForAlreadyCapitalized() {
        assertThat(Strings.capitalize("Hello")).isEqualTo("Hello");
    }

    @Test
    void capitalizeReturnsUnchangedForAllUppercase() {
        assertThat(Strings.capitalize("HELLO")).isEqualTo("HELLO");
    }

    @Test
    void capitalizeCapitalizesLowercaseFirstLetter() {
        assertThat(Strings.capitalize("hello")).isEqualTo("Hello");
    }

    @Test
    void capitalizeCapitalizesSingleCharacter() {
        assertThat(Strings.capitalize("h")).isEqualTo("H");
    }

    @Test
    void capitalizeHandlesUnicodeCharacters() {
        assertThat(Strings.capitalize("éhello")).isEqualTo("Éhello");
    }
}
