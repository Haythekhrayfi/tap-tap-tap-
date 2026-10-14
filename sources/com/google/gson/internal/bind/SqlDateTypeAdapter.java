package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.q;
import com.google.gson.s;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f12781b = new s() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.google.gson.s
        public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
            if (aVar.rawType == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateFormat f12782a = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.TypeAdapter
    public Date b(o6.a aVar) throws IOException {
        Date date;
        synchronized (this) {
            if (aVar.V() == o6.b.NULL) {
                aVar.O();
                date = null;
            } else {
                try {
                    date = new Date(this.f12782a.parse(aVar.R()).getTime());
                } catch (ParseException e10) {
                    throw new q(e10);
                }
            }
        }
        return date;
    }

    @Override // com.google.gson.TypeAdapter
    public void c(o6.c cVar, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            cVar.K(date2 == null ? null : this.f12782a.format((java.util.Date) date2));
        }
    }
}
