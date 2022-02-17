select td.stock_code from price_today td join price_tomorrow tm on tm.stock_code=td.stock_code where tm.price>td.price order by tm.stock_code asc;
