package com.yandex.metrica.plugins;

/* JADX INFO: loaded from: classes.dex */
public class StackTraceItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f18106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f18107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18108e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f18111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f18112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f18113e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f18109a, this.f18110b, this.f18111c, this.f18112d, this.f18113e, null);
        }

        public Builder withClassName(String str) {
            this.f18109a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f18112d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f18110b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f18111c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f18113e = str;
            return this;
        }
    }

    public StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, a aVar) {
        this.f18104a = str;
        this.f18105b = str2;
        this.f18106c = num;
        this.f18107d = num2;
        this.f18108e = str3;
    }

    public String getClassName() {
        return this.f18104a;
    }

    public Integer getColumn() {
        return this.f18107d;
    }

    public String getFileName() {
        return this.f18105b;
    }

    public Integer getLine() {
        return this.f18106c;
    }

    public String getMethodName() {
        return this.f18108e;
    }
}
