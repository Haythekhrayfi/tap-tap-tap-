package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements com.google.gson.d {
    private static final /* synthetic */ c[] $VALUES;
    public static final c IDENTITY;
    public static final c LOWER_CASE_WITH_DASHES;
    public static final c LOWER_CASE_WITH_DOTS;
    public static final c LOWER_CASE_WITH_UNDERSCORES;
    public static final c UPPER_CAMEL_CASE;
    public static final c UPPER_CAMEL_CASE_WITH_SPACES;

    public static enum a extends c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.c, com.google.gson.d
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.upperCaseFirstLetter(c.separateCamelCase(field.getName(), " "));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c, com.google.gson.d
            public String translateName(Field field) {
                return c.separateCamelCase(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = cVar5;
        $VALUES = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private c(String str, int i10) {
        super(str, i10);
    }

    public /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }

    private static String modifyString(char c10, String str, int i10) {
        if (i10 >= str.length()) {
            return String.valueOf(c10);
        }
        StringBuilder sbA = o2.b.a(c10);
        sbA.append(str.substring(i10));
        return sbA.toString();
    }

    public static String separateCamelCase(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        char cCharAt = str.charAt(0);
        int length = str.length();
        while (i10 < length - 1 && !Character.isLetter(cCharAt)) {
            sb2.append(cCharAt);
            i10++;
            cCharAt = str.charAt(i10);
        }
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        sb2.append(modifyString(Character.toUpperCase(cCharAt), str, i10 + 1));
        return sb2.toString();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // com.google.gson.d
    public abstract /* synthetic */ String translateName(Field field);
}
