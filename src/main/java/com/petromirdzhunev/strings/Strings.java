package com.petromirdzhunev.strings;

/**
 * Utility class providing common string manipulation and validation methods.
 * All methods are null-safe and operate on {@link CharSequence} or {@link String} inputs.
 */
public final class Strings {

    private Strings() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * Checks if the given character sequence is {@code null} or empty.
     *
     * @param str the character sequence to check, may be {@code null}
     * @return {@code true} if the character sequence is {@code null} or empty, {@code false} otherwise
     */
    public static boolean isEmpty(final CharSequence str) {
        return str == null || str.isEmpty();
    }

    /**
     * Checks if the given character sequence is not {@code null} and not empty.
     *
     * @param str the character sequence to check, may be {@code null}
     * @return {@code true} if the character sequence is not {@code null} and not empty, {@code false} otherwise
     */
    public static boolean isNotEmpty(final CharSequence str) {
        return !isEmpty(str);
    }

    /**
     * Checks if the given character sequence is {@code null}, empty or contains only whitespace characters.
     *
     * @param charSequence the character sequence to check, may be {@code null}
     * @return {@code true} if the character sequence is {@code null}, empty or blank, {@code false} otherwise
     */
    public static boolean isBlank(final CharSequence charSequence) {
        boolean blank = true;
        if (charSequence != null && !charSequence.isEmpty()) {
            final int strLen = charSequence.length();
            for (int i = 0; i < strLen; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    blank = false;
                    break;
                }
            }
        }
        return blank;
    }

    /**
     * Checks if the given string is {@code null}, empty or contains only whitespace characters.
     *
     * @param str the string to check, may be {@code null}
     * @return {@code true} if the string is {@code null}, empty or blank, {@code false} otherwise
     */
    public static boolean isBlank(final String str) {
        return str == null || str.isBlank();
    }

    /**
     * Capitalizes the given string by converting the first character to title case.
     * If the string is {@code null} or empty, it is returned unchanged.
     * If the first character is already uppercase, the string is returned unchanged.
     *
     * @param str the string to capitalize, may be {@code null}
     * @return the capitalized string, or {@code null} if the input was {@code null}
     */
    public static String capitalize(final String str) {
        String result = str;
        if (!isEmpty(str)) {
            final int firstCodepoint = str.codePointAt(0);
            if (!Character.isUpperCase(firstCodepoint)) {
                final int newCodePoint = Character.toTitleCase(firstCodepoint);
                final int[] newCodePoints = str.codePoints().toArray();
                newCodePoints[0] = newCodePoint;
                result = new String(newCodePoints, 0, newCodePoints.length);
            }
        }
        return result;
    }
}
