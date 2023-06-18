(require '[clj-http.client :as client])

(client/post "https://mgs-gw.m.dana.id/mgw.htm" {:headers {:user-agent "samsungSM-N935F"
                                                           :cookie "ALIPAYJSESSIONID=GZ00065313F7DBF7461C997AF8BB3454C912danabizpluginGZ00; ctoken=8JOyHKM4m7U11uGG; bm_sz=1A60A3E5A92F07A44A63CBE93052AA25~YAAQdwIKcr03XJSIAQAAW2uRzBTji5Na92m3CrjXxIumQm0yTkKC/IO7vDAkL3XTWfNwYCTCfa/ujWMAjlcCIhW5Xg9iDw4T7cRtdbFzQh94kHvxKiWOjpN9I+sdfX/oHQxHtbRJ1wvCOAeq4L6fm94IzhLvZArKxND5V+ZCBEunU/otSms/Hr1U1zSzkNMGWR9DFy645dS6Nxnp9SANr7m8jD/hAnTLhKdLw0XynKKrBJLPo/i2/JXMo9wadG1v14yFaQpOAm5Mdg7GDmudpoRZ9SZgrU0MojK65JvcaK0=~3682883~3425601; _abck=34B6CF0F6CDE4A19936DE08E07EEC1B8~-1~YAAQdwIKcis4XJSIAQAAvXGRzAoZU52q+YPJbAs/F+7UJCfn7NVydp/6UkkImB3LE8wGYXB4LwyPgIXM0oS4napo+iMvneyRNn+zuWIFrglI326jCrEdlIdbxIPnzndux2h2c4JR0PAnWDs/D++wTuBMwpYPsJpL8jHVNJKwLzd3O0x6mwuo6A/Y0Pas3Ovr87Wlwv4KYwl7AKzpJRk7OtHyeoWbAU36D8C3aQZw07AF8gbHeq2jNNtY2l1jD1Q9AXrQL2HvcwySgiFNFgwE3gDvA4L2cOysJcpxmhVkre2T+qxuZPrsiHETRHAJYQX1yZGrGRZlVBDAF1KxAxk8hi8lQJv+OWJIzlqGjRyydsxpyRGHCH+rvmCSL9LZeCn08UdUmA==~-1~-1~-1"
                                                           :clientid "230618103359969|230618103359967"
                                                           :connection "Keep-Alive"
                                                           :sign "03d9b0ae710fd6eb891e06c05e588994"
                                                           :accept-encoding "gzip"
                                                           :uuid "00ef31f1-0b99-4acd-b539-55ccf2e41b6c"
                                                           :version "1.0"
                                                           :appid "6CC59C4231550,6CC59C4231550"
                                                           :tenantid "FKPZXBCN"
                                                           :accept-language "en-US"
                                                           :x-apdid-token "Xc2+p49QRXaX+UNnAkFArgLMxsYm5elm+hVCx4mIuFDeLpHMiAEAAA=="
                                                           :did "ZI57J/OzUaQDADniPyzY3Etp"
                                                           :ts "1687059286368"
                                                           :workspaceid "prod"
                                                           :content-type "application/x-www-form-urlencoded; charset=UTF-8"
                                                           :host "mgs-gw.m.dana.id"}})