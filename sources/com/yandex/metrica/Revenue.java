package com.yandex.metrica;

import com.yandex.metrica.impl.ob.qo;
import com.yandex.metrica.impl.ob.ro;
import com.yandex.metrica.impl.ob.uo;
import java.util.Currency;

/* JADX INFO: loaded from: classes.dex */
public class Revenue {
    public final Currency currency;
    public final String payload;

    @Deprecated
    public final Double price;
    public final Long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    public static class Builder {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final uo<Currency> f13473h = new ro(new qo("revenue currency"));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f13474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f13475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Currency f13476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f13477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f13478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f13479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Receipt f13480g;

        public Builder(double d10, Currency currency) {
            ((ro) f13473h).a(currency);
            this.f13474a = Double.valueOf(d10);
            this.f13476c = currency;
        }

        public Builder(long j10, Currency currency) {
            ((ro) f13473h).a(currency);
            this.f13475b = Long.valueOf(j10);
            this.f13476c = currency;
        }

        public Revenue build() {
            return new Revenue(this, null);
        }

        public Builder withPayload(String str) {
            this.f13479f = str;
            return this;
        }

        public Builder withProductID(String str) {
            this.f13478e = str;
            return this;
        }

        public Builder withQuantity(Integer num) {
            this.f13477d = num;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f13480g = receipt;
            return this;
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        public static class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f13481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f13482b;

            public Receipt build() {
                return new Receipt(this, null);
            }

            public Builder withData(String str) {
                this.f13481a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f13482b = str;
                return this;
            }
        }

        public Receipt(Builder builder, a aVar) {
            this.data = builder.f13481a;
            this.signature = builder.f13482b;
        }

        public static Builder newBuilder() {
            return new Builder();
        }
    }

    public Revenue(Builder builder, a aVar) {
        this.price = builder.f13474a;
        this.priceMicros = builder.f13475b;
        this.currency = builder.f13476c;
        this.quantity = builder.f13477d;
        this.productID = builder.f13478e;
        this.payload = builder.f13479f;
        this.receipt = builder.f13480g;
    }

    @Deprecated
    public static Builder newBuilder(double d10, Currency currency) {
        return new Builder(d10, currency);
    }

    public static Builder newBuilderWithMicros(long j10, Currency currency) {
        return new Builder(j10, currency);
    }
}
