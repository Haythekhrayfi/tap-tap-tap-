package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class MoreObjects {

    public static final class ToStringHelper {
        private final String className;
        private final a holderHead;
        private a holderTail;
        private boolean omitNullValues;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NullableDecl
            public String f5008a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NullableDecl
            public Object f5009b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NullableDecl
            public a f5010c;

            private a() {
            }
        }

        private ToStringHelper(String str) {
            a aVar = new a();
            this.holderHead = aVar;
            this.holderTail = aVar;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        private a addHolder() {
            a aVar = new a();
            this.holderTail.f5010c = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        private ToStringHelper addHolder(@NullableDecl Object obj) {
            addHolder().f5009b = obj;
            return this;
        }

        private ToStringHelper addHolder(String str, @NullableDecl Object obj) {
            a aVarAddHolder = addHolder();
            aVarAddHolder.f5009b = obj;
            aVarAddHolder.f5008a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public ToStringHelper add(String str, char c10) {
            return addHolder(str, String.valueOf(c10));
        }

        public ToStringHelper add(String str, double d10) {
            return addHolder(str, String.valueOf(d10));
        }

        public ToStringHelper add(String str, float f10) {
            return addHolder(str, String.valueOf(f10));
        }

        public ToStringHelper add(String str, int i10) {
            return addHolder(str, String.valueOf(i10));
        }

        public ToStringHelper add(String str, long j10) {
            return addHolder(str, String.valueOf(j10));
        }

        public ToStringHelper add(String str, @NullableDecl Object obj) {
            return addHolder(str, obj);
        }

        public ToStringHelper add(String str, boolean z10) {
            return addHolder(str, String.valueOf(z10));
        }

        public ToStringHelper addValue(char c10) {
            return addHolder(String.valueOf(c10));
        }

        public ToStringHelper addValue(double d10) {
            return addHolder(String.valueOf(d10));
        }

        public ToStringHelper addValue(float f10) {
            return addHolder(String.valueOf(f10));
        }

        public ToStringHelper addValue(int i10) {
            return addHolder(String.valueOf(i10));
        }

        public ToStringHelper addValue(long j10) {
            return addHolder(String.valueOf(j10));
        }

        public ToStringHelper addValue(@NullableDecl Object obj) {
            return addHolder(obj);
        }

        public ToStringHelper addValue(boolean z10) {
            return addHolder(String.valueOf(z10));
        }

        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.omitNullValues;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.className);
            sb2.append('{');
            String str = "";
            for (a aVar = this.holderHead.f5010c; aVar != null; aVar = aVar.f5010c) {
                Object obj = aVar.f5009b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f5008a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@NullableDecl T t10, @NullableDecl T t11) {
        if (t10 != null) {
            return t10;
        }
        java.util.Objects.requireNonNull(t11, "Both parameters are null");
        return t11;
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
