(require '[clj-http.client :as client])

(client/post "https://mgs-gw.m.dana.id/mgw.htm" {:headers {:user-agent "Googlesdk_gphone64_x86_64"
                                                           :clientid "230618103359969|230618103359967"
                                                           :connection "Keep-Alive"
                                                           :sign "62909bb4d054dea5b80e2cf35fed5f28"
                                                           :accept-encoding "gzip"
                                                           :uuid "2c48516a-d8c5-4c8a-bc96-ce0ef06eef2c"
                                                           :version "1.0"
                                                           :appid "6CC59C4231550,6CC59C4231550"
                                                           :tenantid "FKPZXBCN"
                                                           :accept-language "en-US"
                                                           :x-apdid-token ""
                                                           :did "ZI57J/OzUaQDADniPyzY3Etp"
                                                           :ts "1687059241449"
                                                           :workspaceid "prod"
                                                           :content-type "application/x-www-form-urlencoded; charset=UTF-8"
                                                           :host "mgs-gw.m.dana.id"}})