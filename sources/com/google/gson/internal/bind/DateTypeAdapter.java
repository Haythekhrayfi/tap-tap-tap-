package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.o;
import com.google.gson.internal.t;
import com.google.gson.q;
import com.google.gson.s;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f12759b = new s() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.s
        public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
            if (aVar.rawType == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DateFormat> f12760a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f12760a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (o.f12865a >= 9) {
            arrayList.add(t.a(2, 2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public Date b(o6.a aVar) throws IOException {
        Date dateB;
        if (aVar.V() == o6.b.NULL) {
            aVar.O();
            return null;
        }
        String strR = aVar.R();
        synchronized (this) {
            try {
                Iterator<DateFormat> it = this.f12760a.iterator();
                try {
                    while (it.hasNext()) {
                        try {
                            dateB = it.next().parse(strR);
                        } catch (ParseException unused) {
                        }
                    }
                    dateB = l6.a.b(strR, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new q(strR, e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dateB;
    }

    @Override // com.google.gson.TypeAdapter
    public void c(o6.c cVar, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            try {
                if (date2 == null) {
                    cVar.k();
                } else {
                    cVar.K(this.f12760a.get(0).format(date2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
