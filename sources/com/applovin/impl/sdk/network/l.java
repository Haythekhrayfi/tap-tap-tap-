package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.r;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class l<T> extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10974b;

    public static class a<T> extends c.a<T> {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f10975r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f10976s;

        public a(o oVar) {
            super(oVar);
            this.f10864h = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.dl)).intValue();
            this.f10865i = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.dk)).intValue();
            this.f10866j = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.du)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a a(Map map) {
            return c((Map<String, String>) map);
        }

        @Override // com.applovin.impl.sdk.network.c.a
        public /* synthetic */ c.a b(Map map) {
            return d((Map<String, String>) map);
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(r.a aVar) {
            this.f10873q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(T t10) {
            this.f10863g = t10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f10862f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l<T> a() {
            return new l<>(this);
        }

        public a c(Map<String, String> map) {
            this.f10860d = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f10864h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f10858b = str;
            return this;
        }

        public a d(Map<String, String> map) {
            this.f10861e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f10865i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f10859c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f10866j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f10857a = str;
            return this;
        }

        public a g(String str) {
            this.f10975r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(boolean z10) {
            this.f10870n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.c.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a f(boolean z10) {
            this.f10872p = z10;
            return this;
        }

        public a i(boolean z10) {
            this.f10976s = z10;
            return this;
        }
    }

    public l(a aVar) {
        super(aVar);
        this.f10973a = aVar.f10975r;
        this.f10974b = aVar.f10976s;
    }

    public static a b(o oVar) {
        return new a(oVar);
    }

    public boolean s() {
        return this.f10973a != null;
    }

    public String t() {
        return this.f10973a;
    }

    public boolean u() {
        return this.f10974b;
    }
}
