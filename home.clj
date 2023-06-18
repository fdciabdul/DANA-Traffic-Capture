(require '[clj-http.client :as client])

(client/post "https://mgs-gw.m.dana.id/mgw.htm" {:headers {:user-agent "samsungSM-N935F"
                                                           :cookie "ALIPAYJSESSIONID=GZ0017DF6252257F461C9FE7640B105A007FdanabizpluginGZ00; ctoken=TpUcidpRXj31KXqP; bm_sz=459518D33C77BB6F2DA290A08A6BDD00~YAAQdwIKcrg5XJSIAQAAMy+SzBTsVWMCOSGLJYuAD8EOH7ld3oA3qoiHFToWNlmqUTWB38AlsDEaIWwInt9xW7Zo2gV2y0HW4hWkQIdQOMaoujIPKDs2dtU7D7ylJCNtuKsX7xekus274e4T3efWz7V4531Timw5R+dKaFn6yOszCqQLOispqnR40sbnDZE4/pyl2NMqjeJmZoiG/uysGYG6UI2lL0TYo2M3l2PloInQ5fpNAmfgQrB8yFXa9u3YUBk9soblygg8NSi9WCutZnHJXiO/+3whmPNyzyVFR4A=~4474178~3753522; userId=216610000293926685862; session.cookieNameId=ALIPAYJSESSIONID; AKA_A2=A; _abck=2AC3ABE1565B752EE030C9DDA6619D4C~0~YAAQzwIKcu21zrWIAQAA4iqTzApBy+WjwEeYLK0vMf+I9UGCJ71yR+6Hb/8kcMHkO2zBReS20lIOc4cTntE6BhDiusIISOj+sJlu2DTbeDptqhrjVSZM8++RO3uTz8qrVwYJ14b3kb76kg5b1d57imifSHwI3iDLa2KJZSTNiGu8N8K7+30GKunA43HFkl9/9SjNPL8+dwc/iM2SKMy4Ktr27X/Dfcl8UImQlMUWqg0fzVDkVV7zrzlrV3ygbL5fcPXIjs8uCiq4EZ84j/B6SdAUhdQxz5KQDwkmLz3Smk580XiX30EeT8tqNSHIA5LdjUMpNZulrcq1zvBlu3IJE/YO8rvvu37KhMqfiJpH1np39YspMndKsLxfXPJrFe3QQD/uNPzOO2thZ2NsH8xzvKcr~-1~||-1||~-1; ak_bmsc=355739A55948F45F9519BD7EDD644DBD~000000000000000000000000000000~YAAQzQIKcmqPQMWIAQAA3zqTzBRywjcT71FD3Uz8JDMtdsNE11BkhLwjrn86DuZJwy9iQ/SVEBhoJ6TvF/l/gaO8um+v0Nc0bhhmR+FibPyc8NhSXQP2CBAOWNL0VmAvrv8wWMrcqwEWOakFijX+3s9t+7n8zgLhbBopSjQb8nT5BGWSrKR3CPZgaR2e5xplxKda23NcC/O0qjhDZJz5nOpAQetS+0r7r9/vcenq08ZkX70CxlfDAsHxJj44b42AsCE8BTHS0w8C3aRk1cELicRZ53mhdinp5MNXv7N0musjwyksWwo6J46do6itoij3K3H2gUvw2W4PdRLlpIZZUN2UrkOVOG6dGwOYPOZ95Ccid3xGc7CgJUyHiYq0iLn8AoXKKDsRp9KS0w==; oneDayId=4290130577; RT=z=1&dm=m.dana.id&si=c92b7e04-6b19-48e8-9236-a820d1743315&ss=lj0vl75d&sl=1&tt=5sp&rl=1&ld=762&ul=3z5q&hd=3z5y; mp_ded2d68965bbd813d33d686ee165bae7_mixpanel=%7B%22distinct_id%22%3A%20%22216610000293926685862%22%2C%22%24device_id%22%3A%20%22188cc931fe8389-065ca46a93efe-22310c1a-4fa2e-188cc931fe9115%22%2C%22%24initial_referrer%22%3A%20%22%24direct%22%2C%22%24initial_referring_domain%22%3A%20%22%24direct%22%2C%22%24user_id%22%3A%20%22216610000293926685862%22%2C%22App%20Name%22%3A%20%22DANA%22%7D"
                                                           :clientid "230618103359969|230618103359967"
                                                           :connection "Keep-Alive"
                                                           :sign "437649e47d708b765b93b341e8ac9f28"
                                                           :accept-encoding "gzip"
                                                           :uuid "4af286d8-cba5-4740-9458-dbc1200ac7fd"
                                                           :version "1.0"
                                                           :appid "6CC59C4231550,6CC59C4231550"
                                                           :tenantid "FKPZXBCN"
                                                           :accept-language "en-US"
                                                           :x-apdid-token "Xc2+p49QRXaX+UNnAkFArgLMxsYm5elm+hVCx4mIuFDeLpHMiAEAAA=="
                                                           :did "ZI57J/OzUaQDADniPyzY3Etp"
                                                           :ts "1687060373898"
                                                           :workspaceid "prod"
                                                           :content-type "application/x-www-form-urlencoded; charset=UTF-8"
                                                           :host "mgs-gw.m.dana.id"}})