(require '[clj-http.client :as client])

(client/post "https://mgs-gw.m.dana.id/mgw.htm" {:headers {:user-agent "samsungSM-N935F"
                                                           :cookie "ALIPAYJSESSIONID=GZ00065313F7DBF7461C997AF8BB3454C912danabizpluginGZ00; ctoken=8JOyHKM4m7U11uGG; _abck=34B6CF0F6CDE4A19936DE08E07EEC1B8~-1~YAAQdwIKcrw3XJSIAQAAW2uRzAozDGvAP2S8MnQxCUmjYCXVIK9Gghgw5R/Jqwf9dlQ9P0+A0eQpC998biBr4WN+pA/iXFZMkEYWiShaZv3HODf6aRjsMALhIQIOJ0fRseUgp//bCPzLYwcTTyVcv0z2zE/5f/AfP8Cj543ev0Y69dIX1g2F2l+Lv9YvRSa5Bg6Yswu0q8Q1zFPM0MLXSx4zzoAjETltKq3aW2/ceTbb0LE1MsWBYL1K1wtvOfHNZlWJE3unJgc2xmdP08hrJMBCCwFC8JvAcuUDzdGuO7rIT1CgzpdMu2ja7eTih77i/AZo7rKN17vxyLqZrCpcRVgnIZu+5+SC6YelPNVyoc/Z04NepSA=~-1~-1~-1; bm_sz=1A60A3E5A92F07A44A63CBE93052AA25~YAAQdwIKcr03XJSIAQAAW2uRzBTji5Na92m3CrjXxIumQm0yTkKC/IO7vDAkL3XTWfNwYCTCfa/ujWMAjlcCIhW5Xg9iDw4T7cRtdbFzQh94kHvxKiWOjpN9I+sdfX/oHQxHtbRJ1wvCOAeq4L6fm94IzhLvZArKxND5V+ZCBEunU/otSms/Hr1U1zSzkNMGWR9DFy645dS6Nxnp9SANr7m8jD/hAnTLhKdLw0XynKKrBJLPo/i2/JXMo9wadG1v14yFaQpOAm5Mdg7GDmudpoRZ9SZgrU0MojK65JvcaK0=~3682883~3425601"
                                                           :clientid "230618103359969|230618103359967"
                                                           :connection "Keep-Alive"
                                                           :sign "2f106be81396492804c1c82f6fb6c5b0"
                                                           :accept-encoding "gzip"
                                                           :uuid "6b38a471-0aeb-4449-8deb-743669117c97"
                                                           :version "1.0"
                                                           :appid "6CC59C4231550,6CC59C4231550"
                                                           :tenantid "FKPZXBCN"
                                                           :accept-language "en-US"
                                                           :x-apdid-token "Xc2+p49QRXaX+UNnAkFArgLMxsYm5elm+hVCx4mIuFDeLpHMiAEAAA=="
                                                           :did "ZI57J/OzUaQDADniPyzY3Etp"
                                                           :ts "1687059263078"
                                                           :workspaceid "prod"
                                                           :content-type "application/x-www-form-urlencoded; charset=UTF-8"
                                                           :host "mgs-gw.m.dana.id"}})