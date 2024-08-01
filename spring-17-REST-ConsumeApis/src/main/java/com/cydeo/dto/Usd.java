
package com.cydeo.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "$myro",
    "$wen",
    "00",
    "0x0",
    "1000sats",
    "10set",
    "1inch",
    "aave",
    "abt",
    "ach",
    "acs",
    "ada",
    "aed",
    "aergo",
    "aero",
    "aevo",
    "afn",
    "agi",
    "agix",
    "agld",
    "ai",
    "aioz",
    "akt",
    "alcx",
    "aleph",
    "alex",
    "algo",
    "alice",
    "all",
    "alph",
    "alt",
    "alusd",
    "amd",
    "amp",
    "ampl",
    "andy",
    "ang",
    "ankr",
    "ant",
    "aoa",
    "ape",
    "apex",
    "api3",
    "apl",
    "apt",
    "apu",
    "ar",
    "arb",
    "ark",
    "arkm",
    "arpa",
    "ars",
    "asm",
    "ast",
    "astr",
    "ata",
    "ath",
    "atom",
    "ats",
    "auction",
    "aud",
    "audio",
    "aurora",
    "avail",
    "avax",
    "avt",
    "awg",
    "axl",
    "axs",
    "azero",
    "azm",
    "azn",
    "babydoge",
    "badger",
    "bake",
    "bal",
    "bam",
    "band",
    "bat",
    "bb",
    "bbd",
    "bch",
    "bdt",
    "bdx",
    "beam",
    "beer",
    "bef",
    "bgb",
    "bgn",
    "bhd",
    "bico",
    "bif",
    "bigtime",
    "billy",
    "bit",
    "blast",
    "bld",
    "blur",
    "blz",
    "bmd",
    "bnb",
    "bnd",
    "bnt",
    "bob",
    "boba",
    "boden",
    "bome",
    "bond",
    "bone",
    "bonk",
    "bora",
    "borg",
    "bpx",
    "brett",
    "brl",
    "bsd",
    "bsv",
    "bsw",
    "btc",
    "btc.b",
    "btcb",
    "btg",
    "btn",
    "btrfly",
    "btrst",
    "btt",
    "busd",
    "bwp",
    "byn",
    "byr",
    "bzd",
    "c98",
    "cad",
    "caf",
    "cake",
    "canto",
    "cbeth",
    "cdai",
    "cdf",
    "cdt",
    "cel",
    "celo",
    "celr",
    "ceth",
    "cfg",
    "cfx",
    "cgld",
    "cheel",
    "chex",
    "chf",
    "chr",
    "chz",
    "ckb",
    "clp",
    "clv",
    "cnh",
    "cny",
    "comai",
    "comp",
    "cop",
    "coq",
    "core",
    "corechain",
    "corgiai",
    "coti",
    "coval",
    "cqt",
    "crc",
    "cro",
    "crpt",
    "crv",
    "cspr",
    "ctc",
    "ctsi",
    "ctx",
    "cuc",
    "cup",
    "cvc",
    "cve",
    "cvx",
    "cwbtc",
    "cyp",
    "czk",
    "dag",
    "dai",
    "dao",
    "dar",
    "dash",
    "dcr",
    "ddx",
    "degen",
    "dem",
    "deso",
    "dexe",
    "dext",
    "dfi",
    "dgb",
    "dia",
    "dimo",
    "djf",
    "dkk",
    "dnt",
    "dog",
    "doge",
    "dop",
    "dora",
    "dot",
    "drep",
    "dydx",
    "dym",
    "dyp",
    "dzd",
    "ecoin",
    "edu",
    "edum",
    "eek",
    "eeth",
    "egld",
    "egp",
    "ela",
    "elf",
    "elg",
    "eml",
    "ena",
    "enj",
    "ens",
    "eos",
    "ern",
    "esp",
    "etb",
    "etc",
    "eth",
    "eth2",
    "ethdydx",
    "ethfi",
    "ethw",
    "ethx",
    "eur",
    "eurc",
    "euroc",
    "ever",
    "ezeth",
    "farm",
    "fdusd",
    "fei",
    "fet",
    "fida",
    "fil",
    "fim",
    "fis",
    "fjd",
    "fkp",
    "floki",
    "flow",
    "flr",
    "flux",
    "fnsa",
    "fort",
    "forth",
    "fox",
    "frax",
    "frf",
    "friend",
    "frxeth",
    "ftm",
    "ftn",
    "ftt",
    "fx",
    "fxs",
    "g",
    "gaj",
    "gal",
    "gala",
    "gas",
    "gbp",
    "gel",
    "gf",
    "gfi",
    "ggp",
    "ghc",
    "ghs",
    "ghst",
    "gip",
    "glm",
    "glmr",
    "gmd",
    "gmt",
    "gmx",
    "gnf",
    "gno",
    "gns",
    "gnt",
    "gods",
    "grd",
    "grin",
    "grt",
    "gst",
    "gt",
    "gtc",
    "gtq",
    "gusd",
    "gxc",
    "gyd",
    "gyen",
    "h2o",
    "hbar",
    "hbtc",
    "hft",
    "high",
    "hkd",
    "hnl",
    "hnt",
    "honey",
    "hopr",
    "hot",
    "hrk",
    "ht",
    "htg",
    "huf",
    "icp",
    "icx",
    "id",
    "idex",
    "idr",
    "iep",
    "ils",
    "ilv",
    "imp",
    "imx",
    "index",
    "inj",
    "inr",
    "inv",
    "io",
    "iost",
    "iota",
    "iotx",
    "iq",
    "iqd",
    "irr",
    "isk",
    "itl",
    "jasmy",
    "jep",
    "jmd",
    "jod",
    "joe",
    "jpy",
    "jst",
    "jto",
    "jup",
    "karrat",
    "kas",
    "kava",
    "kcs",
    "kda",
    "keep",
    "kes",
    "kgs",
    "khr",
    "klay",
    "kmf",
    "kmno",
    "knc",
    "kpw",
    "krl",
    "krw",
    "ksm",
    "kub",
    "kuji",
    "kwd",
    "kyd",
    "kzt",
    "ladys",
    "lak",
    "lbp",
    "lcx",
    "ldo",
    "leo",
    "lft",
    "link",
    "lit",
    "lkr",
    "loka",
    "loom",
    "lpt",
    "lqty",
    "lrc",
    "lrd",
    "lrds",
    "lsd",
    "lseth",
    "lsk",
    "lsl",
    "ltc",
    "ltl",
    "luf",
    "luna",
    "lunc",
    "lusd",
    "lvl",
    "lyd",
    "lyx",
    "lyxe",
    "mad",
    "maga",
    "magic",
    "mana",
    "manta",
    "mask",
    "math",
    "matic",
    "mav",
    "mavia",
    "mbx",
    "mco2",
    "mcoin",
    "mdl",
    "mdt",
    "media",
    "meme",
    "memes",
    "meth",
    "metis",
    "mew",
    "mga",
    "mgf",
    "mina",
    "mir",
    "mkd",
    "mkr",
    "mkusd",
    "mln",
    "mmk",
    "mmx",
    "mnde",
    "mnt",
    "mobile",
    "mog",
    "mona",
    "mop",
    "movr",
    "mpl",
    "mplx",
    "mro",
    "mrs",
    "mru",
    "msol",
    "mtl",
    "mubi",
    "multi",
    "mumu",
    "mur",
    "muse",
    "mvr",
    "mwc",
    "mwk",
    "mx",
    "mxc",
    "mxn",
    "mxv",
    "myr",
    "myth",
    "mzm",
    "mzn",
    "nad",
    "nct",
    "near",
    "neo",
    "neon",
    "nest",
    "nexo",
    "nft",
    "ngn",
    "nio",
    "nkn",
    "nlg",
    "nmr",
    "nmt",
    "nok",
    "nos",
    "not",
    "npc",
    "npr",
    "npxs",
    "ntrn",
    "nu",
    "nxm",
    "nzd",
    "oas",
    "ocean",
    "ogn",
    "ohm",
    "okb",
    "okt",
    "olas",
    "om",
    "omg",
    "omi",
    "omikami",
    "omni",
    "omr",
    "ondo",
    "one",
    "ong",
    "ont",
    "ooki",
    "op",
    "orai",
    "orca",
    "ordi",
    "orn",
    "osak",
    "osmo",
    "ox_old",
    "oxt",
    "paal",
    "pab",
    "pandora",
    "pax",
    "paxg",
    "pci",
    "pen",
    "pendle",
    "people",
    "pepe",
    "pepecoin",
    "perp",
    "pgk",
    "php",
    "pixel",
    "pkr",
    "pla",
    "pln",
    "plu",
    "png",
    "pokt",
    "pols",
    "poly",
    "polyx",
    "pond",
    "ponke",
    "popcat",
    "pork",
    "portal",
    "powr",
    "prime",
    "pro",
    "prom",
    "prq",
    "pte",
    "pundix",
    "pups",
    "pyg",
    "pyr",
    "pyth",
    "pyusd",
    "qar",
    "qi",
    "qnt",
    "qtum",
    "qubic",
    "quick",
    "rad",
    "rai",
    "rare",
    "rari",
    "ray",
    "rbn",
    "rei",
    "ren",
    "render",
    "rep",
    "repv2",
    "req",
    "reth",
    "rgt",
    "rif",
    "rlb",
    "rlc",
    "rly",
    "rndr",
    "rol",
    "ron",
    "ronin",
    "rose",
    "rpl",
    "rsd",
    "rseth",
    "rsr",
    "rss3",
    "rub",
    "rune",
    "rvn",
    "rwf",
    "safe",
    "saga",
    "sand",
    "sar",
    "sats",
    "savax",
    "sbd",
    "sc",
    "scr",
    "sd",
    "sdd",
    "sdg",
    "seam",
    "sei",
    "sek",
    "sfp",
    "sfrxeth",
    "sfund",
    "sgb",
    "sgd",
    "shdw",
    "shib",
    "shp",
    "shping",
    "sit",
    "skk",
    "skl",
    "sle",
    "slerf",
    "sll",
    "slp",
    "snt",
    "snx",
    "sol",
    "sos",
    "spa",
    "spell",
    "spl",
    "srd",
    "srg",
    "ssv",
    "std",
    "steth",
    "stg",
    "stn",
    "storj",
    "strax",
    "strd",
    "strk",
    "stsol",
    "stx",
    "sui",
    "suku",
    "super",
    "sushi",
    "svc",
    "sweth",
    "swftc",
    "sxp",
    "sylo",
    "syn",
    "sync",
    "syp",
    "szl",
    "t",
    "tao",
    "tbtc",
    "tel",
    "tet",
    "tfuel",
    "thb",
    "theta",
    "tia",
    "time",
    "tjs",
    "tkx",
    "tmm",
    "tmt",
    "tnd",
    "tnsr",
    "ton",
    "tone",
    "top",
    "topia",
    "tor",
    "toshi",
    "trac",
    "trb",
    "tribe",
    "trl",
    "tru",
    "trump",
    "trx",
    "try",
    "ttd",
    "turbo",
    "tusd",
    "tvd",
    "tvk",
    "twd",
    "twt",
    "tzs",
    "uah",
    "ugx",
    "ultima",
    "uma",
    "unfi",
    "uni",
    "uos",
    "upi",
    "uqc",
    "usd",
    "usdb",
    "usdc",
    "usdc.e",
    "usdd",
    "usde",
    "usdp",
    "usdt",
    "usdy",
    "ust",
    "ustc",
    "uyu",
    "uzs",
    "val",
    "vanry",
    "vara",
    "veb",
    "ved",
    "vef",
    "velo",
    "venom",
    "ves",
    "vet",
    "vgx",
    "vnd",
    "vnst",
    "voxel",
    "vr",
    "vtho",
    "vuv",
    "w",
    "wampl",
    "waves",
    "waxl",
    "waxp",
    "wbeth",
    "wbt",
    "wbtc",
    "wcfg",
    "weeth",
    "wemix",
    "wif",
    "wild",
    "wld",
    "wluna",
    "woo",
    "wst",
    "wzrd",
    "xaf",
    "xag",
    "xai",
    "xau",
    "xaut",
    "xbt",
    "xcd",
    "xch",
    "xcn",
    "xdc",
    "xdr",
    "xec",
    "xem",
    "xlm",
    "xmon",
    "xmr",
    "xof",
    "xpd",
    "xpf",
    "xpt",
    "xrd",
    "xrp",
    "xt",
    "xtz",
    "xvs",
    "xyo",
    "yer",
    "yfi",
    "yfii",
    "ygg",
    "zar",
    "zbc",
    "zec",
    "zen",
    "zeta",
    "zil",
    "zk",
    "zmk",
    "zmw",
    "zro",
    "zrx",
    "zwd",
    "zwg",
    "zwl",
    "zypto"
})
@Generated("jsonschema2pojo")
public class Usd {

    @JsonProperty("$myro")
    private Double $myro;
    @JsonProperty("$wen")
    private Double $wen;
    @JsonProperty("00")
    private Double _00;
    @JsonProperty("0x0")
    private Double _0x0;
    @JsonProperty("1000sats")
    private Double _1000sats;
    @JsonProperty("10set")
    private Double _10set;
    @JsonProperty("1inch")
    private Double _1inch;
    @JsonProperty("aave")
    private Double aave;
    @JsonProperty("abt")
    private Double abt;
    @JsonProperty("ach")
    private Double ach;
    @JsonProperty("acs")
    private Double acs;
    @JsonProperty("ada")
    private Double ada;
    @JsonProperty("aed")
    private Double aed;
    @JsonProperty("aergo")
    private Double aergo;
    @JsonProperty("aero")
    private Double aero;
    @JsonProperty("aevo")
    private Double aevo;
    @JsonProperty("afn")
    private Double afn;
    @JsonProperty("agi")
    private Double agi;
    @JsonProperty("agix")
    private Double agix;
    @JsonProperty("agld")
    private Double agld;
    @JsonProperty("ai")
    private Double ai;
    @JsonProperty("aioz")
    private Double aioz;
    @JsonProperty("akt")
    private Double akt;
    @JsonProperty("alcx")
    private Double alcx;
    @JsonProperty("aleph")
    private Double aleph;
    @JsonProperty("alex")
    private Double alex;
    @JsonProperty("algo")
    private Double algo;
    @JsonProperty("alice")
    private Double alice;
    @JsonProperty("all")
    private Double all;
    @JsonProperty("alph")
    private Double alph;
    @JsonProperty("alt")
    private Double alt;
    @JsonProperty("alusd")
    private Double alusd;
    @JsonProperty("amd")
    private Double amd;
    @JsonProperty("amp")
    private Double amp;
    @JsonProperty("ampl")
    private Double ampl;
    @JsonProperty("andy")
    private Double andy;
    @JsonProperty("ang")
    private Double ang;
    @JsonProperty("ankr")
    private Double ankr;
    @JsonProperty("ant")
    private Double ant;
    @JsonProperty("aoa")
    private Double aoa;
    @JsonProperty("ape")
    private Double ape;
    @JsonProperty("apex")
    private Double apex;
    @JsonProperty("api3")
    private Double api3;
    @JsonProperty("apl")
    private Double apl;
    @JsonProperty("apt")
    private Double apt;
    @JsonProperty("apu")
    private Double apu;
    @JsonProperty("ar")
    private Double ar;
    @JsonProperty("arb")
    private Double arb;
    @JsonProperty("ark")
    private Double ark;
    @JsonProperty("arkm")
    private Double arkm;
    @JsonProperty("arpa")
    private Double arpa;
    @JsonProperty("ars")
    private Double ars;
    @JsonProperty("asm")
    private Double asm;
    @JsonProperty("ast")
    private Double ast;
    @JsonProperty("astr")
    private Double astr;
    @JsonProperty("ata")
    private Double ata;
    @JsonProperty("ath")
    private Double ath;
    @JsonProperty("atom")
    private Double atom;
    @JsonProperty("ats")
    private Double ats;
    @JsonProperty("auction")
    private Double auction;
    @JsonProperty("aud")
    private Double aud;
    @JsonProperty("audio")
    private Double audio;
    @JsonProperty("aurora")
    private Double aurora;
    @JsonProperty("avail")
    private Double avail;
    @JsonProperty("avax")
    private Double avax;
    @JsonProperty("avt")
    private Double avt;
    @JsonProperty("awg")
    private Double awg;
    @JsonProperty("axl")
    private Double axl;
    @JsonProperty("axs")
    private Double axs;
    @JsonProperty("azero")
    private Double azero;
    @JsonProperty("azm")
    private Double azm;
    @JsonProperty("azn")
    private Double azn;
    @JsonProperty("babydoge")
    private Double babydoge;
    @JsonProperty("badger")
    private Double badger;
    @JsonProperty("bake")
    private Double bake;
    @JsonProperty("bal")
    private Double bal;
    @JsonProperty("bam")
    private Double bam;
    @JsonProperty("band")
    private Double band;
    @JsonProperty("bat")
    private Double bat;
    @JsonProperty("bb")
    private Double bb;
    @JsonProperty("bbd")
    private Integer bbd;
    @JsonProperty("bch")
    private Double bch;
    @JsonProperty("bdt")
    private Double bdt;
    @JsonProperty("bdx")
    private Double bdx;
    @JsonProperty("beam")
    private Double beam;
    @JsonProperty("beer")
    private Double beer;
    @JsonProperty("bef")
    private Double bef;
    @JsonProperty("bgb")
    private Double bgb;
    @JsonProperty("bgn")
    private Double bgn;
    @JsonProperty("bhd")
    private Double bhd;
    @JsonProperty("bico")
    private Double bico;
    @JsonProperty("bif")
    private Double bif;
    @JsonProperty("bigtime")
    private Double bigtime;
    @JsonProperty("billy")
    private Double billy;
    @JsonProperty("bit")
    private Double bit;
    @JsonProperty("blast")
    private Double blast;
    @JsonProperty("bld")
    private Double bld;
    @JsonProperty("blur")
    private Double blur;
    @JsonProperty("blz")
    private Double blz;
    @JsonProperty("bmd")
    private Integer bmd;
    @JsonProperty("bnb")
    private Double bnb;
    @JsonProperty("bnd")
    private Double bnd;
    @JsonProperty("bnt")
    private Double bnt;
    @JsonProperty("bob")
    private Double bob;
    @JsonProperty("boba")
    private Double boba;
    @JsonProperty("boden")
    private Double boden;
    @JsonProperty("bome")
    private Double bome;
    @JsonProperty("bond")
    private Double bond;
    @JsonProperty("bone")
    private Double bone;
    @JsonProperty("bonk")
    private Double bonk;
    @JsonProperty("bora")
    private Double bora;
    @JsonProperty("borg")
    private Double borg;
    @JsonProperty("bpx")
    private Double bpx;
    @JsonProperty("brett")
    private Double brett;
    @JsonProperty("brl")
    private Double brl;
    @JsonProperty("bsd")
    private Integer bsd;
    @JsonProperty("bsv")
    private Double bsv;
    @JsonProperty("bsw")
    private Double bsw;
    @JsonProperty("btc")
    private Double btc;
    @JsonProperty("btc.b")
    private Double btcB;
    @JsonProperty("btcb")
    private Double btcb;
    @JsonProperty("btg")
    private Double btg;
    @JsonProperty("btn")
    private Double btn;
    @JsonProperty("btrfly")
    private Double btrfly;
    @JsonProperty("btrst")
    private Double btrst;
    @JsonProperty("btt")
    private Double btt;
    @JsonProperty("busd")
    private Double busd;
    @JsonProperty("bwp")
    private Double bwp;
    @JsonProperty("byn")
    private Double byn;
    @JsonProperty("byr")
    private Double byr;
    @JsonProperty("bzd")
    private Double bzd;
    @JsonProperty("c98")
    private Double c98;
    @JsonProperty("cad")
    private Double cad;
    @JsonProperty("caf")
    private Double caf;
    @JsonProperty("cake")
    private Double cake;
    @JsonProperty("canto")
    private Double canto;
    @JsonProperty("cbeth")
    private Double cbeth;
    @JsonProperty("cdai")
    private Double cdai;
    @JsonProperty("cdf")
    private Double cdf;
    @JsonProperty("cdt")
    private Double cdt;
    @JsonProperty("cel")
    private Double cel;
    @JsonProperty("celo")
    private Double celo;
    @JsonProperty("celr")
    private Double celr;
    @JsonProperty("ceth")
    private Double ceth;
    @JsonProperty("cfg")
    private Double cfg;
    @JsonProperty("cfx")
    private Double cfx;
    @JsonProperty("cgld")
    private Double cgld;
    @JsonProperty("cheel")
    private Double cheel;
    @JsonProperty("chex")
    private Double chex;
    @JsonProperty("chf")
    private Double chf;
    @JsonProperty("chr")
    private Double chr;
    @JsonProperty("chz")
    private Double chz;
    @JsonProperty("ckb")
    private Double ckb;
    @JsonProperty("clp")
    private Double clp;
    @JsonProperty("clv")
    private Double clv;
    @JsonProperty("cnh")
    private Double cnh;
    @JsonProperty("cny")
    private Double cny;
    @JsonProperty("comai")
    private Double comai;
    @JsonProperty("comp")
    private Double comp;
    @JsonProperty("cop")
    private Double cop;
    @JsonProperty("coq")
    private Double coq;
    @JsonProperty("core")
    private Double core;
    @JsonProperty("corechain")
    private Double corechain;
    @JsonProperty("corgiai")
    private Double corgiai;
    @JsonProperty("coti")
    private Double coti;
    @JsonProperty("coval")
    private Double coval;
    @JsonProperty("cqt")
    private Double cqt;
    @JsonProperty("crc")
    private Double crc;
    @JsonProperty("cro")
    private Double cro;
    @JsonProperty("crpt")
    private Double crpt;
    @JsonProperty("crv")
    private Double crv;
    @JsonProperty("cspr")
    private Double cspr;
    @JsonProperty("ctc")
    private Double ctc;
    @JsonProperty("ctsi")
    private Double ctsi;
    @JsonProperty("ctx")
    private Double ctx;
    @JsonProperty("cuc")
    private Integer cuc;
    @JsonProperty("cup")
    private Double cup;
    @JsonProperty("cvc")
    private Double cvc;
    @JsonProperty("cve")
    private Double cve;
    @JsonProperty("cvx")
    private Double cvx;
    @JsonProperty("cwbtc")
    private Double cwbtc;
    @JsonProperty("cyp")
    private Double cyp;
    @JsonProperty("czk")
    private Double czk;
    @JsonProperty("dag")
    private Double dag;
    @JsonProperty("dai")
    private Double dai;
    @JsonProperty("dao")
    private Double dao;
    @JsonProperty("dar")
    private Double dar;
    @JsonProperty("dash")
    private Double dash;
    @JsonProperty("dcr")
    private Double dcr;
    @JsonProperty("ddx")
    private Double ddx;
    @JsonProperty("degen")
    private Double degen;
    @JsonProperty("dem")
    private Double dem;
    @JsonProperty("deso")
    private Double deso;
    @JsonProperty("dexe")
    private Double dexe;
    @JsonProperty("dext")
    private Double dext;
    @JsonProperty("dfi")
    private Double dfi;
    @JsonProperty("dgb")
    private Double dgb;
    @JsonProperty("dia")
    private Double dia;
    @JsonProperty("dimo")
    private Double dimo;
    @JsonProperty("djf")
    private Double djf;
    @JsonProperty("dkk")
    private Double dkk;
    @JsonProperty("dnt")
    private Double dnt;
    @JsonProperty("dog")
    private Double dog;
    @JsonProperty("doge")
    private Double doge;
    @JsonProperty("dop")
    private Double dop;
    @JsonProperty("dora")
    private Double dora;
    @JsonProperty("dot")
    private Double dot;
    @JsonProperty("drep")
    private Double drep;
    @JsonProperty("dydx")
    private Double dydx;
    @JsonProperty("dym")
    private Double dym;
    @JsonProperty("dyp")
    private Double dyp;
    @JsonProperty("dzd")
    private Double dzd;
    @JsonProperty("ecoin")
    private Double ecoin;
    @JsonProperty("edu")
    private Double edu;
    @JsonProperty("edum")
    private Double edum;
    @JsonProperty("eek")
    private Double eek;
    @JsonProperty("eeth")
    private Double eeth;
    @JsonProperty("egld")
    private Double egld;
    @JsonProperty("egp")
    private Double egp;
    @JsonProperty("ela")
    private Double ela;
    @JsonProperty("elf")
    private Double elf;
    @JsonProperty("elg")
    private Double elg;
    @JsonProperty("eml")
    private Double eml;
    @JsonProperty("ena")
    private Double ena;
    @JsonProperty("enj")
    private Double enj;
    @JsonProperty("ens")
    private Double ens;
    @JsonProperty("eos")
    private Double eos;
    @JsonProperty("ern")
    private Integer ern;
    @JsonProperty("esp")
    private Double esp;
    @JsonProperty("etb")
    private Double etb;
    @JsonProperty("etc")
    private Double etc;
    @JsonProperty("eth")
    private Double eth;
    @JsonProperty("eth2")
    private Double eth2;
    @JsonProperty("ethdydx")
    private Double ethdydx;
    @JsonProperty("ethfi")
    private Double ethfi;
    @JsonProperty("ethw")
    private Double ethw;
    @JsonProperty("ethx")
    private Double ethx;
    @JsonProperty("eur")
    private Double eur;
    @JsonProperty("eurc")
    private Double eurc;
    @JsonProperty("euroc")
    private Double euroc;
    @JsonProperty("ever")
    private Double ever;
    @JsonProperty("ezeth")
    private Double ezeth;
    @JsonProperty("farm")
    private Double farm;
    @JsonProperty("fdusd")
    private Double fdusd;
    @JsonProperty("fei")
    private Double fei;
    @JsonProperty("fet")
    private Double fet;
    @JsonProperty("fida")
    private Double fida;
    @JsonProperty("fil")
    private Double fil;
    @JsonProperty("fim")
    private Double fim;
    @JsonProperty("fis")
    private Double fis;
    @JsonProperty("fjd")
    private Double fjd;
    @JsonProperty("fkp")
    private Double fkp;
    @JsonProperty("floki")
    private Double floki;
    @JsonProperty("flow")
    private Double flow;
    @JsonProperty("flr")
    private Double flr;
    @JsonProperty("flux")
    private Double flux;
    @JsonProperty("fnsa")
    private Double fnsa;
    @JsonProperty("fort")
    private Double fort;
    @JsonProperty("forth")
    private Double forth;
    @JsonProperty("fox")
    private Double fox;
    @JsonProperty("frax")
    private Double frax;
    @JsonProperty("frf")
    private Double frf;
    @JsonProperty("friend")
    private Double friend;
    @JsonProperty("frxeth")
    private Double frxeth;
    @JsonProperty("ftm")
    private Double ftm;
    @JsonProperty("ftn")
    private Double ftn;
    @JsonProperty("ftt")
    private Double ftt;
    @JsonProperty("fx")
    private Double fx;
    @JsonProperty("fxs")
    private Double fxs;
    @JsonProperty("g")
    private Double g;
    @JsonProperty("gaj")
    private Double gaj;
    @JsonProperty("gal")
    private Double gal;
    @JsonProperty("gala")
    private Double gala;
    @JsonProperty("gas")
    private Double gas;
    @JsonProperty("gbp")
    private Double gbp;
    @JsonProperty("gel")
    private Double gel;
    @JsonProperty("gf")
    private Double gf;
    @JsonProperty("gfi")
    private Double gfi;
    @JsonProperty("ggp")
    private Double ggp;
    @JsonProperty("ghc")
    private Double ghc;
    @JsonProperty("ghs")
    private Double ghs;
    @JsonProperty("ghst")
    private Double ghst;
    @JsonProperty("gip")
    private Double gip;
    @JsonProperty("glm")
    private Double glm;
    @JsonProperty("glmr")
    private Double glmr;
    @JsonProperty("gmd")
    private Double gmd;
    @JsonProperty("gmt")
    private Double gmt;
    @JsonProperty("gmx")
    private Double gmx;
    @JsonProperty("gnf")
    private Double gnf;
    @JsonProperty("gno")
    private Double gno;
    @JsonProperty("gns")
    private Double gns;
    @JsonProperty("gnt")
    private Double gnt;
    @JsonProperty("gods")
    private Double gods;
    @JsonProperty("grd")
    private Double grd;
    @JsonProperty("grin")
    private Double grin;
    @JsonProperty("grt")
    private Double grt;
    @JsonProperty("gst")
    private Double gst;
    @JsonProperty("gt")
    private Double gt;
    @JsonProperty("gtc")
    private Double gtc;
    @JsonProperty("gtq")
    private Double gtq;
    @JsonProperty("gusd")
    private Double gusd;
    @JsonProperty("gxc")
    private Double gxc;
    @JsonProperty("gyd")
    private Double gyd;
    @JsonProperty("gyen")
    private Double gyen;
    @JsonProperty("h2o")
    private Double h2o;
    @JsonProperty("hbar")
    private Double hbar;
    @JsonProperty("hbtc")
    private Double hbtc;
    @JsonProperty("hft")
    private Double hft;
    @JsonProperty("high")
    private Double high;
    @JsonProperty("hkd")
    private Double hkd;
    @JsonProperty("hnl")
    private Double hnl;
    @JsonProperty("hnt")
    private Double hnt;
    @JsonProperty("honey")
    private Double honey;
    @JsonProperty("hopr")
    private Double hopr;
    @JsonProperty("hot")
    private Double hot;
    @JsonProperty("hrk")
    private Double hrk;
    @JsonProperty("ht")
    private Double ht;
    @JsonProperty("htg")
    private Double htg;
    @JsonProperty("huf")
    private Double huf;
    @JsonProperty("icp")
    private Double icp;
    @JsonProperty("icx")
    private Double icx;
    @JsonProperty("id")
    private Double id;
    @JsonProperty("idex")
    private Double idex;
    @JsonProperty("idr")
    private Double idr;
    @JsonProperty("iep")
    private Double iep;
    @JsonProperty("ils")
    private Double ils;
    @JsonProperty("ilv")
    private Double ilv;
    @JsonProperty("imp")
    private Double imp;
    @JsonProperty("imx")
    private Double imx;
    @JsonProperty("index")
    private Double index;
    @JsonProperty("inj")
    private Double inj;
    @JsonProperty("inr")
    private Double inr;
    @JsonProperty("inv")
    private Double inv;
    @JsonProperty("io")
    private Double io;
    @JsonProperty("iost")
    private Double iost;
    @JsonProperty("iota")
    private Double iota;
    @JsonProperty("iotx")
    private Double iotx;
    @JsonProperty("iq")
    private Double iq;
    @JsonProperty("iqd")
    private Double iqd;
    @JsonProperty("irr")
    private Double irr;
    @JsonProperty("isk")
    private Double isk;
    @JsonProperty("itl")
    private Double itl;
    @JsonProperty("jasmy")
    private Double jasmy;
    @JsonProperty("jep")
    private Double jep;
    @JsonProperty("jmd")
    private Double jmd;
    @JsonProperty("jod")
    private Double jod;
    @JsonProperty("joe")
    private Double joe;
    @JsonProperty("jpy")
    private Double jpy;
    @JsonProperty("jst")
    private Double jst;
    @JsonProperty("jto")
    private Double jto;
    @JsonProperty("jup")
    private Double jup;
    @JsonProperty("karrat")
    private Double karrat;
    @JsonProperty("kas")
    private Double kas;
    @JsonProperty("kava")
    private Double kava;
    @JsonProperty("kcs")
    private Double kcs;
    @JsonProperty("kda")
    private Double kda;
    @JsonProperty("keep")
    private Double keep;
    @JsonProperty("kes")
    private Double kes;
    @JsonProperty("kgs")
    private Double kgs;
    @JsonProperty("khr")
    private Double khr;
    @JsonProperty("klay")
    private Double klay;
    @JsonProperty("kmf")
    private Double kmf;
    @JsonProperty("kmno")
    private Double kmno;
    @JsonProperty("knc")
    private Double knc;
    @JsonProperty("kpw")
    private Double kpw;
    @JsonProperty("krl")
    private Double krl;
    @JsonProperty("krw")
    private Double krw;
    @JsonProperty("ksm")
    private Double ksm;
    @JsonProperty("kub")
    private Double kub;
    @JsonProperty("kuji")
    private Double kuji;
    @JsonProperty("kwd")
    private Double kwd;
    @JsonProperty("kyd")
    private Double kyd;
    @JsonProperty("kzt")
    private Double kzt;
    @JsonProperty("ladys")
    private Double ladys;
    @JsonProperty("lak")
    private Double lak;
    @JsonProperty("lbp")
    private Double lbp;
    @JsonProperty("lcx")
    private Double lcx;
    @JsonProperty("ldo")
    private Double ldo;
    @JsonProperty("leo")
    private Double leo;
    @JsonProperty("lft")
    private Double lft;
    @JsonProperty("link")
    private Double link;
    @JsonProperty("lit")
    private Double lit;
    @JsonProperty("lkr")
    private Double lkr;
    @JsonProperty("loka")
    private Double loka;
    @JsonProperty("loom")
    private Double loom;
    @JsonProperty("lpt")
    private Double lpt;
    @JsonProperty("lqty")
    private Double lqty;
    @JsonProperty("lrc")
    private Double lrc;
    @JsonProperty("lrd")
    private Double lrd;
    @JsonProperty("lrds")
    private Double lrds;
    @JsonProperty("lsd")
    private Double lsd;
    @JsonProperty("lseth")
    private Double lseth;
    @JsonProperty("lsk")
    private Double lsk;
    @JsonProperty("lsl")
    private Double lsl;
    @JsonProperty("ltc")
    private Double ltc;
    @JsonProperty("ltl")
    private Double ltl;
    @JsonProperty("luf")
    private Double luf;
    @JsonProperty("luna")
    private Double luna;
    @JsonProperty("lunc")
    private Double lunc;
    @JsonProperty("lusd")
    private Double lusd;
    @JsonProperty("lvl")
    private Double lvl;
    @JsonProperty("lyd")
    private Double lyd;
    @JsonProperty("lyx")
    private Double lyx;
    @JsonProperty("lyxe")
    private Double lyxe;
    @JsonProperty("mad")
    private Double mad;
    @JsonProperty("maga")
    private Double maga;
    @JsonProperty("magic")
    private Double magic;
    @JsonProperty("mana")
    private Double mana;
    @JsonProperty("manta")
    private Double manta;
    @JsonProperty("mask")
    private Double mask;
    @JsonProperty("math")
    private Double math;
    @JsonProperty("matic")
    private Double matic;
    @JsonProperty("mav")
    private Double mav;
    @JsonProperty("mavia")
    private Double mavia;
    @JsonProperty("mbx")
    private Double mbx;
    @JsonProperty("mco2")
    private Double mco2;
    @JsonProperty("mcoin")
    private Double mcoin;
    @JsonProperty("mdl")
    private Double mdl;
    @JsonProperty("mdt")
    private Double mdt;
    @JsonProperty("media")
    private Double media;
    @JsonProperty("meme")
    private Double meme;
    @JsonProperty("memes")
    private Double memes;
    @JsonProperty("meth")
    private Double meth;
    @JsonProperty("metis")
    private Double metis;
    @JsonProperty("mew")
    private Double mew;
    @JsonProperty("mga")
    private Double mga;
    @JsonProperty("mgf")
    private Double mgf;
    @JsonProperty("mina")
    private Double mina;
    @JsonProperty("mir")
    private Double mir;
    @JsonProperty("mkd")
    private Double mkd;
    @JsonProperty("mkr")
    private Double mkr;
    @JsonProperty("mkusd")
    private Double mkusd;
    @JsonProperty("mln")
    private Double mln;
    @JsonProperty("mmk")
    private Double mmk;
    @JsonProperty("mmx")
    private Double mmx;
    @JsonProperty("mnde")
    private Double mnde;
    @JsonProperty("mnt")
    private Double mnt;
    @JsonProperty("mobile")
    private Double mobile;
    @JsonProperty("mog")
    private Double mog;
    @JsonProperty("mona")
    private Double mona;
    @JsonProperty("mop")
    private Double mop;
    @JsonProperty("movr")
    private Double movr;
    @JsonProperty("mpl")
    private Double mpl;
    @JsonProperty("mplx")
    private Double mplx;
    @JsonProperty("mro")
    private Double mro;
    @JsonProperty("mrs")
    private Double mrs;
    @JsonProperty("mru")
    private Double mru;
    @JsonProperty("msol")
    private Double msol;
    @JsonProperty("mtl")
    private Double mtl;
    @JsonProperty("mubi")
    private Double mubi;
    @JsonProperty("multi")
    private Double multi;
    @JsonProperty("mumu")
    private Double mumu;
    @JsonProperty("mur")
    private Double mur;
    @JsonProperty("muse")
    private Double muse;
    @JsonProperty("mvr")
    private Double mvr;
    @JsonProperty("mwc")
    private Double mwc;
    @JsonProperty("mwk")
    private Double mwk;
    @JsonProperty("mx")
    private Double mx;
    @JsonProperty("mxc")
    private Double mxc;
    @JsonProperty("mxn")
    private Double mxn;
    @JsonProperty("mxv")
    private Double mxv;
    @JsonProperty("myr")
    private Double myr;
    @JsonProperty("myth")
    private Double myth;
    @JsonProperty("mzm")
    private Double mzm;
    @JsonProperty("mzn")
    private Double mzn;
    @JsonProperty("nad")
    private Double nad;
    @JsonProperty("nct")
    private Double nct;
    @JsonProperty("near")
    private Double near;
    @JsonProperty("neo")
    private Double neo;
    @JsonProperty("neon")
    private Double neon;
    @JsonProperty("nest")
    private Double nest;
    @JsonProperty("nexo")
    private Double nexo;
    @JsonProperty("nft")
    private Double nft;
    @JsonProperty("ngn")
    private Double ngn;
    @JsonProperty("nio")
    private Double nio;
    @JsonProperty("nkn")
    private Double nkn;
    @JsonProperty("nlg")
    private Double nlg;
    @JsonProperty("nmr")
    private Double nmr;
    @JsonProperty("nmt")
    private Double nmt;
    @JsonProperty("nok")
    private Double nok;
    @JsonProperty("nos")
    private Double nos;
    @JsonProperty("not")
    private Double not;
    @JsonProperty("npc")
    private Double npc;
    @JsonProperty("npr")
    private Double npr;
    @JsonProperty("npxs")
    private Double npxs;
    @JsonProperty("ntrn")
    private Double ntrn;
    @JsonProperty("nu")
    private Double nu;
    @JsonProperty("nxm")
    private Double nxm;
    @JsonProperty("nzd")
    private Double nzd;
    @JsonProperty("oas")
    private Double oas;
    @JsonProperty("ocean")
    private Double ocean;
    @JsonProperty("ogn")
    private Double ogn;
    @JsonProperty("ohm")
    private Double ohm;
    @JsonProperty("okb")
    private Double okb;
    @JsonProperty("okt")
    private Double okt;
    @JsonProperty("olas")
    private Double olas;
    @JsonProperty("om")
    private Double om;
    @JsonProperty("omg")
    private Double omg;
    @JsonProperty("omi")
    private Double omi;
    @JsonProperty("omikami")
    private Double omikami;
    @JsonProperty("omni")
    private Double omni;
    @JsonProperty("omr")
    private Double omr;
    @JsonProperty("ondo")
    private Double ondo;
    @JsonProperty("one")
    private Double one;
    @JsonProperty("ong")
    private Double ong;
    @JsonProperty("ont")
    private Double ont;
    @JsonProperty("ooki")
    private Double ooki;
    @JsonProperty("op")
    private Double op;
    @JsonProperty("orai")
    private Double orai;
    @JsonProperty("orca")
    private Double orca;
    @JsonProperty("ordi")
    private Double ordi;
    @JsonProperty("orn")
    private Double orn;
    @JsonProperty("osak")
    private Double osak;
    @JsonProperty("osmo")
    private Double osmo;
    @JsonProperty("ox_old")
    private Double oxOld;
    @JsonProperty("oxt")
    private Double oxt;
    @JsonProperty("paal")
    private Double paal;
    @JsonProperty("pab")
    private Integer pab;
    @JsonProperty("pandora")
    private Double pandora;
    @JsonProperty("pax")
    private Double pax;
    @JsonProperty("paxg")
    private Double paxg;
    @JsonProperty("pci")
    private Double pci;
    @JsonProperty("pen")
    private Double pen;
    @JsonProperty("pendle")
    private Double pendle;
    @JsonProperty("people")
    private Double people;
    @JsonProperty("pepe")
    private Double pepe;
    @JsonProperty("pepecoin")
    private Double pepecoin;
    @JsonProperty("perp")
    private Double perp;
    @JsonProperty("pgk")
    private Double pgk;
    @JsonProperty("php")
    private Double php;
    @JsonProperty("pixel")
    private Double pixel;
    @JsonProperty("pkr")
    private Double pkr;
    @JsonProperty("pla")
    private Double pla;
    @JsonProperty("pln")
    private Double pln;
    @JsonProperty("plu")
    private Double plu;
    @JsonProperty("png")
    private Double png;
    @JsonProperty("pokt")
    private Double pokt;
    @JsonProperty("pols")
    private Double pols;
    @JsonProperty("poly")
    private Double poly;
    @JsonProperty("polyx")
    private Double polyx;
    @JsonProperty("pond")
    private Double pond;
    @JsonProperty("ponke")
    private Double ponke;
    @JsonProperty("popcat")
    private Double popcat;
    @JsonProperty("pork")
    private Double pork;
    @JsonProperty("portal")
    private Double portal;
    @JsonProperty("powr")
    private Double powr;
    @JsonProperty("prime")
    private Double prime;
    @JsonProperty("pro")
    private Double pro;
    @JsonProperty("prom")
    private Double prom;
    @JsonProperty("prq")
    private Double prq;
    @JsonProperty("pte")
    private Double pte;
    @JsonProperty("pundix")
    private Double pundix;
    @JsonProperty("pups")
    private Double pups;
    @JsonProperty("pyg")
    private Double pyg;
    @JsonProperty("pyr")
    private Double pyr;
    @JsonProperty("pyth")
    private Double pyth;
    @JsonProperty("pyusd")
    private Double pyusd;
    @JsonProperty("qar")
    private Double qar;
    @JsonProperty("qi")
    private Double qi;
    @JsonProperty("qnt")
    private Double qnt;
    @JsonProperty("qtum")
    private Double qtum;
    @JsonProperty("qubic")
    private Double qubic;
    @JsonProperty("quick")
    private Double quick;
    @JsonProperty("rad")
    private Double rad;
    @JsonProperty("rai")
    private Double rai;
    @JsonProperty("rare")
    private Double rare;
    @JsonProperty("rari")
    private Double rari;
    @JsonProperty("ray")
    private Double ray;
    @JsonProperty("rbn")
    private Double rbn;
    @JsonProperty("rei")
    private Double rei;
    @JsonProperty("ren")
    private Double ren;
    @JsonProperty("render")
    private Double render;
    @JsonProperty("rep")
    private Double rep;
    @JsonProperty("repv2")
    private Double repv2;
    @JsonProperty("req")
    private Double req;
    @JsonProperty("reth")
    private Double reth;
    @JsonProperty("rgt")
    private Double rgt;
    @JsonProperty("rif")
    private Double rif;
    @JsonProperty("rlb")
    private Double rlb;
    @JsonProperty("rlc")
    private Double rlc;
    @JsonProperty("rly")
    private Double rly;
    @JsonProperty("rndr")
    private Double rndr;
    @JsonProperty("rol")
    private Double rol;
    @JsonProperty("ron")
    private Double ron;
    @JsonProperty("ronin")
    private Double ronin;
    @JsonProperty("rose")
    private Double rose;
    @JsonProperty("rpl")
    private Double rpl;
    @JsonProperty("rsd")
    private Double rsd;
    @JsonProperty("rseth")
    private Double rseth;
    @JsonProperty("rsr")
    private Double rsr;
    @JsonProperty("rss3")
    private Double rss3;
    @JsonProperty("rub")
    private Double rub;
    @JsonProperty("rune")
    private Double rune;
    @JsonProperty("rvn")
    private Double rvn;
    @JsonProperty("rwf")
    private Double rwf;
    @JsonProperty("safe")
    private Double safe;
    @JsonProperty("saga")
    private Double saga;
    @JsonProperty("sand")
    private Double sand;
    @JsonProperty("sar")
    private Double sar;
    @JsonProperty("sats")
    private Double sats;
    @JsonProperty("savax")
    private Double savax;
    @JsonProperty("sbd")
    private Double sbd;
    @JsonProperty("sc")
    private Double sc;
    @JsonProperty("scr")
    private Double scr;
    @JsonProperty("sd")
    private Double sd;
    @JsonProperty("sdd")
    private Double sdd;
    @JsonProperty("sdg")
    private Double sdg;
    @JsonProperty("seam")
    private Double seam;
    @JsonProperty("sei")
    private Double sei;
    @JsonProperty("sek")
    private Double sek;
    @JsonProperty("sfp")
    private Double sfp;
    @JsonProperty("sfrxeth")
    private Double sfrxeth;
    @JsonProperty("sfund")
    private Double sfund;
    @JsonProperty("sgb")
    private Double sgb;
    @JsonProperty("sgd")
    private Double sgd;
    @JsonProperty("shdw")
    private Double shdw;
    @JsonProperty("shib")
    private Double shib;
    @JsonProperty("shp")
    private Double shp;
    @JsonProperty("shping")
    private Double shping;
    @JsonProperty("sit")
    private Double sit;
    @JsonProperty("skk")
    private Double skk;
    @JsonProperty("skl")
    private Double skl;
    @JsonProperty("sle")
    private Double sle;
    @JsonProperty("slerf")
    private Double slerf;
    @JsonProperty("sll")
    private Double sll;
    @JsonProperty("slp")
    private Double slp;
    @JsonProperty("snt")
    private Double snt;
    @JsonProperty("snx")
    private Double snx;
    @JsonProperty("sol")
    private Double sol;
    @JsonProperty("sos")
    private Double sos;
    @JsonProperty("spa")
    private Double spa;
    @JsonProperty("spell")
    private Double spell;
    @JsonProperty("spl")
    private Double spl;
    @JsonProperty("srd")
    private Double srd;
    @JsonProperty("srg")
    private Double srg;
    @JsonProperty("ssv")
    private Double ssv;
    @JsonProperty("std")
    private Double std;
    @JsonProperty("steth")
    private Double steth;
    @JsonProperty("stg")
    private Double stg;
    @JsonProperty("stn")
    private Double stn;
    @JsonProperty("storj")
    private Double storj;
    @JsonProperty("strax")
    private Double strax;
    @JsonProperty("strd")
    private Double strd;
    @JsonProperty("strk")
    private Double strk;
    @JsonProperty("stsol")
    private Double stsol;
    @JsonProperty("stx")
    private Double stx;
    @JsonProperty("sui")
    private Double sui;
    @JsonProperty("suku")
    private Double suku;
    @JsonProperty("super")
    private Double _super;
    @JsonProperty("sushi")
    private Double sushi;
    @JsonProperty("svc")
    private Double svc;
    @JsonProperty("sweth")
    private Double sweth;
    @JsonProperty("swftc")
    private Double swftc;
    @JsonProperty("sxp")
    private Double sxp;
    @JsonProperty("sylo")
    private Double sylo;
    @JsonProperty("syn")
    private Double syn;
    @JsonProperty("sync")
    private Double sync;
    @JsonProperty("syp")
    private Double syp;
    @JsonProperty("szl")
    private Double szl;
    @JsonProperty("t")
    private Double t;
    @JsonProperty("tao")
    private Double tao;
    @JsonProperty("tbtc")
    private Double tbtc;
    @JsonProperty("tel")
    private Double tel;
    @JsonProperty("tet")
    private Double tet;
    @JsonProperty("tfuel")
    private Double tfuel;
    @JsonProperty("thb")
    private Double thb;
    @JsonProperty("theta")
    private Double theta;
    @JsonProperty("tia")
    private Double tia;
    @JsonProperty("time")
    private Double time;
    @JsonProperty("tjs")
    private Double tjs;
    @JsonProperty("tkx")
    private Double tkx;
    @JsonProperty("tmm")
    private Double tmm;
    @JsonProperty("tmt")
    private Double tmt;
    @JsonProperty("tnd")
    private Double tnd;
    @JsonProperty("tnsr")
    private Double tnsr;
    @JsonProperty("ton")
    private Double ton;
    @JsonProperty("tone")
    private Double tone;
    @JsonProperty("top")
    private Double top;
    @JsonProperty("topia")
    private Double topia;
    @JsonProperty("tor")
    private Double tor;
    @JsonProperty("toshi")
    private Double toshi;
    @JsonProperty("trac")
    private Double trac;
    @JsonProperty("trb")
    private Double trb;
    @JsonProperty("tribe")
    private Double tribe;
    @JsonProperty("trl")
    private Double trl;
    @JsonProperty("tru")
    private Double tru;
    @JsonProperty("trump")
    private Double trump;
    @JsonProperty("trx")
    private Double trx;
    @JsonProperty("try")
    private Double _try;
    @JsonProperty("ttd")
    private Double ttd;
    @JsonProperty("turbo")
    private Double turbo;
    @JsonProperty("tusd")
    private Double tusd;
    @JsonProperty("tvd")
    private Double tvd;
    @JsonProperty("tvk")
    private Double tvk;
    @JsonProperty("twd")
    private Double twd;
    @JsonProperty("twt")
    private Double twt;
    @JsonProperty("tzs")
    private Double tzs;
    @JsonProperty("uah")
    private Double uah;
    @JsonProperty("ugx")
    private Double ugx;
    @JsonProperty("ultima")
    private Double ultima;
    @JsonProperty("uma")
    private Double uma;
    @JsonProperty("unfi")
    private Double unfi;
    @JsonProperty("uni")
    private Double uni;
    @JsonProperty("uos")
    private Double uos;
    @JsonProperty("upi")
    private Double upi;
    @JsonProperty("uqc")
    private Double uqc;
    @JsonProperty("usd")
    private Integer usd;
    @JsonProperty("usdb")
    private Double usdb;
    @JsonProperty("usdc")
    private Double usdc;
    @JsonProperty("usdc.e")
    private Double usdcE;
    @JsonProperty("usdd")
    private Double usdd;
    @JsonProperty("usde")
    private Double usde;
    @JsonProperty("usdp")
    private Double usdp;
    @JsonProperty("usdt")
    private Double usdt;
    @JsonProperty("usdy")
    private Double usdy;
    @JsonProperty("ust")
    private Double ust;
    @JsonProperty("ustc")
    private Double ustc;
    @JsonProperty("uyu")
    private Double uyu;
    @JsonProperty("uzs")
    private Double uzs;
    @JsonProperty("val")
    private Double val;
    @JsonProperty("vanry")
    private Double vanry;
    @JsonProperty("vara")
    private Double vara;
    @JsonProperty("veb")
    private Double veb;
    @JsonProperty("ved")
    private Double ved;
    @JsonProperty("vef")
    private Double vef;
    @JsonProperty("velo")
    private Double velo;
    @JsonProperty("venom")
    private Double venom;
    @JsonProperty("ves")
    private Double ves;
    @JsonProperty("vet")
    private Double vet;
    @JsonProperty("vgx")
    private Double vgx;
    @JsonProperty("vnd")
    private Double vnd;
    @JsonProperty("vnst")
    private Double vnst;
    @JsonProperty("voxel")
    private Double voxel;
    @JsonProperty("vr")
    private Double vr;
    @JsonProperty("vtho")
    private Double vtho;
    @JsonProperty("vuv")
    private Double vuv;
    @JsonProperty("w")
    private Double w;
    @JsonProperty("wampl")
    private Double wampl;
    @JsonProperty("waves")
    private Double waves;
    @JsonProperty("waxl")
    private Double waxl;
    @JsonProperty("waxp")
    private Double waxp;
    @JsonProperty("wbeth")
    private Double wbeth;
    @JsonProperty("wbt")
    private Double wbt;
    @JsonProperty("wbtc")
    private Double wbtc;
    @JsonProperty("wcfg")
    private Double wcfg;
    @JsonProperty("weeth")
    private Double weeth;
    @JsonProperty("wemix")
    private Double wemix;
    @JsonProperty("wif")
    private Double wif;
    @JsonProperty("wild")
    private Double wild;
    @JsonProperty("wld")
    private Double wld;
    @JsonProperty("wluna")
    private Double wluna;
    @JsonProperty("woo")
    private Double woo;
    @JsonProperty("wst")
    private Double wst;
    @JsonProperty("wzrd")
    private Double wzrd;
    @JsonProperty("xaf")
    private Double xaf;
    @JsonProperty("xag")
    private Double xag;
    @JsonProperty("xai")
    private Double xai;
    @JsonProperty("xau")
    private Double xau;
    @JsonProperty("xaut")
    private Double xaut;
    @JsonProperty("xbt")
    private Double xbt;
    @JsonProperty("xcd")
    private Double xcd;
    @JsonProperty("xch")
    private Double xch;
    @JsonProperty("xcn")
    private Double xcn;
    @JsonProperty("xdc")
    private Double xdc;
    @JsonProperty("xdr")
    private Double xdr;
    @JsonProperty("xec")
    private Double xec;
    @JsonProperty("xem")
    private Double xem;
    @JsonProperty("xlm")
    private Double xlm;
    @JsonProperty("xmon")
    private Double xmon;
    @JsonProperty("xmr")
    private Double xmr;
    @JsonProperty("xof")
    private Double xof;
    @JsonProperty("xpd")
    private Double xpd;
    @JsonProperty("xpf")
    private Double xpf;
    @JsonProperty("xpt")
    private Double xpt;
    @JsonProperty("xrd")
    private Double xrd;
    @JsonProperty("xrp")
    private Double xrp;
    @JsonProperty("xt")
    private Double xt;
    @JsonProperty("xtz")
    private Double xtz;
    @JsonProperty("xvs")
    private Double xvs;
    @JsonProperty("xyo")
    private Double xyo;
    @JsonProperty("yer")
    private Double yer;
    @JsonProperty("yfi")
    private Double yfi;
    @JsonProperty("yfii")
    private Double yfii;
    @JsonProperty("ygg")
    private Double ygg;
    @JsonProperty("zar")
    private Double zar;
    @JsonProperty("zbc")
    private Double zbc;
    @JsonProperty("zec")
    private Double zec;
    @JsonProperty("zen")
    private Double zen;
    @JsonProperty("zeta")
    private Double zeta;
    @JsonProperty("zil")
    private Double zil;
    @JsonProperty("zk")
    private Double zk;
    @JsonProperty("zmk")
    private Double zmk;
    @JsonProperty("zmw")
    private Double zmw;
    @JsonProperty("zro")
    private Double zro;
    @JsonProperty("zrx")
    private Double zrx;
    @JsonProperty("zwd")
    private Double zwd;
    @JsonProperty("zwg")
    private Double zwg;
    @JsonProperty("zwl")
    private Double zwl;
    @JsonProperty("zypto")
    private Double zypto;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("$myro")
    public Double get$myro() {
        return $myro;
    }

    @JsonProperty("$myro")
    public void set$myro(Double $myro) {
        this.$myro = $myro;
    }

    @JsonProperty("$wen")
    public Double get$wen() {
        return $wen;
    }

    @JsonProperty("$wen")
    public void set$wen(Double $wen) {
        this.$wen = $wen;
    }

    @JsonProperty("00")
    public Double get00() {
        return _00;
    }

    @JsonProperty("00")
    public void set00(Double _00) {
        this._00 = _00;
    }

    @JsonProperty("0x0")
    public Double get0x0() {
        return _0x0;
    }

    @JsonProperty("0x0")
    public void set0x0(Double _0x0) {
        this._0x0 = _0x0;
    }

    @JsonProperty("1000sats")
    public Double get1000sats() {
        return _1000sats;
    }

    @JsonProperty("1000sats")
    public void set1000sats(Double _1000sats) {
        this._1000sats = _1000sats;
    }

    @JsonProperty("10set")
    public Double get10set() {
        return _10set;
    }

    @JsonProperty("10set")
    public void set10set(Double _10set) {
        this._10set = _10set;
    }

    @JsonProperty("1inch")
    public Double get1inch() {
        return _1inch;
    }

    @JsonProperty("1inch")
    public void set1inch(Double _1inch) {
        this._1inch = _1inch;
    }

    @JsonProperty("aave")
    public Double getAave() {
        return aave;
    }

    @JsonProperty("aave")
    public void setAave(Double aave) {
        this.aave = aave;
    }

    @JsonProperty("abt")
    public Double getAbt() {
        return abt;
    }

    @JsonProperty("abt")
    public void setAbt(Double abt) {
        this.abt = abt;
    }

    @JsonProperty("ach")
    public Double getAch() {
        return ach;
    }

    @JsonProperty("ach")
    public void setAch(Double ach) {
        this.ach = ach;
    }

    @JsonProperty("acs")
    public Double getAcs() {
        return acs;
    }

    @JsonProperty("acs")
    public void setAcs(Double acs) {
        this.acs = acs;
    }

    @JsonProperty("ada")
    public Double getAda() {
        return ada;
    }

    @JsonProperty("ada")
    public void setAda(Double ada) {
        this.ada = ada;
    }

    @JsonProperty("aed")
    public Double getAed() {
        return aed;
    }

    @JsonProperty("aed")
    public void setAed(Double aed) {
        this.aed = aed;
    }

    @JsonProperty("aergo")
    public Double getAergo() {
        return aergo;
    }

    @JsonProperty("aergo")
    public void setAergo(Double aergo) {
        this.aergo = aergo;
    }

    @JsonProperty("aero")
    public Double getAero() {
        return aero;
    }

    @JsonProperty("aero")
    public void setAero(Double aero) {
        this.aero = aero;
    }

    @JsonProperty("aevo")
    public Double getAevo() {
        return aevo;
    }

    @JsonProperty("aevo")
    public void setAevo(Double aevo) {
        this.aevo = aevo;
    }

    @JsonProperty("afn")
    public Double getAfn() {
        return afn;
    }

    @JsonProperty("afn")
    public void setAfn(Double afn) {
        this.afn = afn;
    }

    @JsonProperty("agi")
    public Double getAgi() {
        return agi;
    }

    @JsonProperty("agi")
    public void setAgi(Double agi) {
        this.agi = agi;
    }

    @JsonProperty("agix")
    public Double getAgix() {
        return agix;
    }

    @JsonProperty("agix")
    public void setAgix(Double agix) {
        this.agix = agix;
    }

    @JsonProperty("agld")
    public Double getAgld() {
        return agld;
    }

    @JsonProperty("agld")
    public void setAgld(Double agld) {
        this.agld = agld;
    }

    @JsonProperty("ai")
    public Double getAi() {
        return ai;
    }

    @JsonProperty("ai")
    public void setAi(Double ai) {
        this.ai = ai;
    }

    @JsonProperty("aioz")
    public Double getAioz() {
        return aioz;
    }

    @JsonProperty("aioz")
    public void setAioz(Double aioz) {
        this.aioz = aioz;
    }

    @JsonProperty("akt")
    public Double getAkt() {
        return akt;
    }

    @JsonProperty("akt")
    public void setAkt(Double akt) {
        this.akt = akt;
    }

    @JsonProperty("alcx")
    public Double getAlcx() {
        return alcx;
    }

    @JsonProperty("alcx")
    public void setAlcx(Double alcx) {
        this.alcx = alcx;
    }

    @JsonProperty("aleph")
    public Double getAleph() {
        return aleph;
    }

    @JsonProperty("aleph")
    public void setAleph(Double aleph) {
        this.aleph = aleph;
    }

    @JsonProperty("alex")
    public Double getAlex() {
        return alex;
    }

    @JsonProperty("alex")
    public void setAlex(Double alex) {
        this.alex = alex;
    }

    @JsonProperty("algo")
    public Double getAlgo() {
        return algo;
    }

    @JsonProperty("algo")
    public void setAlgo(Double algo) {
        this.algo = algo;
    }

    @JsonProperty("alice")
    public Double getAlice() {
        return alice;
    }

    @JsonProperty("alice")
    public void setAlice(Double alice) {
        this.alice = alice;
    }

    @JsonProperty("all")
    public Double getAll() {
        return all;
    }

    @JsonProperty("all")
    public void setAll(Double all) {
        this.all = all;
    }

    @JsonProperty("alph")
    public Double getAlph() {
        return alph;
    }

    @JsonProperty("alph")
    public void setAlph(Double alph) {
        this.alph = alph;
    }

    @JsonProperty("alt")
    public Double getAlt() {
        return alt;
    }

    @JsonProperty("alt")
    public void setAlt(Double alt) {
        this.alt = alt;
    }

    @JsonProperty("alusd")
    public Double getAlusd() {
        return alusd;
    }

    @JsonProperty("alusd")
    public void setAlusd(Double alusd) {
        this.alusd = alusd;
    }

    @JsonProperty("amd")
    public Double getAmd() {
        return amd;
    }

    @JsonProperty("amd")
    public void setAmd(Double amd) {
        this.amd = amd;
    }

    @JsonProperty("amp")
    public Double getAmp() {
        return amp;
    }

    @JsonProperty("amp")
    public void setAmp(Double amp) {
        this.amp = amp;
    }

    @JsonProperty("ampl")
    public Double getAmpl() {
        return ampl;
    }

    @JsonProperty("ampl")
    public void setAmpl(Double ampl) {
        this.ampl = ampl;
    }

    @JsonProperty("andy")
    public Double getAndy() {
        return andy;
    }

    @JsonProperty("andy")
    public void setAndy(Double andy) {
        this.andy = andy;
    }

    @JsonProperty("ang")
    public Double getAng() {
        return ang;
    }

    @JsonProperty("ang")
    public void setAng(Double ang) {
        this.ang = ang;
    }

    @JsonProperty("ankr")
    public Double getAnkr() {
        return ankr;
    }

    @JsonProperty("ankr")
    public void setAnkr(Double ankr) {
        this.ankr = ankr;
    }

    @JsonProperty("ant")
    public Double getAnt() {
        return ant;
    }

    @JsonProperty("ant")
    public void setAnt(Double ant) {
        this.ant = ant;
    }

    @JsonProperty("aoa")
    public Double getAoa() {
        return aoa;
    }

    @JsonProperty("aoa")
    public void setAoa(Double aoa) {
        this.aoa = aoa;
    }

    @JsonProperty("ape")
    public Double getApe() {
        return ape;
    }

    @JsonProperty("ape")
    public void setApe(Double ape) {
        this.ape = ape;
    }

    @JsonProperty("apex")
    public Double getApex() {
        return apex;
    }

    @JsonProperty("apex")
    public void setApex(Double apex) {
        this.apex = apex;
    }

    @JsonProperty("api3")
    public Double getApi3() {
        return api3;
    }

    @JsonProperty("api3")
    public void setApi3(Double api3) {
        this.api3 = api3;
    }

    @JsonProperty("apl")
    public Double getApl() {
        return apl;
    }

    @JsonProperty("apl")
    public void setApl(Double apl) {
        this.apl = apl;
    }

    @JsonProperty("apt")
    public Double getApt() {
        return apt;
    }

    @JsonProperty("apt")
    public void setApt(Double apt) {
        this.apt = apt;
    }

    @JsonProperty("apu")
    public Double getApu() {
        return apu;
    }

    @JsonProperty("apu")
    public void setApu(Double apu) {
        this.apu = apu;
    }

    @JsonProperty("ar")
    public Double getAr() {
        return ar;
    }

    @JsonProperty("ar")
    public void setAr(Double ar) {
        this.ar = ar;
    }

    @JsonProperty("arb")
    public Double getArb() {
        return arb;
    }

    @JsonProperty("arb")
    public void setArb(Double arb) {
        this.arb = arb;
    }

    @JsonProperty("ark")
    public Double getArk() {
        return ark;
    }

    @JsonProperty("ark")
    public void setArk(Double ark) {
        this.ark = ark;
    }

    @JsonProperty("arkm")
    public Double getArkm() {
        return arkm;
    }

    @JsonProperty("arkm")
    public void setArkm(Double arkm) {
        this.arkm = arkm;
    }

    @JsonProperty("arpa")
    public Double getArpa() {
        return arpa;
    }

    @JsonProperty("arpa")
    public void setArpa(Double arpa) {
        this.arpa = arpa;
    }

    @JsonProperty("ars")
    public Double getArs() {
        return ars;
    }

    @JsonProperty("ars")
    public void setArs(Double ars) {
        this.ars = ars;
    }

    @JsonProperty("asm")
    public Double getAsm() {
        return asm;
    }

    @JsonProperty("asm")
    public void setAsm(Double asm) {
        this.asm = asm;
    }

    @JsonProperty("ast")
    public Double getAst() {
        return ast;
    }

    @JsonProperty("ast")
    public void setAst(Double ast) {
        this.ast = ast;
    }

    @JsonProperty("astr")
    public Double getAstr() {
        return astr;
    }

    @JsonProperty("astr")
    public void setAstr(Double astr) {
        this.astr = astr;
    }

    @JsonProperty("ata")
    public Double getAta() {
        return ata;
    }

    @JsonProperty("ata")
    public void setAta(Double ata) {
        this.ata = ata;
    }

    @JsonProperty("ath")
    public Double getAth() {
        return ath;
    }

    @JsonProperty("ath")
    public void setAth(Double ath) {
        this.ath = ath;
    }

    @JsonProperty("atom")
    public Double getAtom() {
        return atom;
    }

    @JsonProperty("atom")
    public void setAtom(Double atom) {
        this.atom = atom;
    }

    @JsonProperty("ats")
    public Double getAts() {
        return ats;
    }

    @JsonProperty("ats")
    public void setAts(Double ats) {
        this.ats = ats;
    }

    @JsonProperty("auction")
    public Double getAuction() {
        return auction;
    }

    @JsonProperty("auction")
    public void setAuction(Double auction) {
        this.auction = auction;
    }

    @JsonProperty("aud")
    public Double getAud() {
        return aud;
    }

    @JsonProperty("aud")
    public void setAud(Double aud) {
        this.aud = aud;
    }

    @JsonProperty("audio")
    public Double getAudio() {
        return audio;
    }

    @JsonProperty("audio")
    public void setAudio(Double audio) {
        this.audio = audio;
    }

    @JsonProperty("aurora")
    public Double getAurora() {
        return aurora;
    }

    @JsonProperty("aurora")
    public void setAurora(Double aurora) {
        this.aurora = aurora;
    }

    @JsonProperty("avail")
    public Double getAvail() {
        return avail;
    }

    @JsonProperty("avail")
    public void setAvail(Double avail) {
        this.avail = avail;
    }

    @JsonProperty("avax")
    public Double getAvax() {
        return avax;
    }

    @JsonProperty("avax")
    public void setAvax(Double avax) {
        this.avax = avax;
    }

    @JsonProperty("avt")
    public Double getAvt() {
        return avt;
    }

    @JsonProperty("avt")
    public void setAvt(Double avt) {
        this.avt = avt;
    }

    @JsonProperty("awg")
    public Double getAwg() {
        return awg;
    }

    @JsonProperty("awg")
    public void setAwg(Double awg) {
        this.awg = awg;
    }

    @JsonProperty("axl")
    public Double getAxl() {
        return axl;
    }

    @JsonProperty("axl")
    public void setAxl(Double axl) {
        this.axl = axl;
    }

    @JsonProperty("axs")
    public Double getAxs() {
        return axs;
    }

    @JsonProperty("axs")
    public void setAxs(Double axs) {
        this.axs = axs;
    }

    @JsonProperty("azero")
    public Double getAzero() {
        return azero;
    }

    @JsonProperty("azero")
    public void setAzero(Double azero) {
        this.azero = azero;
    }

    @JsonProperty("azm")
    public Double getAzm() {
        return azm;
    }

    @JsonProperty("azm")
    public void setAzm(Double azm) {
        this.azm = azm;
    }

    @JsonProperty("azn")
    public Double getAzn() {
        return azn;
    }

    @JsonProperty("azn")
    public void setAzn(Double azn) {
        this.azn = azn;
    }

    @JsonProperty("babydoge")
    public Double getBabydoge() {
        return babydoge;
    }

    @JsonProperty("babydoge")
    public void setBabydoge(Double babydoge) {
        this.babydoge = babydoge;
    }

    @JsonProperty("badger")
    public Double getBadger() {
        return badger;
    }

    @JsonProperty("badger")
    public void setBadger(Double badger) {
        this.badger = badger;
    }

    @JsonProperty("bake")
    public Double getBake() {
        return bake;
    }

    @JsonProperty("bake")
    public void setBake(Double bake) {
        this.bake = bake;
    }

    @JsonProperty("bal")
    public Double getBal() {
        return bal;
    }

    @JsonProperty("bal")
    public void setBal(Double bal) {
        this.bal = bal;
    }

    @JsonProperty("bam")
    public Double getBam() {
        return bam;
    }

    @JsonProperty("bam")
    public void setBam(Double bam) {
        this.bam = bam;
    }

    @JsonProperty("band")
    public Double getBand() {
        return band;
    }

    @JsonProperty("band")
    public void setBand(Double band) {
        this.band = band;
    }

    @JsonProperty("bat")
    public Double getBat() {
        return bat;
    }

    @JsonProperty("bat")
    public void setBat(Double bat) {
        this.bat = bat;
    }

    @JsonProperty("bb")
    public Double getBb() {
        return bb;
    }

    @JsonProperty("bb")
    public void setBb(Double bb) {
        this.bb = bb;
    }

    @JsonProperty("bbd")
    public Integer getBbd() {
        return bbd;
    }

    @JsonProperty("bbd")
    public void setBbd(Integer bbd) {
        this.bbd = bbd;
    }

    @JsonProperty("bch")
    public Double getBch() {
        return bch;
    }

    @JsonProperty("bch")
    public void setBch(Double bch) {
        this.bch = bch;
    }

    @JsonProperty("bdt")
    public Double getBdt() {
        return bdt;
    }

    @JsonProperty("bdt")
    public void setBdt(Double bdt) {
        this.bdt = bdt;
    }

    @JsonProperty("bdx")
    public Double getBdx() {
        return bdx;
    }

    @JsonProperty("bdx")
    public void setBdx(Double bdx) {
        this.bdx = bdx;
    }

    @JsonProperty("beam")
    public Double getBeam() {
        return beam;
    }

    @JsonProperty("beam")
    public void setBeam(Double beam) {
        this.beam = beam;
    }

    @JsonProperty("beer")
    public Double getBeer() {
        return beer;
    }

    @JsonProperty("beer")
    public void setBeer(Double beer) {
        this.beer = beer;
    }

    @JsonProperty("bef")
    public Double getBef() {
        return bef;
    }

    @JsonProperty("bef")
    public void setBef(Double bef) {
        this.bef = bef;
    }

    @JsonProperty("bgb")
    public Double getBgb() {
        return bgb;
    }

    @JsonProperty("bgb")
    public void setBgb(Double bgb) {
        this.bgb = bgb;
    }

    @JsonProperty("bgn")
    public Double getBgn() {
        return bgn;
    }

    @JsonProperty("bgn")
    public void setBgn(Double bgn) {
        this.bgn = bgn;
    }

    @JsonProperty("bhd")
    public Double getBhd() {
        return bhd;
    }

    @JsonProperty("bhd")
    public void setBhd(Double bhd) {
        this.bhd = bhd;
    }

    @JsonProperty("bico")
    public Double getBico() {
        return bico;
    }

    @JsonProperty("bico")
    public void setBico(Double bico) {
        this.bico = bico;
    }

    @JsonProperty("bif")
    public Double getBif() {
        return bif;
    }

    @JsonProperty("bif")
    public void setBif(Double bif) {
        this.bif = bif;
    }

    @JsonProperty("bigtime")
    public Double getBigtime() {
        return bigtime;
    }

    @JsonProperty("bigtime")
    public void setBigtime(Double bigtime) {
        this.bigtime = bigtime;
    }

    @JsonProperty("billy")
    public Double getBilly() {
        return billy;
    }

    @JsonProperty("billy")
    public void setBilly(Double billy) {
        this.billy = billy;
    }

    @JsonProperty("bit")
    public Double getBit() {
        return bit;
    }

    @JsonProperty("bit")
    public void setBit(Double bit) {
        this.bit = bit;
    }

    @JsonProperty("blast")
    public Double getBlast() {
        return blast;
    }

    @JsonProperty("blast")
    public void setBlast(Double blast) {
        this.blast = blast;
    }

    @JsonProperty("bld")
    public Double getBld() {
        return bld;
    }

    @JsonProperty("bld")
    public void setBld(Double bld) {
        this.bld = bld;
    }

    @JsonProperty("blur")
    public Double getBlur() {
        return blur;
    }

    @JsonProperty("blur")
    public void setBlur(Double blur) {
        this.blur = blur;
    }

    @JsonProperty("blz")
    public Double getBlz() {
        return blz;
    }

    @JsonProperty("blz")
    public void setBlz(Double blz) {
        this.blz = blz;
    }

    @JsonProperty("bmd")
    public Integer getBmd() {
        return bmd;
    }

    @JsonProperty("bmd")
    public void setBmd(Integer bmd) {
        this.bmd = bmd;
    }

    @JsonProperty("bnb")
    public Double getBnb() {
        return bnb;
    }

    @JsonProperty("bnb")
    public void setBnb(Double bnb) {
        this.bnb = bnb;
    }

    @JsonProperty("bnd")
    public Double getBnd() {
        return bnd;
    }

    @JsonProperty("bnd")
    public void setBnd(Double bnd) {
        this.bnd = bnd;
    }

    @JsonProperty("bnt")
    public Double getBnt() {
        return bnt;
    }

    @JsonProperty("bnt")
    public void setBnt(Double bnt) {
        this.bnt = bnt;
    }

    @JsonProperty("bob")
    public Double getBob() {
        return bob;
    }

    @JsonProperty("bob")
    public void setBob(Double bob) {
        this.bob = bob;
    }

    @JsonProperty("boba")
    public Double getBoba() {
        return boba;
    }

    @JsonProperty("boba")
    public void setBoba(Double boba) {
        this.boba = boba;
    }

    @JsonProperty("boden")
    public Double getBoden() {
        return boden;
    }

    @JsonProperty("boden")
    public void setBoden(Double boden) {
        this.boden = boden;
    }

    @JsonProperty("bome")
    public Double getBome() {
        return bome;
    }

    @JsonProperty("bome")
    public void setBome(Double bome) {
        this.bome = bome;
    }

    @JsonProperty("bond")
    public Double getBond() {
        return bond;
    }

    @JsonProperty("bond")
    public void setBond(Double bond) {
        this.bond = bond;
    }

    @JsonProperty("bone")
    public Double getBone() {
        return bone;
    }

    @JsonProperty("bone")
    public void setBone(Double bone) {
        this.bone = bone;
    }

    @JsonProperty("bonk")
    public Double getBonk() {
        return bonk;
    }

    @JsonProperty("bonk")
    public void setBonk(Double bonk) {
        this.bonk = bonk;
    }

    @JsonProperty("bora")
    public Double getBora() {
        return bora;
    }

    @JsonProperty("bora")
    public void setBora(Double bora) {
        this.bora = bora;
    }

    @JsonProperty("borg")
    public Double getBorg() {
        return borg;
    }

    @JsonProperty("borg")
    public void setBorg(Double borg) {
        this.borg = borg;
    }

    @JsonProperty("bpx")
    public Double getBpx() {
        return bpx;
    }

    @JsonProperty("bpx")
    public void setBpx(Double bpx) {
        this.bpx = bpx;
    }

    @JsonProperty("brett")
    public Double getBrett() {
        return brett;
    }

    @JsonProperty("brett")
    public void setBrett(Double brett) {
        this.brett = brett;
    }

    @JsonProperty("brl")
    public Double getBrl() {
        return brl;
    }

    @JsonProperty("brl")
    public void setBrl(Double brl) {
        this.brl = brl;
    }

    @JsonProperty("bsd")
    public Integer getBsd() {
        return bsd;
    }

    @JsonProperty("bsd")
    public void setBsd(Integer bsd) {
        this.bsd = bsd;
    }

    @JsonProperty("bsv")
    public Double getBsv() {
        return bsv;
    }

    @JsonProperty("bsv")
    public void setBsv(Double bsv) {
        this.bsv = bsv;
    }

    @JsonProperty("bsw")
    public Double getBsw() {
        return bsw;
    }

    @JsonProperty("bsw")
    public void setBsw(Double bsw) {
        this.bsw = bsw;
    }

    @JsonProperty("btc")
    public Double getBtc() {
        return btc;
    }

    @JsonProperty("btc")
    public void setBtc(Double btc) {
        this.btc = btc;
    }

    @JsonProperty("btc.b")
    public Double getBtcB() {
        return btcB;
    }

    @JsonProperty("btc.b")
    public void setBtcB(Double btcB) {
        this.btcB = btcB;
    }

    @JsonProperty("btcb")
    public Double getBtcb() {
        return btcb;
    }

    @JsonProperty("btcb")
    public void setBtcb(Double btcb) {
        this.btcb = btcb;
    }

    @JsonProperty("btg")
    public Double getBtg() {
        return btg;
    }

    @JsonProperty("btg")
    public void setBtg(Double btg) {
        this.btg = btg;
    }

    @JsonProperty("btn")
    public Double getBtn() {
        return btn;
    }

    @JsonProperty("btn")
    public void setBtn(Double btn) {
        this.btn = btn;
    }

    @JsonProperty("btrfly")
    public Double getBtrfly() {
        return btrfly;
    }

    @JsonProperty("btrfly")
    public void setBtrfly(Double btrfly) {
        this.btrfly = btrfly;
    }

    @JsonProperty("btrst")
    public Double getBtrst() {
        return btrst;
    }

    @JsonProperty("btrst")
    public void setBtrst(Double btrst) {
        this.btrst = btrst;
    }

    @JsonProperty("btt")
    public Double getBtt() {
        return btt;
    }

    @JsonProperty("btt")
    public void setBtt(Double btt) {
        this.btt = btt;
    }

    @JsonProperty("busd")
    public Double getBusd() {
        return busd;
    }

    @JsonProperty("busd")
    public void setBusd(Double busd) {
        this.busd = busd;
    }

    @JsonProperty("bwp")
    public Double getBwp() {
        return bwp;
    }

    @JsonProperty("bwp")
    public void setBwp(Double bwp) {
        this.bwp = bwp;
    }

    @JsonProperty("byn")
    public Double getByn() {
        return byn;
    }

    @JsonProperty("byn")
    public void setByn(Double byn) {
        this.byn = byn;
    }

    @JsonProperty("byr")
    public Double getByr() {
        return byr;
    }

    @JsonProperty("byr")
    public void setByr(Double byr) {
        this.byr = byr;
    }

    @JsonProperty("bzd")
    public Double getBzd() {
        return bzd;
    }

    @JsonProperty("bzd")
    public void setBzd(Double bzd) {
        this.bzd = bzd;
    }

    @JsonProperty("c98")
    public Double getC98() {
        return c98;
    }

    @JsonProperty("c98")
    public void setC98(Double c98) {
        this.c98 = c98;
    }

    @JsonProperty("cad")
    public Double getCad() {
        return cad;
    }

    @JsonProperty("cad")
    public void setCad(Double cad) {
        this.cad = cad;
    }

    @JsonProperty("caf")
    public Double getCaf() {
        return caf;
    }

    @JsonProperty("caf")
    public void setCaf(Double caf) {
        this.caf = caf;
    }

    @JsonProperty("cake")
    public Double getCake() {
        return cake;
    }

    @JsonProperty("cake")
    public void setCake(Double cake) {
        this.cake = cake;
    }

    @JsonProperty("canto")
    public Double getCanto() {
        return canto;
    }

    @JsonProperty("canto")
    public void setCanto(Double canto) {
        this.canto = canto;
    }

    @JsonProperty("cbeth")
    public Double getCbeth() {
        return cbeth;
    }

    @JsonProperty("cbeth")
    public void setCbeth(Double cbeth) {
        this.cbeth = cbeth;
    }

    @JsonProperty("cdai")
    public Double getCdai() {
        return cdai;
    }

    @JsonProperty("cdai")
    public void setCdai(Double cdai) {
        this.cdai = cdai;
    }

    @JsonProperty("cdf")
    public Double getCdf() {
        return cdf;
    }

    @JsonProperty("cdf")
    public void setCdf(Double cdf) {
        this.cdf = cdf;
    }

    @JsonProperty("cdt")
    public Double getCdt() {
        return cdt;
    }

    @JsonProperty("cdt")
    public void setCdt(Double cdt) {
        this.cdt = cdt;
    }

    @JsonProperty("cel")
    public Double getCel() {
        return cel;
    }

    @JsonProperty("cel")
    public void setCel(Double cel) {
        this.cel = cel;
    }

    @JsonProperty("celo")
    public Double getCelo() {
        return celo;
    }

    @JsonProperty("celo")
    public void setCelo(Double celo) {
        this.celo = celo;
    }

    @JsonProperty("celr")
    public Double getCelr() {
        return celr;
    }

    @JsonProperty("celr")
    public void setCelr(Double celr) {
        this.celr = celr;
    }

    @JsonProperty("ceth")
    public Double getCeth() {
        return ceth;
    }

    @JsonProperty("ceth")
    public void setCeth(Double ceth) {
        this.ceth = ceth;
    }

    @JsonProperty("cfg")
    public Double getCfg() {
        return cfg;
    }

    @JsonProperty("cfg")
    public void setCfg(Double cfg) {
        this.cfg = cfg;
    }

    @JsonProperty("cfx")
    public Double getCfx() {
        return cfx;
    }

    @JsonProperty("cfx")
    public void setCfx(Double cfx) {
        this.cfx = cfx;
    }

    @JsonProperty("cgld")
    public Double getCgld() {
        return cgld;
    }

    @JsonProperty("cgld")
    public void setCgld(Double cgld) {
        this.cgld = cgld;
    }

    @JsonProperty("cheel")
    public Double getCheel() {
        return cheel;
    }

    @JsonProperty("cheel")
    public void setCheel(Double cheel) {
        this.cheel = cheel;
    }

    @JsonProperty("chex")
    public Double getChex() {
        return chex;
    }

    @JsonProperty("chex")
    public void setChex(Double chex) {
        this.chex = chex;
    }

    @JsonProperty("chf")
    public Double getChf() {
        return chf;
    }

    @JsonProperty("chf")
    public void setChf(Double chf) {
        this.chf = chf;
    }

    @JsonProperty("chr")
    public Double getChr() {
        return chr;
    }

    @JsonProperty("chr")
    public void setChr(Double chr) {
        this.chr = chr;
    }

    @JsonProperty("chz")
    public Double getChz() {
        return chz;
    }

    @JsonProperty("chz")
    public void setChz(Double chz) {
        this.chz = chz;
    }

    @JsonProperty("ckb")
    public Double getCkb() {
        return ckb;
    }

    @JsonProperty("ckb")
    public void setCkb(Double ckb) {
        this.ckb = ckb;
    }

    @JsonProperty("clp")
    public Double getClp() {
        return clp;
    }

    @JsonProperty("clp")
    public void setClp(Double clp) {
        this.clp = clp;
    }

    @JsonProperty("clv")
    public Double getClv() {
        return clv;
    }

    @JsonProperty("clv")
    public void setClv(Double clv) {
        this.clv = clv;
    }

    @JsonProperty("cnh")
    public Double getCnh() {
        return cnh;
    }

    @JsonProperty("cnh")
    public void setCnh(Double cnh) {
        this.cnh = cnh;
    }

    @JsonProperty("cny")
    public Double getCny() {
        return cny;
    }

    @JsonProperty("cny")
    public void setCny(Double cny) {
        this.cny = cny;
    }

    @JsonProperty("comai")
    public Double getComai() {
        return comai;
    }

    @JsonProperty("comai")
    public void setComai(Double comai) {
        this.comai = comai;
    }

    @JsonProperty("comp")
    public Double getComp() {
        return comp;
    }

    @JsonProperty("comp")
    public void setComp(Double comp) {
        this.comp = comp;
    }

    @JsonProperty("cop")
    public Double getCop() {
        return cop;
    }

    @JsonProperty("cop")
    public void setCop(Double cop) {
        this.cop = cop;
    }

    @JsonProperty("coq")
    public Double getCoq() {
        return coq;
    }

    @JsonProperty("coq")
    public void setCoq(Double coq) {
        this.coq = coq;
    }

    @JsonProperty("core")
    public Double getCore() {
        return core;
    }

    @JsonProperty("core")
    public void setCore(Double core) {
        this.core = core;
    }

    @JsonProperty("corechain")
    public Double getCorechain() {
        return corechain;
    }

    @JsonProperty("corechain")
    public void setCorechain(Double corechain) {
        this.corechain = corechain;
    }

    @JsonProperty("corgiai")
    public Double getCorgiai() {
        return corgiai;
    }

    @JsonProperty("corgiai")
    public void setCorgiai(Double corgiai) {
        this.corgiai = corgiai;
    }

    @JsonProperty("coti")
    public Double getCoti() {
        return coti;
    }

    @JsonProperty("coti")
    public void setCoti(Double coti) {
        this.coti = coti;
    }

    @JsonProperty("coval")
    public Double getCoval() {
        return coval;
    }

    @JsonProperty("coval")
    public void setCoval(Double coval) {
        this.coval = coval;
    }

    @JsonProperty("cqt")
    public Double getCqt() {
        return cqt;
    }

    @JsonProperty("cqt")
    public void setCqt(Double cqt) {
        this.cqt = cqt;
    }

    @JsonProperty("crc")
    public Double getCrc() {
        return crc;
    }

    @JsonProperty("crc")
    public void setCrc(Double crc) {
        this.crc = crc;
    }

    @JsonProperty("cro")
    public Double getCro() {
        return cro;
    }

    @JsonProperty("cro")
    public void setCro(Double cro) {
        this.cro = cro;
    }

    @JsonProperty("crpt")
    public Double getCrpt() {
        return crpt;
    }

    @JsonProperty("crpt")
    public void setCrpt(Double crpt) {
        this.crpt = crpt;
    }

    @JsonProperty("crv")
    public Double getCrv() {
        return crv;
    }

    @JsonProperty("crv")
    public void setCrv(Double crv) {
        this.crv = crv;
    }

    @JsonProperty("cspr")
    public Double getCspr() {
        return cspr;
    }

    @JsonProperty("cspr")
    public void setCspr(Double cspr) {
        this.cspr = cspr;
    }

    @JsonProperty("ctc")
    public Double getCtc() {
        return ctc;
    }

    @JsonProperty("ctc")
    public void setCtc(Double ctc) {
        this.ctc = ctc;
    }

    @JsonProperty("ctsi")
    public Double getCtsi() {
        return ctsi;
    }

    @JsonProperty("ctsi")
    public void setCtsi(Double ctsi) {
        this.ctsi = ctsi;
    }

    @JsonProperty("ctx")
    public Double getCtx() {
        return ctx;
    }

    @JsonProperty("ctx")
    public void setCtx(Double ctx) {
        this.ctx = ctx;
    }

    @JsonProperty("cuc")
    public Integer getCuc() {
        return cuc;
    }

    @JsonProperty("cuc")
    public void setCuc(Integer cuc) {
        this.cuc = cuc;
    }

    @JsonProperty("cup")
    public Double getCup() {
        return cup;
    }

    @JsonProperty("cup")
    public void setCup(Double cup) {
        this.cup = cup;
    }

    @JsonProperty("cvc")
    public Double getCvc() {
        return cvc;
    }

    @JsonProperty("cvc")
    public void setCvc(Double cvc) {
        this.cvc = cvc;
    }

    @JsonProperty("cve")
    public Double getCve() {
        return cve;
    }

    @JsonProperty("cve")
    public void setCve(Double cve) {
        this.cve = cve;
    }

    @JsonProperty("cvx")
    public Double getCvx() {
        return cvx;
    }

    @JsonProperty("cvx")
    public void setCvx(Double cvx) {
        this.cvx = cvx;
    }

    @JsonProperty("cwbtc")
    public Double getCwbtc() {
        return cwbtc;
    }

    @JsonProperty("cwbtc")
    public void setCwbtc(Double cwbtc) {
        this.cwbtc = cwbtc;
    }

    @JsonProperty("cyp")
    public Double getCyp() {
        return cyp;
    }

    @JsonProperty("cyp")
    public void setCyp(Double cyp) {
        this.cyp = cyp;
    }

    @JsonProperty("czk")
    public Double getCzk() {
        return czk;
    }

    @JsonProperty("czk")
    public void setCzk(Double czk) {
        this.czk = czk;
    }

    @JsonProperty("dag")
    public Double getDag() {
        return dag;
    }

    @JsonProperty("dag")
    public void setDag(Double dag) {
        this.dag = dag;
    }

    @JsonProperty("dai")
    public Double getDai() {
        return dai;
    }

    @JsonProperty("dai")
    public void setDai(Double dai) {
        this.dai = dai;
    }

    @JsonProperty("dao")
    public Double getDao() {
        return dao;
    }

    @JsonProperty("dao")
    public void setDao(Double dao) {
        this.dao = dao;
    }

    @JsonProperty("dar")
    public Double getDar() {
        return dar;
    }

    @JsonProperty("dar")
    public void setDar(Double dar) {
        this.dar = dar;
    }

    @JsonProperty("dash")
    public Double getDash() {
        return dash;
    }

    @JsonProperty("dash")
    public void setDash(Double dash) {
        this.dash = dash;
    }

    @JsonProperty("dcr")
    public Double getDcr() {
        return dcr;
    }

    @JsonProperty("dcr")
    public void setDcr(Double dcr) {
        this.dcr = dcr;
    }

    @JsonProperty("ddx")
    public Double getDdx() {
        return ddx;
    }

    @JsonProperty("ddx")
    public void setDdx(Double ddx) {
        this.ddx = ddx;
    }

    @JsonProperty("degen")
    public Double getDegen() {
        return degen;
    }

    @JsonProperty("degen")
    public void setDegen(Double degen) {
        this.degen = degen;
    }

    @JsonProperty("dem")
    public Double getDem() {
        return dem;
    }

    @JsonProperty("dem")
    public void setDem(Double dem) {
        this.dem = dem;
    }

    @JsonProperty("deso")
    public Double getDeso() {
        return deso;
    }

    @JsonProperty("deso")
    public void setDeso(Double deso) {
        this.deso = deso;
    }

    @JsonProperty("dexe")
    public Double getDexe() {
        return dexe;
    }

    @JsonProperty("dexe")
    public void setDexe(Double dexe) {
        this.dexe = dexe;
    }

    @JsonProperty("dext")
    public Double getDext() {
        return dext;
    }

    @JsonProperty("dext")
    public void setDext(Double dext) {
        this.dext = dext;
    }

    @JsonProperty("dfi")
    public Double getDfi() {
        return dfi;
    }

    @JsonProperty("dfi")
    public void setDfi(Double dfi) {
        this.dfi = dfi;
    }

    @JsonProperty("dgb")
    public Double getDgb() {
        return dgb;
    }

    @JsonProperty("dgb")
    public void setDgb(Double dgb) {
        this.dgb = dgb;
    }

    @JsonProperty("dia")
    public Double getDia() {
        return dia;
    }

    @JsonProperty("dia")
    public void setDia(Double dia) {
        this.dia = dia;
    }

    @JsonProperty("dimo")
    public Double getDimo() {
        return dimo;
    }

    @JsonProperty("dimo")
    public void setDimo(Double dimo) {
        this.dimo = dimo;
    }

    @JsonProperty("djf")
    public Double getDjf() {
        return djf;
    }

    @JsonProperty("djf")
    public void setDjf(Double djf) {
        this.djf = djf;
    }

    @JsonProperty("dkk")
    public Double getDkk() {
        return dkk;
    }

    @JsonProperty("dkk")
    public void setDkk(Double dkk) {
        this.dkk = dkk;
    }

    @JsonProperty("dnt")
    public Double getDnt() {
        return dnt;
    }

    @JsonProperty("dnt")
    public void setDnt(Double dnt) {
        this.dnt = dnt;
    }

    @JsonProperty("dog")
    public Double getDog() {
        return dog;
    }

    @JsonProperty("dog")
    public void setDog(Double dog) {
        this.dog = dog;
    }

    @JsonProperty("doge")
    public Double getDoge() {
        return doge;
    }

    @JsonProperty("doge")
    public void setDoge(Double doge) {
        this.doge = doge;
    }

    @JsonProperty("dop")
    public Double getDop() {
        return dop;
    }

    @JsonProperty("dop")
    public void setDop(Double dop) {
        this.dop = dop;
    }

    @JsonProperty("dora")
    public Double getDora() {
        return dora;
    }

    @JsonProperty("dora")
    public void setDora(Double dora) {
        this.dora = dora;
    }

    @JsonProperty("dot")
    public Double getDot() {
        return dot;
    }

    @JsonProperty("dot")
    public void setDot(Double dot) {
        this.dot = dot;
    }

    @JsonProperty("drep")
    public Double getDrep() {
        return drep;
    }

    @JsonProperty("drep")
    public void setDrep(Double drep) {
        this.drep = drep;
    }

    @JsonProperty("dydx")
    public Double getDydx() {
        return dydx;
    }

    @JsonProperty("dydx")
    public void setDydx(Double dydx) {
        this.dydx = dydx;
    }

    @JsonProperty("dym")
    public Double getDym() {
        return dym;
    }

    @JsonProperty("dym")
    public void setDym(Double dym) {
        this.dym = dym;
    }

    @JsonProperty("dyp")
    public Double getDyp() {
        return dyp;
    }

    @JsonProperty("dyp")
    public void setDyp(Double dyp) {
        this.dyp = dyp;
    }

    @JsonProperty("dzd")
    public Double getDzd() {
        return dzd;
    }

    @JsonProperty("dzd")
    public void setDzd(Double dzd) {
        this.dzd = dzd;
    }

    @JsonProperty("ecoin")
    public Double getEcoin() {
        return ecoin;
    }

    @JsonProperty("ecoin")
    public void setEcoin(Double ecoin) {
        this.ecoin = ecoin;
    }

    @JsonProperty("edu")
    public Double getEdu() {
        return edu;
    }

    @JsonProperty("edu")
    public void setEdu(Double edu) {
        this.edu = edu;
    }

    @JsonProperty("edum")
    public Double getEdum() {
        return edum;
    }

    @JsonProperty("edum")
    public void setEdum(Double edum) {
        this.edum = edum;
    }

    @JsonProperty("eek")
    public Double getEek() {
        return eek;
    }

    @JsonProperty("eek")
    public void setEek(Double eek) {
        this.eek = eek;
    }

    @JsonProperty("eeth")
    public Double getEeth() {
        return eeth;
    }

    @JsonProperty("eeth")
    public void setEeth(Double eeth) {
        this.eeth = eeth;
    }

    @JsonProperty("egld")
    public Double getEgld() {
        return egld;
    }

    @JsonProperty("egld")
    public void setEgld(Double egld) {
        this.egld = egld;
    }

    @JsonProperty("egp")
    public Double getEgp() {
        return egp;
    }

    @JsonProperty("egp")
    public void setEgp(Double egp) {
        this.egp = egp;
    }

    @JsonProperty("ela")
    public Double getEla() {
        return ela;
    }

    @JsonProperty("ela")
    public void setEla(Double ela) {
        this.ela = ela;
    }

    @JsonProperty("elf")
    public Double getElf() {
        return elf;
    }

    @JsonProperty("elf")
    public void setElf(Double elf) {
        this.elf = elf;
    }

    @JsonProperty("elg")
    public Double getElg() {
        return elg;
    }

    @JsonProperty("elg")
    public void setElg(Double elg) {
        this.elg = elg;
    }

    @JsonProperty("eml")
    public Double getEml() {
        return eml;
    }

    @JsonProperty("eml")
    public void setEml(Double eml) {
        this.eml = eml;
    }

    @JsonProperty("ena")
    public Double getEna() {
        return ena;
    }

    @JsonProperty("ena")
    public void setEna(Double ena) {
        this.ena = ena;
    }

    @JsonProperty("enj")
    public Double getEnj() {
        return enj;
    }

    @JsonProperty("enj")
    public void setEnj(Double enj) {
        this.enj = enj;
    }

    @JsonProperty("ens")
    public Double getEns() {
        return ens;
    }

    @JsonProperty("ens")
    public void setEns(Double ens) {
        this.ens = ens;
    }

    @JsonProperty("eos")
    public Double getEos() {
        return eos;
    }

    @JsonProperty("eos")
    public void setEos(Double eos) {
        this.eos = eos;
    }

    @JsonProperty("ern")
    public Integer getErn() {
        return ern;
    }

    @JsonProperty("ern")
    public void setErn(Integer ern) {
        this.ern = ern;
    }

    @JsonProperty("esp")
    public Double getEsp() {
        return esp;
    }

    @JsonProperty("esp")
    public void setEsp(Double esp) {
        this.esp = esp;
    }

    @JsonProperty("etb")
    public Double getEtb() {
        return etb;
    }

    @JsonProperty("etb")
    public void setEtb(Double etb) {
        this.etb = etb;
    }

    @JsonProperty("etc")
    public Double getEtc() {
        return etc;
    }

    @JsonProperty("etc")
    public void setEtc(Double etc) {
        this.etc = etc;
    }

    @JsonProperty("eth")
    public Double getEth() {
        return eth;
    }

    @JsonProperty("eth")
    public void setEth(Double eth) {
        this.eth = eth;
    }

    @JsonProperty("eth2")
    public Double getEth2() {
        return eth2;
    }

    @JsonProperty("eth2")
    public void setEth2(Double eth2) {
        this.eth2 = eth2;
    }

    @JsonProperty("ethdydx")
    public Double getEthdydx() {
        return ethdydx;
    }

    @JsonProperty("ethdydx")
    public void setEthdydx(Double ethdydx) {
        this.ethdydx = ethdydx;
    }

    @JsonProperty("ethfi")
    public Double getEthfi() {
        return ethfi;
    }

    @JsonProperty("ethfi")
    public void setEthfi(Double ethfi) {
        this.ethfi = ethfi;
    }

    @JsonProperty("ethw")
    public Double getEthw() {
        return ethw;
    }

    @JsonProperty("ethw")
    public void setEthw(Double ethw) {
        this.ethw = ethw;
    }

    @JsonProperty("ethx")
    public Double getEthx() {
        return ethx;
    }

    @JsonProperty("ethx")
    public void setEthx(Double ethx) {
        this.ethx = ethx;
    }

    @JsonProperty("eur")
    public Double getEur() {
        return eur;
    }

    @JsonProperty("eur")
    public void setEur(Double eur) {
        this.eur = eur;
    }

    @JsonProperty("eurc")
    public Double getEurc() {
        return eurc;
    }

    @JsonProperty("eurc")
    public void setEurc(Double eurc) {
        this.eurc = eurc;
    }

    @JsonProperty("euroc")
    public Double getEuroc() {
        return euroc;
    }

    @JsonProperty("euroc")
    public void setEuroc(Double euroc) {
        this.euroc = euroc;
    }

    @JsonProperty("ever")
    public Double getEver() {
        return ever;
    }

    @JsonProperty("ever")
    public void setEver(Double ever) {
        this.ever = ever;
    }

    @JsonProperty("ezeth")
    public Double getEzeth() {
        return ezeth;
    }

    @JsonProperty("ezeth")
    public void setEzeth(Double ezeth) {
        this.ezeth = ezeth;
    }

    @JsonProperty("farm")
    public Double getFarm() {
        return farm;
    }

    @JsonProperty("farm")
    public void setFarm(Double farm) {
        this.farm = farm;
    }

    @JsonProperty("fdusd")
    public Double getFdusd() {
        return fdusd;
    }

    @JsonProperty("fdusd")
    public void setFdusd(Double fdusd) {
        this.fdusd = fdusd;
    }

    @JsonProperty("fei")
    public Double getFei() {
        return fei;
    }

    @JsonProperty("fei")
    public void setFei(Double fei) {
        this.fei = fei;
    }

    @JsonProperty("fet")
    public Double getFet() {
        return fet;
    }

    @JsonProperty("fet")
    public void setFet(Double fet) {
        this.fet = fet;
    }

    @JsonProperty("fida")
    public Double getFida() {
        return fida;
    }

    @JsonProperty("fida")
    public void setFida(Double fida) {
        this.fida = fida;
    }

    @JsonProperty("fil")
    public Double getFil() {
        return fil;
    }

    @JsonProperty("fil")
    public void setFil(Double fil) {
        this.fil = fil;
    }

    @JsonProperty("fim")
    public Double getFim() {
        return fim;
    }

    @JsonProperty("fim")
    public void setFim(Double fim) {
        this.fim = fim;
    }

    @JsonProperty("fis")
    public Double getFis() {
        return fis;
    }

    @JsonProperty("fis")
    public void setFis(Double fis) {
        this.fis = fis;
    }

    @JsonProperty("fjd")
    public Double getFjd() {
        return fjd;
    }

    @JsonProperty("fjd")
    public void setFjd(Double fjd) {
        this.fjd = fjd;
    }

    @JsonProperty("fkp")
    public Double getFkp() {
        return fkp;
    }

    @JsonProperty("fkp")
    public void setFkp(Double fkp) {
        this.fkp = fkp;
    }

    @JsonProperty("floki")
    public Double getFloki() {
        return floki;
    }

    @JsonProperty("floki")
    public void setFloki(Double floki) {
        this.floki = floki;
    }

    @JsonProperty("flow")
    public Double getFlow() {
        return flow;
    }

    @JsonProperty("flow")
    public void setFlow(Double flow) {
        this.flow = flow;
    }

    @JsonProperty("flr")
    public Double getFlr() {
        return flr;
    }

    @JsonProperty("flr")
    public void setFlr(Double flr) {
        this.flr = flr;
    }

    @JsonProperty("flux")
    public Double getFlux() {
        return flux;
    }

    @JsonProperty("flux")
    public void setFlux(Double flux) {
        this.flux = flux;
    }

    @JsonProperty("fnsa")
    public Double getFnsa() {
        return fnsa;
    }

    @JsonProperty("fnsa")
    public void setFnsa(Double fnsa) {
        this.fnsa = fnsa;
    }

    @JsonProperty("fort")
    public Double getFort() {
        return fort;
    }

    @JsonProperty("fort")
    public void setFort(Double fort) {
        this.fort = fort;
    }

    @JsonProperty("forth")
    public Double getForth() {
        return forth;
    }

    @JsonProperty("forth")
    public void setForth(Double forth) {
        this.forth = forth;
    }

    @JsonProperty("fox")
    public Double getFox() {
        return fox;
    }

    @JsonProperty("fox")
    public void setFox(Double fox) {
        this.fox = fox;
    }

    @JsonProperty("frax")
    public Double getFrax() {
        return frax;
    }

    @JsonProperty("frax")
    public void setFrax(Double frax) {
        this.frax = frax;
    }

    @JsonProperty("frf")
    public Double getFrf() {
        return frf;
    }

    @JsonProperty("frf")
    public void setFrf(Double frf) {
        this.frf = frf;
    }

    @JsonProperty("friend")
    public Double getFriend() {
        return friend;
    }

    @JsonProperty("friend")
    public void setFriend(Double friend) {
        this.friend = friend;
    }

    @JsonProperty("frxeth")
    public Double getFrxeth() {
        return frxeth;
    }

    @JsonProperty("frxeth")
    public void setFrxeth(Double frxeth) {
        this.frxeth = frxeth;
    }

    @JsonProperty("ftm")
    public Double getFtm() {
        return ftm;
    }

    @JsonProperty("ftm")
    public void setFtm(Double ftm) {
        this.ftm = ftm;
    }

    @JsonProperty("ftn")
    public Double getFtn() {
        return ftn;
    }

    @JsonProperty("ftn")
    public void setFtn(Double ftn) {
        this.ftn = ftn;
    }

    @JsonProperty("ftt")
    public Double getFtt() {
        return ftt;
    }

    @JsonProperty("ftt")
    public void setFtt(Double ftt) {
        this.ftt = ftt;
    }

    @JsonProperty("fx")
    public Double getFx() {
        return fx;
    }

    @JsonProperty("fx")
    public void setFx(Double fx) {
        this.fx = fx;
    }

    @JsonProperty("fxs")
    public Double getFxs() {
        return fxs;
    }

    @JsonProperty("fxs")
    public void setFxs(Double fxs) {
        this.fxs = fxs;
    }

    @JsonProperty("g")
    public Double getG() {
        return g;
    }

    @JsonProperty("g")
    public void setG(Double g) {
        this.g = g;
    }

    @JsonProperty("gaj")
    public Double getGaj() {
        return gaj;
    }

    @JsonProperty("gaj")
    public void setGaj(Double gaj) {
        this.gaj = gaj;
    }

    @JsonProperty("gal")
    public Double getGal() {
        return gal;
    }

    @JsonProperty("gal")
    public void setGal(Double gal) {
        this.gal = gal;
    }

    @JsonProperty("gala")
    public Double getGala() {
        return gala;
    }

    @JsonProperty("gala")
    public void setGala(Double gala) {
        this.gala = gala;
    }

    @JsonProperty("gas")
    public Double getGas() {
        return gas;
    }

    @JsonProperty("gas")
    public void setGas(Double gas) {
        this.gas = gas;
    }

    @JsonProperty("gbp")
    public Double getGbp() {
        return gbp;
    }

    @JsonProperty("gbp")
    public void setGbp(Double gbp) {
        this.gbp = gbp;
    }

    @JsonProperty("gel")
    public Double getGel() {
        return gel;
    }

    @JsonProperty("gel")
    public void setGel(Double gel) {
        this.gel = gel;
    }

    @JsonProperty("gf")
    public Double getGf() {
        return gf;
    }

    @JsonProperty("gf")
    public void setGf(Double gf) {
        this.gf = gf;
    }

    @JsonProperty("gfi")
    public Double getGfi() {
        return gfi;
    }

    @JsonProperty("gfi")
    public void setGfi(Double gfi) {
        this.gfi = gfi;
    }

    @JsonProperty("ggp")
    public Double getGgp() {
        return ggp;
    }

    @JsonProperty("ggp")
    public void setGgp(Double ggp) {
        this.ggp = ggp;
    }

    @JsonProperty("ghc")
    public Double getGhc() {
        return ghc;
    }

    @JsonProperty("ghc")
    public void setGhc(Double ghc) {
        this.ghc = ghc;
    }

    @JsonProperty("ghs")
    public Double getGhs() {
        return ghs;
    }

    @JsonProperty("ghs")
    public void setGhs(Double ghs) {
        this.ghs = ghs;
    }

    @JsonProperty("ghst")
    public Double getGhst() {
        return ghst;
    }

    @JsonProperty("ghst")
    public void setGhst(Double ghst) {
        this.ghst = ghst;
    }

    @JsonProperty("gip")
    public Double getGip() {
        return gip;
    }

    @JsonProperty("gip")
    public void setGip(Double gip) {
        this.gip = gip;
    }

    @JsonProperty("glm")
    public Double getGlm() {
        return glm;
    }

    @JsonProperty("glm")
    public void setGlm(Double glm) {
        this.glm = glm;
    }

    @JsonProperty("glmr")
    public Double getGlmr() {
        return glmr;
    }

    @JsonProperty("glmr")
    public void setGlmr(Double glmr) {
        this.glmr = glmr;
    }

    @JsonProperty("gmd")
    public Double getGmd() {
        return gmd;
    }

    @JsonProperty("gmd")
    public void setGmd(Double gmd) {
        this.gmd = gmd;
    }

    @JsonProperty("gmt")
    public Double getGmt() {
        return gmt;
    }

    @JsonProperty("gmt")
    public void setGmt(Double gmt) {
        this.gmt = gmt;
    }

    @JsonProperty("gmx")
    public Double getGmx() {
        return gmx;
    }

    @JsonProperty("gmx")
    public void setGmx(Double gmx) {
        this.gmx = gmx;
    }

    @JsonProperty("gnf")
    public Double getGnf() {
        return gnf;
    }

    @JsonProperty("gnf")
    public void setGnf(Double gnf) {
        this.gnf = gnf;
    }

    @JsonProperty("gno")
    public Double getGno() {
        return gno;
    }

    @JsonProperty("gno")
    public void setGno(Double gno) {
        this.gno = gno;
    }

    @JsonProperty("gns")
    public Double getGns() {
        return gns;
    }

    @JsonProperty("gns")
    public void setGns(Double gns) {
        this.gns = gns;
    }

    @JsonProperty("gnt")
    public Double getGnt() {
        return gnt;
    }

    @JsonProperty("gnt")
    public void setGnt(Double gnt) {
        this.gnt = gnt;
    }

    @JsonProperty("gods")
    public Double getGods() {
        return gods;
    }

    @JsonProperty("gods")
    public void setGods(Double gods) {
        this.gods = gods;
    }

    @JsonProperty("grd")
    public Double getGrd() {
        return grd;
    }

    @JsonProperty("grd")
    public void setGrd(Double grd) {
        this.grd = grd;
    }

    @JsonProperty("grin")
    public Double getGrin() {
        return grin;
    }

    @JsonProperty("grin")
    public void setGrin(Double grin) {
        this.grin = grin;
    }

    @JsonProperty("grt")
    public Double getGrt() {
        return grt;
    }

    @JsonProperty("grt")
    public void setGrt(Double grt) {
        this.grt = grt;
    }

    @JsonProperty("gst")
    public Double getGst() {
        return gst;
    }

    @JsonProperty("gst")
    public void setGst(Double gst) {
        this.gst = gst;
    }

    @JsonProperty("gt")
    public Double getGt() {
        return gt;
    }

    @JsonProperty("gt")
    public void setGt(Double gt) {
        this.gt = gt;
    }

    @JsonProperty("gtc")
    public Double getGtc() {
        return gtc;
    }

    @JsonProperty("gtc")
    public void setGtc(Double gtc) {
        this.gtc = gtc;
    }

    @JsonProperty("gtq")
    public Double getGtq() {
        return gtq;
    }

    @JsonProperty("gtq")
    public void setGtq(Double gtq) {
        this.gtq = gtq;
    }

    @JsonProperty("gusd")
    public Double getGusd() {
        return gusd;
    }

    @JsonProperty("gusd")
    public void setGusd(Double gusd) {
        this.gusd = gusd;
    }

    @JsonProperty("gxc")
    public Double getGxc() {
        return gxc;
    }

    @JsonProperty("gxc")
    public void setGxc(Double gxc) {
        this.gxc = gxc;
    }

    @JsonProperty("gyd")
    public Double getGyd() {
        return gyd;
    }

    @JsonProperty("gyd")
    public void setGyd(Double gyd) {
        this.gyd = gyd;
    }

    @JsonProperty("gyen")
    public Double getGyen() {
        return gyen;
    }

    @JsonProperty("gyen")
    public void setGyen(Double gyen) {
        this.gyen = gyen;
    }

    @JsonProperty("h2o")
    public Double getH2o() {
        return h2o;
    }

    @JsonProperty("h2o")
    public void setH2o(Double h2o) {
        this.h2o = h2o;
    }

    @JsonProperty("hbar")
    public Double getHbar() {
        return hbar;
    }

    @JsonProperty("hbar")
    public void setHbar(Double hbar) {
        this.hbar = hbar;
    }

    @JsonProperty("hbtc")
    public Double getHbtc() {
        return hbtc;
    }

    @JsonProperty("hbtc")
    public void setHbtc(Double hbtc) {
        this.hbtc = hbtc;
    }

    @JsonProperty("hft")
    public Double getHft() {
        return hft;
    }

    @JsonProperty("hft")
    public void setHft(Double hft) {
        this.hft = hft;
    }

    @JsonProperty("high")
    public Double getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(Double high) {
        this.high = high;
    }

    @JsonProperty("hkd")
    public Double getHkd() {
        return hkd;
    }

    @JsonProperty("hkd")
    public void setHkd(Double hkd) {
        this.hkd = hkd;
    }

    @JsonProperty("hnl")
    public Double getHnl() {
        return hnl;
    }

    @JsonProperty("hnl")
    public void setHnl(Double hnl) {
        this.hnl = hnl;
    }

    @JsonProperty("hnt")
    public Double getHnt() {
        return hnt;
    }

    @JsonProperty("hnt")
    public void setHnt(Double hnt) {
        this.hnt = hnt;
    }

    @JsonProperty("honey")
    public Double getHoney() {
        return honey;
    }

    @JsonProperty("honey")
    public void setHoney(Double honey) {
        this.honey = honey;
    }

    @JsonProperty("hopr")
    public Double getHopr() {
        return hopr;
    }

    @JsonProperty("hopr")
    public void setHopr(Double hopr) {
        this.hopr = hopr;
    }

    @JsonProperty("hot")
    public Double getHot() {
        return hot;
    }

    @JsonProperty("hot")
    public void setHot(Double hot) {
        this.hot = hot;
    }

    @JsonProperty("hrk")
    public Double getHrk() {
        return hrk;
    }

    @JsonProperty("hrk")
    public void setHrk(Double hrk) {
        this.hrk = hrk;
    }

    @JsonProperty("ht")
    public Double getHt() {
        return ht;
    }

    @JsonProperty("ht")
    public void setHt(Double ht) {
        this.ht = ht;
    }

    @JsonProperty("htg")
    public Double getHtg() {
        return htg;
    }

    @JsonProperty("htg")
    public void setHtg(Double htg) {
        this.htg = htg;
    }

    @JsonProperty("huf")
    public Double getHuf() {
        return huf;
    }

    @JsonProperty("huf")
    public void setHuf(Double huf) {
        this.huf = huf;
    }

    @JsonProperty("icp")
    public Double getIcp() {
        return icp;
    }

    @JsonProperty("icp")
    public void setIcp(Double icp) {
        this.icp = icp;
    }

    @JsonProperty("icx")
    public Double getIcx() {
        return icx;
    }

    @JsonProperty("icx")
    public void setIcx(Double icx) {
        this.icx = icx;
    }

    @JsonProperty("id")
    public Double getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Double id) {
        this.id = id;
    }

    @JsonProperty("idex")
    public Double getIdex() {
        return idex;
    }

    @JsonProperty("idex")
    public void setIdex(Double idex) {
        this.idex = idex;
    }

    @JsonProperty("idr")
    public Double getIdr() {
        return idr;
    }

    @JsonProperty("idr")
    public void setIdr(Double idr) {
        this.idr = idr;
    }

    @JsonProperty("iep")
    public Double getIep() {
        return iep;
    }

    @JsonProperty("iep")
    public void setIep(Double iep) {
        this.iep = iep;
    }

    @JsonProperty("ils")
    public Double getIls() {
        return ils;
    }

    @JsonProperty("ils")
    public void setIls(Double ils) {
        this.ils = ils;
    }

    @JsonProperty("ilv")
    public Double getIlv() {
        return ilv;
    }

    @JsonProperty("ilv")
    public void setIlv(Double ilv) {
        this.ilv = ilv;
    }

    @JsonProperty("imp")
    public Double getImp() {
        return imp;
    }

    @JsonProperty("imp")
    public void setImp(Double imp) {
        this.imp = imp;
    }

    @JsonProperty("imx")
    public Double getImx() {
        return imx;
    }

    @JsonProperty("imx")
    public void setImx(Double imx) {
        this.imx = imx;
    }

    @JsonProperty("index")
    public Double getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Double index) {
        this.index = index;
    }

    @JsonProperty("inj")
    public Double getInj() {
        return inj;
    }

    @JsonProperty("inj")
    public void setInj(Double inj) {
        this.inj = inj;
    }

    @JsonProperty("inr")
    public Double getInr() {
        return inr;
    }

    @JsonProperty("inr")
    public void setInr(Double inr) {
        this.inr = inr;
    }

    @JsonProperty("inv")
    public Double getInv() {
        return inv;
    }

    @JsonProperty("inv")
    public void setInv(Double inv) {
        this.inv = inv;
    }

    @JsonProperty("io")
    public Double getIo() {
        return io;
    }

    @JsonProperty("io")
    public void setIo(Double io) {
        this.io = io;
    }

    @JsonProperty("iost")
    public Double getIost() {
        return iost;
    }

    @JsonProperty("iost")
    public void setIost(Double iost) {
        this.iost = iost;
    }

    @JsonProperty("iota")
    public Double getIota() {
        return iota;
    }

    @JsonProperty("iota")
    public void setIota(Double iota) {
        this.iota = iota;
    }

    @JsonProperty("iotx")
    public Double getIotx() {
        return iotx;
    }

    @JsonProperty("iotx")
    public void setIotx(Double iotx) {
        this.iotx = iotx;
    }

    @JsonProperty("iq")
    public Double getIq() {
        return iq;
    }

    @JsonProperty("iq")
    public void setIq(Double iq) {
        this.iq = iq;
    }

    @JsonProperty("iqd")
    public Double getIqd() {
        return iqd;
    }

    @JsonProperty("iqd")
    public void setIqd(Double iqd) {
        this.iqd = iqd;
    }

    @JsonProperty("irr")
    public Double getIrr() {
        return irr;
    }

    @JsonProperty("irr")
    public void setIrr(Double irr) {
        this.irr = irr;
    }

    @JsonProperty("isk")
    public Double getIsk() {
        return isk;
    }

    @JsonProperty("isk")
    public void setIsk(Double isk) {
        this.isk = isk;
    }

    @JsonProperty("itl")
    public Double getItl() {
        return itl;
    }

    @JsonProperty("itl")
    public void setItl(Double itl) {
        this.itl = itl;
    }

    @JsonProperty("jasmy")
    public Double getJasmy() {
        return jasmy;
    }

    @JsonProperty("jasmy")
    public void setJasmy(Double jasmy) {
        this.jasmy = jasmy;
    }

    @JsonProperty("jep")
    public Double getJep() {
        return jep;
    }

    @JsonProperty("jep")
    public void setJep(Double jep) {
        this.jep = jep;
    }

    @JsonProperty("jmd")
    public Double getJmd() {
        return jmd;
    }

    @JsonProperty("jmd")
    public void setJmd(Double jmd) {
        this.jmd = jmd;
    }

    @JsonProperty("jod")
    public Double getJod() {
        return jod;
    }

    @JsonProperty("jod")
    public void setJod(Double jod) {
        this.jod = jod;
    }

    @JsonProperty("joe")
    public Double getJoe() {
        return joe;
    }

    @JsonProperty("joe")
    public void setJoe(Double joe) {
        this.joe = joe;
    }

    @JsonProperty("jpy")
    public Double getJpy() {
        return jpy;
    }

    @JsonProperty("jpy")
    public void setJpy(Double jpy) {
        this.jpy = jpy;
    }

    @JsonProperty("jst")
    public Double getJst() {
        return jst;
    }

    @JsonProperty("jst")
    public void setJst(Double jst) {
        this.jst = jst;
    }

    @JsonProperty("jto")
    public Double getJto() {
        return jto;
    }

    @JsonProperty("jto")
    public void setJto(Double jto) {
        this.jto = jto;
    }

    @JsonProperty("jup")
    public Double getJup() {
        return jup;
    }

    @JsonProperty("jup")
    public void setJup(Double jup) {
        this.jup = jup;
    }

    @JsonProperty("karrat")
    public Double getKarrat() {
        return karrat;
    }

    @JsonProperty("karrat")
    public void setKarrat(Double karrat) {
        this.karrat = karrat;
    }

    @JsonProperty("kas")
    public Double getKas() {
        return kas;
    }

    @JsonProperty("kas")
    public void setKas(Double kas) {
        this.kas = kas;
    }

    @JsonProperty("kava")
    public Double getKava() {
        return kava;
    }

    @JsonProperty("kava")
    public void setKava(Double kava) {
        this.kava = kava;
    }

    @JsonProperty("kcs")
    public Double getKcs() {
        return kcs;
    }

    @JsonProperty("kcs")
    public void setKcs(Double kcs) {
        this.kcs = kcs;
    }

    @JsonProperty("kda")
    public Double getKda() {
        return kda;
    }

    @JsonProperty("kda")
    public void setKda(Double kda) {
        this.kda = kda;
    }

    @JsonProperty("keep")
    public Double getKeep() {
        return keep;
    }

    @JsonProperty("keep")
    public void setKeep(Double keep) {
        this.keep = keep;
    }

    @JsonProperty("kes")
    public Double getKes() {
        return kes;
    }

    @JsonProperty("kes")
    public void setKes(Double kes) {
        this.kes = kes;
    }

    @JsonProperty("kgs")
    public Double getKgs() {
        return kgs;
    }

    @JsonProperty("kgs")
    public void setKgs(Double kgs) {
        this.kgs = kgs;
    }

    @JsonProperty("khr")
    public Double getKhr() {
        return khr;
    }

    @JsonProperty("khr")
    public void setKhr(Double khr) {
        this.khr = khr;
    }

    @JsonProperty("klay")
    public Double getKlay() {
        return klay;
    }

    @JsonProperty("klay")
    public void setKlay(Double klay) {
        this.klay = klay;
    }

    @JsonProperty("kmf")
    public Double getKmf() {
        return kmf;
    }

    @JsonProperty("kmf")
    public void setKmf(Double kmf) {
        this.kmf = kmf;
    }

    @JsonProperty("kmno")
    public Double getKmno() {
        return kmno;
    }

    @JsonProperty("kmno")
    public void setKmno(Double kmno) {
        this.kmno = kmno;
    }

    @JsonProperty("knc")
    public Double getKnc() {
        return knc;
    }

    @JsonProperty("knc")
    public void setKnc(Double knc) {
        this.knc = knc;
    }

    @JsonProperty("kpw")
    public Double getKpw() {
        return kpw;
    }

    @JsonProperty("kpw")
    public void setKpw(Double kpw) {
        this.kpw = kpw;
    }

    @JsonProperty("krl")
    public Double getKrl() {
        return krl;
    }

    @JsonProperty("krl")
    public void setKrl(Double krl) {
        this.krl = krl;
    }

    @JsonProperty("krw")
    public Double getKrw() {
        return krw;
    }

    @JsonProperty("krw")
    public void setKrw(Double krw) {
        this.krw = krw;
    }

    @JsonProperty("ksm")
    public Double getKsm() {
        return ksm;
    }

    @JsonProperty("ksm")
    public void setKsm(Double ksm) {
        this.ksm = ksm;
    }

    @JsonProperty("kub")
    public Double getKub() {
        return kub;
    }

    @JsonProperty("kub")
    public void setKub(Double kub) {
        this.kub = kub;
    }

    @JsonProperty("kuji")
    public Double getKuji() {
        return kuji;
    }

    @JsonProperty("kuji")
    public void setKuji(Double kuji) {
        this.kuji = kuji;
    }

    @JsonProperty("kwd")
    public Double getKwd() {
        return kwd;
    }

    @JsonProperty("kwd")
    public void setKwd(Double kwd) {
        this.kwd = kwd;
    }

    @JsonProperty("kyd")
    public Double getKyd() {
        return kyd;
    }

    @JsonProperty("kyd")
    public void setKyd(Double kyd) {
        this.kyd = kyd;
    }

    @JsonProperty("kzt")
    public Double getKzt() {
        return kzt;
    }

    @JsonProperty("kzt")
    public void setKzt(Double kzt) {
        this.kzt = kzt;
    }

    @JsonProperty("ladys")
    public Double getLadys() {
        return ladys;
    }

    @JsonProperty("ladys")
    public void setLadys(Double ladys) {
        this.ladys = ladys;
    }

    @JsonProperty("lak")
    public Double getLak() {
        return lak;
    }

    @JsonProperty("lak")
    public void setLak(Double lak) {
        this.lak = lak;
    }

    @JsonProperty("lbp")
    public Double getLbp() {
        return lbp;
    }

    @JsonProperty("lbp")
    public void setLbp(Double lbp) {
        this.lbp = lbp;
    }

    @JsonProperty("lcx")
    public Double getLcx() {
        return lcx;
    }

    @JsonProperty("lcx")
    public void setLcx(Double lcx) {
        this.lcx = lcx;
    }

    @JsonProperty("ldo")
    public Double getLdo() {
        return ldo;
    }

    @JsonProperty("ldo")
    public void setLdo(Double ldo) {
        this.ldo = ldo;
    }

    @JsonProperty("leo")
    public Double getLeo() {
        return leo;
    }

    @JsonProperty("leo")
    public void setLeo(Double leo) {
        this.leo = leo;
    }

    @JsonProperty("lft")
    public Double getLft() {
        return lft;
    }

    @JsonProperty("lft")
    public void setLft(Double lft) {
        this.lft = lft;
    }

    @JsonProperty("link")
    public Double getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(Double link) {
        this.link = link;
    }

    @JsonProperty("lit")
    public Double getLit() {
        return lit;
    }

    @JsonProperty("lit")
    public void setLit(Double lit) {
        this.lit = lit;
    }

    @JsonProperty("lkr")
    public Double getLkr() {
        return lkr;
    }

    @JsonProperty("lkr")
    public void setLkr(Double lkr) {
        this.lkr = lkr;
    }

    @JsonProperty("loka")
    public Double getLoka() {
        return loka;
    }

    @JsonProperty("loka")
    public void setLoka(Double loka) {
        this.loka = loka;
    }

    @JsonProperty("loom")
    public Double getLoom() {
        return loom;
    }

    @JsonProperty("loom")
    public void setLoom(Double loom) {
        this.loom = loom;
    }

    @JsonProperty("lpt")
    public Double getLpt() {
        return lpt;
    }

    @JsonProperty("lpt")
    public void setLpt(Double lpt) {
        this.lpt = lpt;
    }

    @JsonProperty("lqty")
    public Double getLqty() {
        return lqty;
    }

    @JsonProperty("lqty")
    public void setLqty(Double lqty) {
        this.lqty = lqty;
    }

    @JsonProperty("lrc")
    public Double getLrc() {
        return lrc;
    }

    @JsonProperty("lrc")
    public void setLrc(Double lrc) {
        this.lrc = lrc;
    }

    @JsonProperty("lrd")
    public Double getLrd() {
        return lrd;
    }

    @JsonProperty("lrd")
    public void setLrd(Double lrd) {
        this.lrd = lrd;
    }

    @JsonProperty("lrds")
    public Double getLrds() {
        return lrds;
    }

    @JsonProperty("lrds")
    public void setLrds(Double lrds) {
        this.lrds = lrds;
    }

    @JsonProperty("lsd")
    public Double getLsd() {
        return lsd;
    }

    @JsonProperty("lsd")
    public void setLsd(Double lsd) {
        this.lsd = lsd;
    }

    @JsonProperty("lseth")
    public Double getLseth() {
        return lseth;
    }

    @JsonProperty("lseth")
    public void setLseth(Double lseth) {
        this.lseth = lseth;
    }

    @JsonProperty("lsk")
    public Double getLsk() {
        return lsk;
    }

    @JsonProperty("lsk")
    public void setLsk(Double lsk) {
        this.lsk = lsk;
    }

    @JsonProperty("lsl")
    public Double getLsl() {
        return lsl;
    }

    @JsonProperty("lsl")
    public void setLsl(Double lsl) {
        this.lsl = lsl;
    }

    @JsonProperty("ltc")
    public Double getLtc() {
        return ltc;
    }

    @JsonProperty("ltc")
    public void setLtc(Double ltc) {
        this.ltc = ltc;
    }

    @JsonProperty("ltl")
    public Double getLtl() {
        return ltl;
    }

    @JsonProperty("ltl")
    public void setLtl(Double ltl) {
        this.ltl = ltl;
    }

    @JsonProperty("luf")
    public Double getLuf() {
        return luf;
    }

    @JsonProperty("luf")
    public void setLuf(Double luf) {
        this.luf = luf;
    }

    @JsonProperty("luna")
    public Double getLuna() {
        return luna;
    }

    @JsonProperty("luna")
    public void setLuna(Double luna) {
        this.luna = luna;
    }

    @JsonProperty("lunc")
    public Double getLunc() {
        return lunc;
    }

    @JsonProperty("lunc")
    public void setLunc(Double lunc) {
        this.lunc = lunc;
    }

    @JsonProperty("lusd")
    public Double getLusd() {
        return lusd;
    }

    @JsonProperty("lusd")
    public void setLusd(Double lusd) {
        this.lusd = lusd;
    }

    @JsonProperty("lvl")
    public Double getLvl() {
        return lvl;
    }

    @JsonProperty("lvl")
    public void setLvl(Double lvl) {
        this.lvl = lvl;
    }

    @JsonProperty("lyd")
    public Double getLyd() {
        return lyd;
    }

    @JsonProperty("lyd")
    public void setLyd(Double lyd) {
        this.lyd = lyd;
    }

    @JsonProperty("lyx")
    public Double getLyx() {
        return lyx;
    }

    @JsonProperty("lyx")
    public void setLyx(Double lyx) {
        this.lyx = lyx;
    }

    @JsonProperty("lyxe")
    public Double getLyxe() {
        return lyxe;
    }

    @JsonProperty("lyxe")
    public void setLyxe(Double lyxe) {
        this.lyxe = lyxe;
    }

    @JsonProperty("mad")
    public Double getMad() {
        return mad;
    }

    @JsonProperty("mad")
    public void setMad(Double mad) {
        this.mad = mad;
    }

    @JsonProperty("maga")
    public Double getMaga() {
        return maga;
    }

    @JsonProperty("maga")
    public void setMaga(Double maga) {
        this.maga = maga;
    }

    @JsonProperty("magic")
    public Double getMagic() {
        return magic;
    }

    @JsonProperty("magic")
    public void setMagic(Double magic) {
        this.magic = magic;
    }

    @JsonProperty("mana")
    public Double getMana() {
        return mana;
    }

    @JsonProperty("mana")
    public void setMana(Double mana) {
        this.mana = mana;
    }

    @JsonProperty("manta")
    public Double getManta() {
        return manta;
    }

    @JsonProperty("manta")
    public void setManta(Double manta) {
        this.manta = manta;
    }

    @JsonProperty("mask")
    public Double getMask() {
        return mask;
    }

    @JsonProperty("mask")
    public void setMask(Double mask) {
        this.mask = mask;
    }

    @JsonProperty("math")
    public Double getMath() {
        return math;
    }

    @JsonProperty("math")
    public void setMath(Double math) {
        this.math = math;
    }

    @JsonProperty("matic")
    public Double getMatic() {
        return matic;
    }

    @JsonProperty("matic")
    public void setMatic(Double matic) {
        this.matic = matic;
    }

    @JsonProperty("mav")
    public Double getMav() {
        return mav;
    }

    @JsonProperty("mav")
    public void setMav(Double mav) {
        this.mav = mav;
    }

    @JsonProperty("mavia")
    public Double getMavia() {
        return mavia;
    }

    @JsonProperty("mavia")
    public void setMavia(Double mavia) {
        this.mavia = mavia;
    }

    @JsonProperty("mbx")
    public Double getMbx() {
        return mbx;
    }

    @JsonProperty("mbx")
    public void setMbx(Double mbx) {
        this.mbx = mbx;
    }

    @JsonProperty("mco2")
    public Double getMco2() {
        return mco2;
    }

    @JsonProperty("mco2")
    public void setMco2(Double mco2) {
        this.mco2 = mco2;
    }

    @JsonProperty("mcoin")
    public Double getMcoin() {
        return mcoin;
    }

    @JsonProperty("mcoin")
    public void setMcoin(Double mcoin) {
        this.mcoin = mcoin;
    }

    @JsonProperty("mdl")
    public Double getMdl() {
        return mdl;
    }

    @JsonProperty("mdl")
    public void setMdl(Double mdl) {
        this.mdl = mdl;
    }

    @JsonProperty("mdt")
    public Double getMdt() {
        return mdt;
    }

    @JsonProperty("mdt")
    public void setMdt(Double mdt) {
        this.mdt = mdt;
    }

    @JsonProperty("media")
    public Double getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(Double media) {
        this.media = media;
    }

    @JsonProperty("meme")
    public Double getMeme() {
        return meme;
    }

    @JsonProperty("meme")
    public void setMeme(Double meme) {
        this.meme = meme;
    }

    @JsonProperty("memes")
    public Double getMemes() {
        return memes;
    }

    @JsonProperty("memes")
    public void setMemes(Double memes) {
        this.memes = memes;
    }

    @JsonProperty("meth")
    public Double getMeth() {
        return meth;
    }

    @JsonProperty("meth")
    public void setMeth(Double meth) {
        this.meth = meth;
    }

    @JsonProperty("metis")
    public Double getMetis() {
        return metis;
    }

    @JsonProperty("metis")
    public void setMetis(Double metis) {
        this.metis = metis;
    }

    @JsonProperty("mew")
    public Double getMew() {
        return mew;
    }

    @JsonProperty("mew")
    public void setMew(Double mew) {
        this.mew = mew;
    }

    @JsonProperty("mga")
    public Double getMga() {
        return mga;
    }

    @JsonProperty("mga")
    public void setMga(Double mga) {
        this.mga = mga;
    }

    @JsonProperty("mgf")
    public Double getMgf() {
        return mgf;
    }

    @JsonProperty("mgf")
    public void setMgf(Double mgf) {
        this.mgf = mgf;
    }

    @JsonProperty("mina")
    public Double getMina() {
        return mina;
    }

    @JsonProperty("mina")
    public void setMina(Double mina) {
        this.mina = mina;
    }

    @JsonProperty("mir")
    public Double getMir() {
        return mir;
    }

    @JsonProperty("mir")
    public void setMir(Double mir) {
        this.mir = mir;
    }

    @JsonProperty("mkd")
    public Double getMkd() {
        return mkd;
    }

    @JsonProperty("mkd")
    public void setMkd(Double mkd) {
        this.mkd = mkd;
    }

    @JsonProperty("mkr")
    public Double getMkr() {
        return mkr;
    }

    @JsonProperty("mkr")
    public void setMkr(Double mkr) {
        this.mkr = mkr;
    }

    @JsonProperty("mkusd")
    public Double getMkusd() {
        return mkusd;
    }

    @JsonProperty("mkusd")
    public void setMkusd(Double mkusd) {
        this.mkusd = mkusd;
    }

    @JsonProperty("mln")
    public Double getMln() {
        return mln;
    }

    @JsonProperty("mln")
    public void setMln(Double mln) {
        this.mln = mln;
    }

    @JsonProperty("mmk")
    public Double getMmk() {
        return mmk;
    }

    @JsonProperty("mmk")
    public void setMmk(Double mmk) {
        this.mmk = mmk;
    }

    @JsonProperty("mmx")
    public Double getMmx() {
        return mmx;
    }

    @JsonProperty("mmx")
    public void setMmx(Double mmx) {
        this.mmx = mmx;
    }

    @JsonProperty("mnde")
    public Double getMnde() {
        return mnde;
    }

    @JsonProperty("mnde")
    public void setMnde(Double mnde) {
        this.mnde = mnde;
    }

    @JsonProperty("mnt")
    public Double getMnt() {
        return mnt;
    }

    @JsonProperty("mnt")
    public void setMnt(Double mnt) {
        this.mnt = mnt;
    }

    @JsonProperty("mobile")
    public Double getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(Double mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("mog")
    public Double getMog() {
        return mog;
    }

    @JsonProperty("mog")
    public void setMog(Double mog) {
        this.mog = mog;
    }

    @JsonProperty("mona")
    public Double getMona() {
        return mona;
    }

    @JsonProperty("mona")
    public void setMona(Double mona) {
        this.mona = mona;
    }

    @JsonProperty("mop")
    public Double getMop() {
        return mop;
    }

    @JsonProperty("mop")
    public void setMop(Double mop) {
        this.mop = mop;
    }

    @JsonProperty("movr")
    public Double getMovr() {
        return movr;
    }

    @JsonProperty("movr")
    public void setMovr(Double movr) {
        this.movr = movr;
    }

    @JsonProperty("mpl")
    public Double getMpl() {
        return mpl;
    }

    @JsonProperty("mpl")
    public void setMpl(Double mpl) {
        this.mpl = mpl;
    }

    @JsonProperty("mplx")
    public Double getMplx() {
        return mplx;
    }

    @JsonProperty("mplx")
    public void setMplx(Double mplx) {
        this.mplx = mplx;
    }

    @JsonProperty("mro")
    public Double getMro() {
        return mro;
    }

    @JsonProperty("mro")
    public void setMro(Double mro) {
        this.mro = mro;
    }

    @JsonProperty("mrs")
    public Double getMrs() {
        return mrs;
    }

    @JsonProperty("mrs")
    public void setMrs(Double mrs) {
        this.mrs = mrs;
    }

    @JsonProperty("mru")
    public Double getMru() {
        return mru;
    }

    @JsonProperty("mru")
    public void setMru(Double mru) {
        this.mru = mru;
    }

    @JsonProperty("msol")
    public Double getMsol() {
        return msol;
    }

    @JsonProperty("msol")
    public void setMsol(Double msol) {
        this.msol = msol;
    }

    @JsonProperty("mtl")
    public Double getMtl() {
        return mtl;
    }

    @JsonProperty("mtl")
    public void setMtl(Double mtl) {
        this.mtl = mtl;
    }

    @JsonProperty("mubi")
    public Double getMubi() {
        return mubi;
    }

    @JsonProperty("mubi")
    public void setMubi(Double mubi) {
        this.mubi = mubi;
    }

    @JsonProperty("multi")
    public Double getMulti() {
        return multi;
    }

    @JsonProperty("multi")
    public void setMulti(Double multi) {
        this.multi = multi;
    }

    @JsonProperty("mumu")
    public Double getMumu() {
        return mumu;
    }

    @JsonProperty("mumu")
    public void setMumu(Double mumu) {
        this.mumu = mumu;
    }

    @JsonProperty("mur")
    public Double getMur() {
        return mur;
    }

    @JsonProperty("mur")
    public void setMur(Double mur) {
        this.mur = mur;
    }

    @JsonProperty("muse")
    public Double getMuse() {
        return muse;
    }

    @JsonProperty("muse")
    public void setMuse(Double muse) {
        this.muse = muse;
    }

    @JsonProperty("mvr")
    public Double getMvr() {
        return mvr;
    }

    @JsonProperty("mvr")
    public void setMvr(Double mvr) {
        this.mvr = mvr;
    }

    @JsonProperty("mwc")
    public Double getMwc() {
        return mwc;
    }

    @JsonProperty("mwc")
    public void setMwc(Double mwc) {
        this.mwc = mwc;
    }

    @JsonProperty("mwk")
    public Double getMwk() {
        return mwk;
    }

    @JsonProperty("mwk")
    public void setMwk(Double mwk) {
        this.mwk = mwk;
    }

    @JsonProperty("mx")
    public Double getMx() {
        return mx;
    }

    @JsonProperty("mx")
    public void setMx(Double mx) {
        this.mx = mx;
    }

    @JsonProperty("mxc")
    public Double getMxc() {
        return mxc;
    }

    @JsonProperty("mxc")
    public void setMxc(Double mxc) {
        this.mxc = mxc;
    }

    @JsonProperty("mxn")
    public Double getMxn() {
        return mxn;
    }

    @JsonProperty("mxn")
    public void setMxn(Double mxn) {
        this.mxn = mxn;
    }

    @JsonProperty("mxv")
    public Double getMxv() {
        return mxv;
    }

    @JsonProperty("mxv")
    public void setMxv(Double mxv) {
        this.mxv = mxv;
    }

    @JsonProperty("myr")
    public Double getMyr() {
        return myr;
    }

    @JsonProperty("myr")
    public void setMyr(Double myr) {
        this.myr = myr;
    }

    @JsonProperty("myth")
    public Double getMyth() {
        return myth;
    }

    @JsonProperty("myth")
    public void setMyth(Double myth) {
        this.myth = myth;
    }

    @JsonProperty("mzm")
    public Double getMzm() {
        return mzm;
    }

    @JsonProperty("mzm")
    public void setMzm(Double mzm) {
        this.mzm = mzm;
    }

    @JsonProperty("mzn")
    public Double getMzn() {
        return mzn;
    }

    @JsonProperty("mzn")
    public void setMzn(Double mzn) {
        this.mzn = mzn;
    }

    @JsonProperty("nad")
    public Double getNad() {
        return nad;
    }

    @JsonProperty("nad")
    public void setNad(Double nad) {
        this.nad = nad;
    }

    @JsonProperty("nct")
    public Double getNct() {
        return nct;
    }

    @JsonProperty("nct")
    public void setNct(Double nct) {
        this.nct = nct;
    }

    @JsonProperty("near")
    public Double getNear() {
        return near;
    }

    @JsonProperty("near")
    public void setNear(Double near) {
        this.near = near;
    }

    @JsonProperty("neo")
    public Double getNeo() {
        return neo;
    }

    @JsonProperty("neo")
    public void setNeo(Double neo) {
        this.neo = neo;
    }

    @JsonProperty("neon")
    public Double getNeon() {
        return neon;
    }

    @JsonProperty("neon")
    public void setNeon(Double neon) {
        this.neon = neon;
    }

    @JsonProperty("nest")
    public Double getNest() {
        return nest;
    }

    @JsonProperty("nest")
    public void setNest(Double nest) {
        this.nest = nest;
    }

    @JsonProperty("nexo")
    public Double getNexo() {
        return nexo;
    }

    @JsonProperty("nexo")
    public void setNexo(Double nexo) {
        this.nexo = nexo;
    }

    @JsonProperty("nft")
    public Double getNft() {
        return nft;
    }

    @JsonProperty("nft")
    public void setNft(Double nft) {
        this.nft = nft;
    }

    @JsonProperty("ngn")
    public Double getNgn() {
        return ngn;
    }

    @JsonProperty("ngn")
    public void setNgn(Double ngn) {
        this.ngn = ngn;
    }

    @JsonProperty("nio")
    public Double getNio() {
        return nio;
    }

    @JsonProperty("nio")
    public void setNio(Double nio) {
        this.nio = nio;
    }

    @JsonProperty("nkn")
    public Double getNkn() {
        return nkn;
    }

    @JsonProperty("nkn")
    public void setNkn(Double nkn) {
        this.nkn = nkn;
    }

    @JsonProperty("nlg")
    public Double getNlg() {
        return nlg;
    }

    @JsonProperty("nlg")
    public void setNlg(Double nlg) {
        this.nlg = nlg;
    }

    @JsonProperty("nmr")
    public Double getNmr() {
        return nmr;
    }

    @JsonProperty("nmr")
    public void setNmr(Double nmr) {
        this.nmr = nmr;
    }

    @JsonProperty("nmt")
    public Double getNmt() {
        return nmt;
    }

    @JsonProperty("nmt")
    public void setNmt(Double nmt) {
        this.nmt = nmt;
    }

    @JsonProperty("nok")
    public Double getNok() {
        return nok;
    }

    @JsonProperty("nok")
    public void setNok(Double nok) {
        this.nok = nok;
    }

    @JsonProperty("nos")
    public Double getNos() {
        return nos;
    }

    @JsonProperty("nos")
    public void setNos(Double nos) {
        this.nos = nos;
    }

    @JsonProperty("not")
    public Double getNot() {
        return not;
    }

    @JsonProperty("not")
    public void setNot(Double not) {
        this.not = not;
    }

    @JsonProperty("npc")
    public Double getNpc() {
        return npc;
    }

    @JsonProperty("npc")
    public void setNpc(Double npc) {
        this.npc = npc;
    }

    @JsonProperty("npr")
    public Double getNpr() {
        return npr;
    }

    @JsonProperty("npr")
    public void setNpr(Double npr) {
        this.npr = npr;
    }

    @JsonProperty("npxs")
    public Double getNpxs() {
        return npxs;
    }

    @JsonProperty("npxs")
    public void setNpxs(Double npxs) {
        this.npxs = npxs;
    }

    @JsonProperty("ntrn")
    public Double getNtrn() {
        return ntrn;
    }

    @JsonProperty("ntrn")
    public void setNtrn(Double ntrn) {
        this.ntrn = ntrn;
    }

    @JsonProperty("nu")
    public Double getNu() {
        return nu;
    }

    @JsonProperty("nu")
    public void setNu(Double nu) {
        this.nu = nu;
    }

    @JsonProperty("nxm")
    public Double getNxm() {
        return nxm;
    }

    @JsonProperty("nxm")
    public void setNxm(Double nxm) {
        this.nxm = nxm;
    }

    @JsonProperty("nzd")
    public Double getNzd() {
        return nzd;
    }

    @JsonProperty("nzd")
    public void setNzd(Double nzd) {
        this.nzd = nzd;
    }

    @JsonProperty("oas")
    public Double getOas() {
        return oas;
    }

    @JsonProperty("oas")
    public void setOas(Double oas) {
        this.oas = oas;
    }

    @JsonProperty("ocean")
    public Double getOcean() {
        return ocean;
    }

    @JsonProperty("ocean")
    public void setOcean(Double ocean) {
        this.ocean = ocean;
    }

    @JsonProperty("ogn")
    public Double getOgn() {
        return ogn;
    }

    @JsonProperty("ogn")
    public void setOgn(Double ogn) {
        this.ogn = ogn;
    }

    @JsonProperty("ohm")
    public Double getOhm() {
        return ohm;
    }

    @JsonProperty("ohm")
    public void setOhm(Double ohm) {
        this.ohm = ohm;
    }

    @JsonProperty("okb")
    public Double getOkb() {
        return okb;
    }

    @JsonProperty("okb")
    public void setOkb(Double okb) {
        this.okb = okb;
    }

    @JsonProperty("okt")
    public Double getOkt() {
        return okt;
    }

    @JsonProperty("okt")
    public void setOkt(Double okt) {
        this.okt = okt;
    }

    @JsonProperty("olas")
    public Double getOlas() {
        return olas;
    }

    @JsonProperty("olas")
    public void setOlas(Double olas) {
        this.olas = olas;
    }

    @JsonProperty("om")
    public Double getOm() {
        return om;
    }

    @JsonProperty("om")
    public void setOm(Double om) {
        this.om = om;
    }

    @JsonProperty("omg")
    public Double getOmg() {
        return omg;
    }

    @JsonProperty("omg")
    public void setOmg(Double omg) {
        this.omg = omg;
    }

    @JsonProperty("omi")
    public Double getOmi() {
        return omi;
    }

    @JsonProperty("omi")
    public void setOmi(Double omi) {
        this.omi = omi;
    }

    @JsonProperty("omikami")
    public Double getOmikami() {
        return omikami;
    }

    @JsonProperty("omikami")
    public void setOmikami(Double omikami) {
        this.omikami = omikami;
    }

    @JsonProperty("omni")
    public Double getOmni() {
        return omni;
    }

    @JsonProperty("omni")
    public void setOmni(Double omni) {
        this.omni = omni;
    }

    @JsonProperty("omr")
    public Double getOmr() {
        return omr;
    }

    @JsonProperty("omr")
    public void setOmr(Double omr) {
        this.omr = omr;
    }

    @JsonProperty("ondo")
    public Double getOndo() {
        return ondo;
    }

    @JsonProperty("ondo")
    public void setOndo(Double ondo) {
        this.ondo = ondo;
    }

    @JsonProperty("one")
    public Double getOne() {
        return one;
    }

    @JsonProperty("one")
    public void setOne(Double one) {
        this.one = one;
    }

    @JsonProperty("ong")
    public Double getOng() {
        return ong;
    }

    @JsonProperty("ong")
    public void setOng(Double ong) {
        this.ong = ong;
    }

    @JsonProperty("ont")
    public Double getOnt() {
        return ont;
    }

    @JsonProperty("ont")
    public void setOnt(Double ont) {
        this.ont = ont;
    }

    @JsonProperty("ooki")
    public Double getOoki() {
        return ooki;
    }

    @JsonProperty("ooki")
    public void setOoki(Double ooki) {
        this.ooki = ooki;
    }

    @JsonProperty("op")
    public Double getOp() {
        return op;
    }

    @JsonProperty("op")
    public void setOp(Double op) {
        this.op = op;
    }

    @JsonProperty("orai")
    public Double getOrai() {
        return orai;
    }

    @JsonProperty("orai")
    public void setOrai(Double orai) {
        this.orai = orai;
    }

    @JsonProperty("orca")
    public Double getOrca() {
        return orca;
    }

    @JsonProperty("orca")
    public void setOrca(Double orca) {
        this.orca = orca;
    }

    @JsonProperty("ordi")
    public Double getOrdi() {
        return ordi;
    }

    @JsonProperty("ordi")
    public void setOrdi(Double ordi) {
        this.ordi = ordi;
    }

    @JsonProperty("orn")
    public Double getOrn() {
        return orn;
    }

    @JsonProperty("orn")
    public void setOrn(Double orn) {
        this.orn = orn;
    }

    @JsonProperty("osak")
    public Double getOsak() {
        return osak;
    }

    @JsonProperty("osak")
    public void setOsak(Double osak) {
        this.osak = osak;
    }

    @JsonProperty("osmo")
    public Double getOsmo() {
        return osmo;
    }

    @JsonProperty("osmo")
    public void setOsmo(Double osmo) {
        this.osmo = osmo;
    }

    @JsonProperty("ox_old")
    public Double getOxOld() {
        return oxOld;
    }

    @JsonProperty("ox_old")
    public void setOxOld(Double oxOld) {
        this.oxOld = oxOld;
    }

    @JsonProperty("oxt")
    public Double getOxt() {
        return oxt;
    }

    @JsonProperty("oxt")
    public void setOxt(Double oxt) {
        this.oxt = oxt;
    }

    @JsonProperty("paal")
    public Double getPaal() {
        return paal;
    }

    @JsonProperty("paal")
    public void setPaal(Double paal) {
        this.paal = paal;
    }

    @JsonProperty("pab")
    public Integer getPab() {
        return pab;
    }

    @JsonProperty("pab")
    public void setPab(Integer pab) {
        this.pab = pab;
    }

    @JsonProperty("pandora")
    public Double getPandora() {
        return pandora;
    }

    @JsonProperty("pandora")
    public void setPandora(Double pandora) {
        this.pandora = pandora;
    }

    @JsonProperty("pax")
    public Double getPax() {
        return pax;
    }

    @JsonProperty("pax")
    public void setPax(Double pax) {
        this.pax = pax;
    }

    @JsonProperty("paxg")
    public Double getPaxg() {
        return paxg;
    }

    @JsonProperty("paxg")
    public void setPaxg(Double paxg) {
        this.paxg = paxg;
    }

    @JsonProperty("pci")
    public Double getPci() {
        return pci;
    }

    @JsonProperty("pci")
    public void setPci(Double pci) {
        this.pci = pci;
    }

    @JsonProperty("pen")
    public Double getPen() {
        return pen;
    }

    @JsonProperty("pen")
    public void setPen(Double pen) {
        this.pen = pen;
    }

    @JsonProperty("pendle")
    public Double getPendle() {
        return pendle;
    }

    @JsonProperty("pendle")
    public void setPendle(Double pendle) {
        this.pendle = pendle;
    }

    @JsonProperty("people")
    public Double getPeople() {
        return people;
    }

    @JsonProperty("people")
    public void setPeople(Double people) {
        this.people = people;
    }

    @JsonProperty("pepe")
    public Double getPepe() {
        return pepe;
    }

    @JsonProperty("pepe")
    public void setPepe(Double pepe) {
        this.pepe = pepe;
    }

    @JsonProperty("pepecoin")
    public Double getPepecoin() {
        return pepecoin;
    }

    @JsonProperty("pepecoin")
    public void setPepecoin(Double pepecoin) {
        this.pepecoin = pepecoin;
    }

    @JsonProperty("perp")
    public Double getPerp() {
        return perp;
    }

    @JsonProperty("perp")
    public void setPerp(Double perp) {
        this.perp = perp;
    }

    @JsonProperty("pgk")
    public Double getPgk() {
        return pgk;
    }

    @JsonProperty("pgk")
    public void setPgk(Double pgk) {
        this.pgk = pgk;
    }

    @JsonProperty("php")
    public Double getPhp() {
        return php;
    }

    @JsonProperty("php")
    public void setPhp(Double php) {
        this.php = php;
    }

    @JsonProperty("pixel")
    public Double getPixel() {
        return pixel;
    }

    @JsonProperty("pixel")
    public void setPixel(Double pixel) {
        this.pixel = pixel;
    }

    @JsonProperty("pkr")
    public Double getPkr() {
        return pkr;
    }

    @JsonProperty("pkr")
    public void setPkr(Double pkr) {
        this.pkr = pkr;
    }

    @JsonProperty("pla")
    public Double getPla() {
        return pla;
    }

    @JsonProperty("pla")
    public void setPla(Double pla) {
        this.pla = pla;
    }

    @JsonProperty("pln")
    public Double getPln() {
        return pln;
    }

    @JsonProperty("pln")
    public void setPln(Double pln) {
        this.pln = pln;
    }

    @JsonProperty("plu")
    public Double getPlu() {
        return plu;
    }

    @JsonProperty("plu")
    public void setPlu(Double plu) {
        this.plu = plu;
    }

    @JsonProperty("png")
    public Double getPng() {
        return png;
    }

    @JsonProperty("png")
    public void setPng(Double png) {
        this.png = png;
    }

    @JsonProperty("pokt")
    public Double getPokt() {
        return pokt;
    }

    @JsonProperty("pokt")
    public void setPokt(Double pokt) {
        this.pokt = pokt;
    }

    @JsonProperty("pols")
    public Double getPols() {
        return pols;
    }

    @JsonProperty("pols")
    public void setPols(Double pols) {
        this.pols = pols;
    }

    @JsonProperty("poly")
    public Double getPoly() {
        return poly;
    }

    @JsonProperty("poly")
    public void setPoly(Double poly) {
        this.poly = poly;
    }

    @JsonProperty("polyx")
    public Double getPolyx() {
        return polyx;
    }

    @JsonProperty("polyx")
    public void setPolyx(Double polyx) {
        this.polyx = polyx;
    }

    @JsonProperty("pond")
    public Double getPond() {
        return pond;
    }

    @JsonProperty("pond")
    public void setPond(Double pond) {
        this.pond = pond;
    }

    @JsonProperty("ponke")
    public Double getPonke() {
        return ponke;
    }

    @JsonProperty("ponke")
    public void setPonke(Double ponke) {
        this.ponke = ponke;
    }

    @JsonProperty("popcat")
    public Double getPopcat() {
        return popcat;
    }

    @JsonProperty("popcat")
    public void setPopcat(Double popcat) {
        this.popcat = popcat;
    }

    @JsonProperty("pork")
    public Double getPork() {
        return pork;
    }

    @JsonProperty("pork")
    public void setPork(Double pork) {
        this.pork = pork;
    }

    @JsonProperty("portal")
    public Double getPortal() {
        return portal;
    }

    @JsonProperty("portal")
    public void setPortal(Double portal) {
        this.portal = portal;
    }

    @JsonProperty("powr")
    public Double getPowr() {
        return powr;
    }

    @JsonProperty("powr")
    public void setPowr(Double powr) {
        this.powr = powr;
    }

    @JsonProperty("prime")
    public Double getPrime() {
        return prime;
    }

    @JsonProperty("prime")
    public void setPrime(Double prime) {
        this.prime = prime;
    }

    @JsonProperty("pro")
    public Double getPro() {
        return pro;
    }

    @JsonProperty("pro")
    public void setPro(Double pro) {
        this.pro = pro;
    }

    @JsonProperty("prom")
    public Double getProm() {
        return prom;
    }

    @JsonProperty("prom")
    public void setProm(Double prom) {
        this.prom = prom;
    }

    @JsonProperty("prq")
    public Double getPrq() {
        return prq;
    }

    @JsonProperty("prq")
    public void setPrq(Double prq) {
        this.prq = prq;
    }

    @JsonProperty("pte")
    public Double getPte() {
        return pte;
    }

    @JsonProperty("pte")
    public void setPte(Double pte) {
        this.pte = pte;
    }

    @JsonProperty("pundix")
    public Double getPundix() {
        return pundix;
    }

    @JsonProperty("pundix")
    public void setPundix(Double pundix) {
        this.pundix = pundix;
    }

    @JsonProperty("pups")
    public Double getPups() {
        return pups;
    }

    @JsonProperty("pups")
    public void setPups(Double pups) {
        this.pups = pups;
    }

    @JsonProperty("pyg")
    public Double getPyg() {
        return pyg;
    }

    @JsonProperty("pyg")
    public void setPyg(Double pyg) {
        this.pyg = pyg;
    }

    @JsonProperty("pyr")
    public Double getPyr() {
        return pyr;
    }

    @JsonProperty("pyr")
    public void setPyr(Double pyr) {
        this.pyr = pyr;
    }

    @JsonProperty("pyth")
    public Double getPyth() {
        return pyth;
    }

    @JsonProperty("pyth")
    public void setPyth(Double pyth) {
        this.pyth = pyth;
    }

    @JsonProperty("pyusd")
    public Double getPyusd() {
        return pyusd;
    }

    @JsonProperty("pyusd")
    public void setPyusd(Double pyusd) {
        this.pyusd = pyusd;
    }

    @JsonProperty("qar")
    public Double getQar() {
        return qar;
    }

    @JsonProperty("qar")
    public void setQar(Double qar) {
        this.qar = qar;
    }

    @JsonProperty("qi")
    public Double getQi() {
        return qi;
    }

    @JsonProperty("qi")
    public void setQi(Double qi) {
        this.qi = qi;
    }

    @JsonProperty("qnt")
    public Double getQnt() {
        return qnt;
    }

    @JsonProperty("qnt")
    public void setQnt(Double qnt) {
        this.qnt = qnt;
    }

    @JsonProperty("qtum")
    public Double getQtum() {
        return qtum;
    }

    @JsonProperty("qtum")
    public void setQtum(Double qtum) {
        this.qtum = qtum;
    }

    @JsonProperty("qubic")
    public Double getQubic() {
        return qubic;
    }

    @JsonProperty("qubic")
    public void setQubic(Double qubic) {
        this.qubic = qubic;
    }

    @JsonProperty("quick")
    public Double getQuick() {
        return quick;
    }

    @JsonProperty("quick")
    public void setQuick(Double quick) {
        this.quick = quick;
    }

    @JsonProperty("rad")
    public Double getRad() {
        return rad;
    }

    @JsonProperty("rad")
    public void setRad(Double rad) {
        this.rad = rad;
    }

    @JsonProperty("rai")
    public Double getRai() {
        return rai;
    }

    @JsonProperty("rai")
    public void setRai(Double rai) {
        this.rai = rai;
    }

    @JsonProperty("rare")
    public Double getRare() {
        return rare;
    }

    @JsonProperty("rare")
    public void setRare(Double rare) {
        this.rare = rare;
    }

    @JsonProperty("rari")
    public Double getRari() {
        return rari;
    }

    @JsonProperty("rari")
    public void setRari(Double rari) {
        this.rari = rari;
    }

    @JsonProperty("ray")
    public Double getRay() {
        return ray;
    }

    @JsonProperty("ray")
    public void setRay(Double ray) {
        this.ray = ray;
    }

    @JsonProperty("rbn")
    public Double getRbn() {
        return rbn;
    }

    @JsonProperty("rbn")
    public void setRbn(Double rbn) {
        this.rbn = rbn;
    }

    @JsonProperty("rei")
    public Double getRei() {
        return rei;
    }

    @JsonProperty("rei")
    public void setRei(Double rei) {
        this.rei = rei;
    }

    @JsonProperty("ren")
    public Double getRen() {
        return ren;
    }

    @JsonProperty("ren")
    public void setRen(Double ren) {
        this.ren = ren;
    }

    @JsonProperty("render")
    public Double getRender() {
        return render;
    }

    @JsonProperty("render")
    public void setRender(Double render) {
        this.render = render;
    }

    @JsonProperty("rep")
    public Double getRep() {
        return rep;
    }

    @JsonProperty("rep")
    public void setRep(Double rep) {
        this.rep = rep;
    }

    @JsonProperty("repv2")
    public Double getRepv2() {
        return repv2;
    }

    @JsonProperty("repv2")
    public void setRepv2(Double repv2) {
        this.repv2 = repv2;
    }

    @JsonProperty("req")
    public Double getReq() {
        return req;
    }

    @JsonProperty("req")
    public void setReq(Double req) {
        this.req = req;
    }

    @JsonProperty("reth")
    public Double getReth() {
        return reth;
    }

    @JsonProperty("reth")
    public void setReth(Double reth) {
        this.reth = reth;
    }

    @JsonProperty("rgt")
    public Double getRgt() {
        return rgt;
    }

    @JsonProperty("rgt")
    public void setRgt(Double rgt) {
        this.rgt = rgt;
    }

    @JsonProperty("rif")
    public Double getRif() {
        return rif;
    }

    @JsonProperty("rif")
    public void setRif(Double rif) {
        this.rif = rif;
    }

    @JsonProperty("rlb")
    public Double getRlb() {
        return rlb;
    }

    @JsonProperty("rlb")
    public void setRlb(Double rlb) {
        this.rlb = rlb;
    }

    @JsonProperty("rlc")
    public Double getRlc() {
        return rlc;
    }

    @JsonProperty("rlc")
    public void setRlc(Double rlc) {
        this.rlc = rlc;
    }

    @JsonProperty("rly")
    public Double getRly() {
        return rly;
    }

    @JsonProperty("rly")
    public void setRly(Double rly) {
        this.rly = rly;
    }

    @JsonProperty("rndr")
    public Double getRndr() {
        return rndr;
    }

    @JsonProperty("rndr")
    public void setRndr(Double rndr) {
        this.rndr = rndr;
    }

    @JsonProperty("rol")
    public Double getRol() {
        return rol;
    }

    @JsonProperty("rol")
    public void setRol(Double rol) {
        this.rol = rol;
    }

    @JsonProperty("ron")
    public Double getRon() {
        return ron;
    }

    @JsonProperty("ron")
    public void setRon(Double ron) {
        this.ron = ron;
    }

    @JsonProperty("ronin")
    public Double getRonin() {
        return ronin;
    }

    @JsonProperty("ronin")
    public void setRonin(Double ronin) {
        this.ronin = ronin;
    }

    @JsonProperty("rose")
    public Double getRose() {
        return rose;
    }

    @JsonProperty("rose")
    public void setRose(Double rose) {
        this.rose = rose;
    }

    @JsonProperty("rpl")
    public Double getRpl() {
        return rpl;
    }

    @JsonProperty("rpl")
    public void setRpl(Double rpl) {
        this.rpl = rpl;
    }

    @JsonProperty("rsd")
    public Double getRsd() {
        return rsd;
    }

    @JsonProperty("rsd")
    public void setRsd(Double rsd) {
        this.rsd = rsd;
    }

    @JsonProperty("rseth")
    public Double getRseth() {
        return rseth;
    }

    @JsonProperty("rseth")
    public void setRseth(Double rseth) {
        this.rseth = rseth;
    }

    @JsonProperty("rsr")
    public Double getRsr() {
        return rsr;
    }

    @JsonProperty("rsr")
    public void setRsr(Double rsr) {
        this.rsr = rsr;
    }

    @JsonProperty("rss3")
    public Double getRss3() {
        return rss3;
    }

    @JsonProperty("rss3")
    public void setRss3(Double rss3) {
        this.rss3 = rss3;
    }

    @JsonProperty("rub")
    public Double getRub() {
        return rub;
    }

    @JsonProperty("rub")
    public void setRub(Double rub) {
        this.rub = rub;
    }

    @JsonProperty("rune")
    public Double getRune() {
        return rune;
    }

    @JsonProperty("rune")
    public void setRune(Double rune) {
        this.rune = rune;
    }

    @JsonProperty("rvn")
    public Double getRvn() {
        return rvn;
    }

    @JsonProperty("rvn")
    public void setRvn(Double rvn) {
        this.rvn = rvn;
    }

    @JsonProperty("rwf")
    public Double getRwf() {
        return rwf;
    }

    @JsonProperty("rwf")
    public void setRwf(Double rwf) {
        this.rwf = rwf;
    }

    @JsonProperty("safe")
    public Double getSafe() {
        return safe;
    }

    @JsonProperty("safe")
    public void setSafe(Double safe) {
        this.safe = safe;
    }

    @JsonProperty("saga")
    public Double getSaga() {
        return saga;
    }

    @JsonProperty("saga")
    public void setSaga(Double saga) {
        this.saga = saga;
    }

    @JsonProperty("sand")
    public Double getSand() {
        return sand;
    }

    @JsonProperty("sand")
    public void setSand(Double sand) {
        this.sand = sand;
    }

    @JsonProperty("sar")
    public Double getSar() {
        return sar;
    }

    @JsonProperty("sar")
    public void setSar(Double sar) {
        this.sar = sar;
    }

    @JsonProperty("sats")
    public Double getSats() {
        return sats;
    }

    @JsonProperty("sats")
    public void setSats(Double sats) {
        this.sats = sats;
    }

    @JsonProperty("savax")
    public Double getSavax() {
        return savax;
    }

    @JsonProperty("savax")
    public void setSavax(Double savax) {
        this.savax = savax;
    }

    @JsonProperty("sbd")
    public Double getSbd() {
        return sbd;
    }

    @JsonProperty("sbd")
    public void setSbd(Double sbd) {
        this.sbd = sbd;
    }

    @JsonProperty("sc")
    public Double getSc() {
        return sc;
    }

    @JsonProperty("sc")
    public void setSc(Double sc) {
        this.sc = sc;
    }

    @JsonProperty("scr")
    public Double getScr() {
        return scr;
    }

    @JsonProperty("scr")
    public void setScr(Double scr) {
        this.scr = scr;
    }

    @JsonProperty("sd")
    public Double getSd() {
        return sd;
    }

    @JsonProperty("sd")
    public void setSd(Double sd) {
        this.sd = sd;
    }

    @JsonProperty("sdd")
    public Double getSdd() {
        return sdd;
    }

    @JsonProperty("sdd")
    public void setSdd(Double sdd) {
        this.sdd = sdd;
    }

    @JsonProperty("sdg")
    public Double getSdg() {
        return sdg;
    }

    @JsonProperty("sdg")
    public void setSdg(Double sdg) {
        this.sdg = sdg;
    }

    @JsonProperty("seam")
    public Double getSeam() {
        return seam;
    }

    @JsonProperty("seam")
    public void setSeam(Double seam) {
        this.seam = seam;
    }

    @JsonProperty("sei")
    public Double getSei() {
        return sei;
    }

    @JsonProperty("sei")
    public void setSei(Double sei) {
        this.sei = sei;
    }

    @JsonProperty("sek")
    public Double getSek() {
        return sek;
    }

    @JsonProperty("sek")
    public void setSek(Double sek) {
        this.sek = sek;
    }

    @JsonProperty("sfp")
    public Double getSfp() {
        return sfp;
    }

    @JsonProperty("sfp")
    public void setSfp(Double sfp) {
        this.sfp = sfp;
    }

    @JsonProperty("sfrxeth")
    public Double getSfrxeth() {
        return sfrxeth;
    }

    @JsonProperty("sfrxeth")
    public void setSfrxeth(Double sfrxeth) {
        this.sfrxeth = sfrxeth;
    }

    @JsonProperty("sfund")
    public Double getSfund() {
        return sfund;
    }

    @JsonProperty("sfund")
    public void setSfund(Double sfund) {
        this.sfund = sfund;
    }

    @JsonProperty("sgb")
    public Double getSgb() {
        return sgb;
    }

    @JsonProperty("sgb")
    public void setSgb(Double sgb) {
        this.sgb = sgb;
    }

    @JsonProperty("sgd")
    public Double getSgd() {
        return sgd;
    }

    @JsonProperty("sgd")
    public void setSgd(Double sgd) {
        this.sgd = sgd;
    }

    @JsonProperty("shdw")
    public Double getShdw() {
        return shdw;
    }

    @JsonProperty("shdw")
    public void setShdw(Double shdw) {
        this.shdw = shdw;
    }

    @JsonProperty("shib")
    public Double getShib() {
        return shib;
    }

    @JsonProperty("shib")
    public void setShib(Double shib) {
        this.shib = shib;
    }

    @JsonProperty("shp")
    public Double getShp() {
        return shp;
    }

    @JsonProperty("shp")
    public void setShp(Double shp) {
        this.shp = shp;
    }

    @JsonProperty("shping")
    public Double getShping() {
        return shping;
    }

    @JsonProperty("shping")
    public void setShping(Double shping) {
        this.shping = shping;
    }

    @JsonProperty("sit")
    public Double getSit() {
        return sit;
    }

    @JsonProperty("sit")
    public void setSit(Double sit) {
        this.sit = sit;
    }

    @JsonProperty("skk")
    public Double getSkk() {
        return skk;
    }

    @JsonProperty("skk")
    public void setSkk(Double skk) {
        this.skk = skk;
    }

    @JsonProperty("skl")
    public Double getSkl() {
        return skl;
    }

    @JsonProperty("skl")
    public void setSkl(Double skl) {
        this.skl = skl;
    }

    @JsonProperty("sle")
    public Double getSle() {
        return sle;
    }

    @JsonProperty("sle")
    public void setSle(Double sle) {
        this.sle = sle;
    }

    @JsonProperty("slerf")
    public Double getSlerf() {
        return slerf;
    }

    @JsonProperty("slerf")
    public void setSlerf(Double slerf) {
        this.slerf = slerf;
    }

    @JsonProperty("sll")
    public Double getSll() {
        return sll;
    }

    @JsonProperty("sll")
    public void setSll(Double sll) {
        this.sll = sll;
    }

    @JsonProperty("slp")
    public Double getSlp() {
        return slp;
    }

    @JsonProperty("slp")
    public void setSlp(Double slp) {
        this.slp = slp;
    }

    @JsonProperty("snt")
    public Double getSnt() {
        return snt;
    }

    @JsonProperty("snt")
    public void setSnt(Double snt) {
        this.snt = snt;
    }

    @JsonProperty("snx")
    public Double getSnx() {
        return snx;
    }

    @JsonProperty("snx")
    public void setSnx(Double snx) {
        this.snx = snx;
    }

    @JsonProperty("sol")
    public Double getSol() {
        return sol;
    }

    @JsonProperty("sol")
    public void setSol(Double sol) {
        this.sol = sol;
    }

    @JsonProperty("sos")
    public Double getSos() {
        return sos;
    }

    @JsonProperty("sos")
    public void setSos(Double sos) {
        this.sos = sos;
    }

    @JsonProperty("spa")
    public Double getSpa() {
        return spa;
    }

    @JsonProperty("spa")
    public void setSpa(Double spa) {
        this.spa = spa;
    }

    @JsonProperty("spell")
    public Double getSpell() {
        return spell;
    }

    @JsonProperty("spell")
    public void setSpell(Double spell) {
        this.spell = spell;
    }

    @JsonProperty("spl")
    public Double getSpl() {
        return spl;
    }

    @JsonProperty("spl")
    public void setSpl(Double spl) {
        this.spl = spl;
    }

    @JsonProperty("srd")
    public Double getSrd() {
        return srd;
    }

    @JsonProperty("srd")
    public void setSrd(Double srd) {
        this.srd = srd;
    }

    @JsonProperty("srg")
    public Double getSrg() {
        return srg;
    }

    @JsonProperty("srg")
    public void setSrg(Double srg) {
        this.srg = srg;
    }

    @JsonProperty("ssv")
    public Double getSsv() {
        return ssv;
    }

    @JsonProperty("ssv")
    public void setSsv(Double ssv) {
        this.ssv = ssv;
    }

    @JsonProperty("std")
    public Double getStd() {
        return std;
    }

    @JsonProperty("std")
    public void setStd(Double std) {
        this.std = std;
    }

    @JsonProperty("steth")
    public Double getSteth() {
        return steth;
    }

    @JsonProperty("steth")
    public void setSteth(Double steth) {
        this.steth = steth;
    }

    @JsonProperty("stg")
    public Double getStg() {
        return stg;
    }

    @JsonProperty("stg")
    public void setStg(Double stg) {
        this.stg = stg;
    }

    @JsonProperty("stn")
    public Double getStn() {
        return stn;
    }

    @JsonProperty("stn")
    public void setStn(Double stn) {
        this.stn = stn;
    }

    @JsonProperty("storj")
    public Double getStorj() {
        return storj;
    }

    @JsonProperty("storj")
    public void setStorj(Double storj) {
        this.storj = storj;
    }

    @JsonProperty("strax")
    public Double getStrax() {
        return strax;
    }

    @JsonProperty("strax")
    public void setStrax(Double strax) {
        this.strax = strax;
    }

    @JsonProperty("strd")
    public Double getStrd() {
        return strd;
    }

    @JsonProperty("strd")
    public void setStrd(Double strd) {
        this.strd = strd;
    }

    @JsonProperty("strk")
    public Double getStrk() {
        return strk;
    }

    @JsonProperty("strk")
    public void setStrk(Double strk) {
        this.strk = strk;
    }

    @JsonProperty("stsol")
    public Double getStsol() {
        return stsol;
    }

    @JsonProperty("stsol")
    public void setStsol(Double stsol) {
        this.stsol = stsol;
    }

    @JsonProperty("stx")
    public Double getStx() {
        return stx;
    }

    @JsonProperty("stx")
    public void setStx(Double stx) {
        this.stx = stx;
    }

    @JsonProperty("sui")
    public Double getSui() {
        return sui;
    }

    @JsonProperty("sui")
    public void setSui(Double sui) {
        this.sui = sui;
    }

    @JsonProperty("suku")
    public Double getSuku() {
        return suku;
    }

    @JsonProperty("suku")
    public void setSuku(Double suku) {
        this.suku = suku;
    }

    @JsonProperty("super")
    public Double getSuper() {
        return _super;
    }

    @JsonProperty("super")
    public void setSuper(Double _super) {
        this._super = _super;
    }

    @JsonProperty("sushi")
    public Double getSushi() {
        return sushi;
    }

    @JsonProperty("sushi")
    public void setSushi(Double sushi) {
        this.sushi = sushi;
    }

    @JsonProperty("svc")
    public Double getSvc() {
        return svc;
    }

    @JsonProperty("svc")
    public void setSvc(Double svc) {
        this.svc = svc;
    }

    @JsonProperty("sweth")
    public Double getSweth() {
        return sweth;
    }

    @JsonProperty("sweth")
    public void setSweth(Double sweth) {
        this.sweth = sweth;
    }

    @JsonProperty("swftc")
    public Double getSwftc() {
        return swftc;
    }

    @JsonProperty("swftc")
    public void setSwftc(Double swftc) {
        this.swftc = swftc;
    }

    @JsonProperty("sxp")
    public Double getSxp() {
        return sxp;
    }

    @JsonProperty("sxp")
    public void setSxp(Double sxp) {
        this.sxp = sxp;
    }

    @JsonProperty("sylo")
    public Double getSylo() {
        return sylo;
    }

    @JsonProperty("sylo")
    public void setSylo(Double sylo) {
        this.sylo = sylo;
    }

    @JsonProperty("syn")
    public Double getSyn() {
        return syn;
    }

    @JsonProperty("syn")
    public void setSyn(Double syn) {
        this.syn = syn;
    }

    @JsonProperty("sync")
    public Double getSync() {
        return sync;
    }

    @JsonProperty("sync")
    public void setSync(Double sync) {
        this.sync = sync;
    }

    @JsonProperty("syp")
    public Double getSyp() {
        return syp;
    }

    @JsonProperty("syp")
    public void setSyp(Double syp) {
        this.syp = syp;
    }

    @JsonProperty("szl")
    public Double getSzl() {
        return szl;
    }

    @JsonProperty("szl")
    public void setSzl(Double szl) {
        this.szl = szl;
    }

    @JsonProperty("t")
    public Double getT() {
        return t;
    }

    @JsonProperty("t")
    public void setT(Double t) {
        this.t = t;
    }

    @JsonProperty("tao")
    public Double getTao() {
        return tao;
    }

    @JsonProperty("tao")
    public void setTao(Double tao) {
        this.tao = tao;
    }

    @JsonProperty("tbtc")
    public Double getTbtc() {
        return tbtc;
    }

    @JsonProperty("tbtc")
    public void setTbtc(Double tbtc) {
        this.tbtc = tbtc;
    }

    @JsonProperty("tel")
    public Double getTel() {
        return tel;
    }

    @JsonProperty("tel")
    public void setTel(Double tel) {
        this.tel = tel;
    }

    @JsonProperty("tet")
    public Double getTet() {
        return tet;
    }

    @JsonProperty("tet")
    public void setTet(Double tet) {
        this.tet = tet;
    }

    @JsonProperty("tfuel")
    public Double getTfuel() {
        return tfuel;
    }

    @JsonProperty("tfuel")
    public void setTfuel(Double tfuel) {
        this.tfuel = tfuel;
    }

    @JsonProperty("thb")
    public Double getThb() {
        return thb;
    }

    @JsonProperty("thb")
    public void setThb(Double thb) {
        this.thb = thb;
    }

    @JsonProperty("theta")
    public Double getTheta() {
        return theta;
    }

    @JsonProperty("theta")
    public void setTheta(Double theta) {
        this.theta = theta;
    }

    @JsonProperty("tia")
    public Double getTia() {
        return tia;
    }

    @JsonProperty("tia")
    public void setTia(Double tia) {
        this.tia = tia;
    }

    @JsonProperty("time")
    public Double getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Double time) {
        this.time = time;
    }

    @JsonProperty("tjs")
    public Double getTjs() {
        return tjs;
    }

    @JsonProperty("tjs")
    public void setTjs(Double tjs) {
        this.tjs = tjs;
    }

    @JsonProperty("tkx")
    public Double getTkx() {
        return tkx;
    }

    @JsonProperty("tkx")
    public void setTkx(Double tkx) {
        this.tkx = tkx;
    }

    @JsonProperty("tmm")
    public Double getTmm() {
        return tmm;
    }

    @JsonProperty("tmm")
    public void setTmm(Double tmm) {
        this.tmm = tmm;
    }

    @JsonProperty("tmt")
    public Double getTmt() {
        return tmt;
    }

    @JsonProperty("tmt")
    public void setTmt(Double tmt) {
        this.tmt = tmt;
    }

    @JsonProperty("tnd")
    public Double getTnd() {
        return tnd;
    }

    @JsonProperty("tnd")
    public void setTnd(Double tnd) {
        this.tnd = tnd;
    }

    @JsonProperty("tnsr")
    public Double getTnsr() {
        return tnsr;
    }

    @JsonProperty("tnsr")
    public void setTnsr(Double tnsr) {
        this.tnsr = tnsr;
    }

    @JsonProperty("ton")
    public Double getTon() {
        return ton;
    }

    @JsonProperty("ton")
    public void setTon(Double ton) {
        this.ton = ton;
    }

    @JsonProperty("tone")
    public Double getTone() {
        return tone;
    }

    @JsonProperty("tone")
    public void setTone(Double tone) {
        this.tone = tone;
    }

    @JsonProperty("top")
    public Double getTop() {
        return top;
    }

    @JsonProperty("top")
    public void setTop(Double top) {
        this.top = top;
    }

    @JsonProperty("topia")
    public Double getTopia() {
        return topia;
    }

    @JsonProperty("topia")
    public void setTopia(Double topia) {
        this.topia = topia;
    }

    @JsonProperty("tor")
    public Double getTor() {
        return tor;
    }

    @JsonProperty("tor")
    public void setTor(Double tor) {
        this.tor = tor;
    }

    @JsonProperty("toshi")
    public Double getToshi() {
        return toshi;
    }

    @JsonProperty("toshi")
    public void setToshi(Double toshi) {
        this.toshi = toshi;
    }

    @JsonProperty("trac")
    public Double getTrac() {
        return trac;
    }

    @JsonProperty("trac")
    public void setTrac(Double trac) {
        this.trac = trac;
    }

    @JsonProperty("trb")
    public Double getTrb() {
        return trb;
    }

    @JsonProperty("trb")
    public void setTrb(Double trb) {
        this.trb = trb;
    }

    @JsonProperty("tribe")
    public Double getTribe() {
        return tribe;
    }

    @JsonProperty("tribe")
    public void setTribe(Double tribe) {
        this.tribe = tribe;
    }

    @JsonProperty("trl")
    public Double getTrl() {
        return trl;
    }

    @JsonProperty("trl")
    public void setTrl(Double trl) {
        this.trl = trl;
    }

    @JsonProperty("tru")
    public Double getTru() {
        return tru;
    }

    @JsonProperty("tru")
    public void setTru(Double tru) {
        this.tru = tru;
    }

    @JsonProperty("trump")
    public Double getTrump() {
        return trump;
    }

    @JsonProperty("trump")
    public void setTrump(Double trump) {
        this.trump = trump;
    }

    @JsonProperty("trx")
    public Double getTrx() {
        return trx;
    }

    @JsonProperty("trx")
    public void setTrx(Double trx) {
        this.trx = trx;
    }

    @JsonProperty("try")
    public Double getTry() {
        return _try;
    }

    @JsonProperty("try")
    public void setTry(Double _try) {
        this._try = _try;
    }

    @JsonProperty("ttd")
    public Double getTtd() {
        return ttd;
    }

    @JsonProperty("ttd")
    public void setTtd(Double ttd) {
        this.ttd = ttd;
    }

    @JsonProperty("turbo")
    public Double getTurbo() {
        return turbo;
    }

    @JsonProperty("turbo")
    public void setTurbo(Double turbo) {
        this.turbo = turbo;
    }

    @JsonProperty("tusd")
    public Double getTusd() {
        return tusd;
    }

    @JsonProperty("tusd")
    public void setTusd(Double tusd) {
        this.tusd = tusd;
    }

    @JsonProperty("tvd")
    public Double getTvd() {
        return tvd;
    }

    @JsonProperty("tvd")
    public void setTvd(Double tvd) {
        this.tvd = tvd;
    }

    @JsonProperty("tvk")
    public Double getTvk() {
        return tvk;
    }

    @JsonProperty("tvk")
    public void setTvk(Double tvk) {
        this.tvk = tvk;
    }

    @JsonProperty("twd")
    public Double getTwd() {
        return twd;
    }

    @JsonProperty("twd")
    public void setTwd(Double twd) {
        this.twd = twd;
    }

    @JsonProperty("twt")
    public Double getTwt() {
        return twt;
    }

    @JsonProperty("twt")
    public void setTwt(Double twt) {
        this.twt = twt;
    }

    @JsonProperty("tzs")
    public Double getTzs() {
        return tzs;
    }

    @JsonProperty("tzs")
    public void setTzs(Double tzs) {
        this.tzs = tzs;
    }

    @JsonProperty("uah")
    public Double getUah() {
        return uah;
    }

    @JsonProperty("uah")
    public void setUah(Double uah) {
        this.uah = uah;
    }

    @JsonProperty("ugx")
    public Double getUgx() {
        return ugx;
    }

    @JsonProperty("ugx")
    public void setUgx(Double ugx) {
        this.ugx = ugx;
    }

    @JsonProperty("ultima")
    public Double getUltima() {
        return ultima;
    }

    @JsonProperty("ultima")
    public void setUltima(Double ultima) {
        this.ultima = ultima;
    }

    @JsonProperty("uma")
    public Double getUma() {
        return uma;
    }

    @JsonProperty("uma")
    public void setUma(Double uma) {
        this.uma = uma;
    }

    @JsonProperty("unfi")
    public Double getUnfi() {
        return unfi;
    }

    @JsonProperty("unfi")
    public void setUnfi(Double unfi) {
        this.unfi = unfi;
    }

    @JsonProperty("uni")
    public Double getUni() {
        return uni;
    }

    @JsonProperty("uni")
    public void setUni(Double uni) {
        this.uni = uni;
    }

    @JsonProperty("uos")
    public Double getUos() {
        return uos;
    }

    @JsonProperty("uos")
    public void setUos(Double uos) {
        this.uos = uos;
    }

    @JsonProperty("upi")
    public Double getUpi() {
        return upi;
    }

    @JsonProperty("upi")
    public void setUpi(Double upi) {
        this.upi = upi;
    }

    @JsonProperty("uqc")
    public Double getUqc() {
        return uqc;
    }

    @JsonProperty("uqc")
    public void setUqc(Double uqc) {
        this.uqc = uqc;
    }

    @JsonProperty("usd")
    public Integer getUsd() {
        return usd;
    }

    @JsonProperty("usd")
    public void setUsd(Integer usd) {
        this.usd = usd;
    }

    @JsonProperty("usdb")
    public Double getUsdb() {
        return usdb;
    }

    @JsonProperty("usdb")
    public void setUsdb(Double usdb) {
        this.usdb = usdb;
    }

    @JsonProperty("usdc")
    public Double getUsdc() {
        return usdc;
    }

    @JsonProperty("usdc")
    public void setUsdc(Double usdc) {
        this.usdc = usdc;
    }

    @JsonProperty("usdc.e")
    public Double getUsdcE() {
        return usdcE;
    }

    @JsonProperty("usdc.e")
    public void setUsdcE(Double usdcE) {
        this.usdcE = usdcE;
    }

    @JsonProperty("usdd")
    public Double getUsdd() {
        return usdd;
    }

    @JsonProperty("usdd")
    public void setUsdd(Double usdd) {
        this.usdd = usdd;
    }

    @JsonProperty("usde")
    public Double getUsde() {
        return usde;
    }

    @JsonProperty("usde")
    public void setUsde(Double usde) {
        this.usde = usde;
    }

    @JsonProperty("usdp")
    public Double getUsdp() {
        return usdp;
    }

    @JsonProperty("usdp")
    public void setUsdp(Double usdp) {
        this.usdp = usdp;
    }

    @JsonProperty("usdt")
    public Double getUsdt() {
        return usdt;
    }

    @JsonProperty("usdt")
    public void setUsdt(Double usdt) {
        this.usdt = usdt;
    }

    @JsonProperty("usdy")
    public Double getUsdy() {
        return usdy;
    }

    @JsonProperty("usdy")
    public void setUsdy(Double usdy) {
        this.usdy = usdy;
    }

    @JsonProperty("ust")
    public Double getUst() {
        return ust;
    }

    @JsonProperty("ust")
    public void setUst(Double ust) {
        this.ust = ust;
    }

    @JsonProperty("ustc")
    public Double getUstc() {
        return ustc;
    }

    @JsonProperty("ustc")
    public void setUstc(Double ustc) {
        this.ustc = ustc;
    }

    @JsonProperty("uyu")
    public Double getUyu() {
        return uyu;
    }

    @JsonProperty("uyu")
    public void setUyu(Double uyu) {
        this.uyu = uyu;
    }

    @JsonProperty("uzs")
    public Double getUzs() {
        return uzs;
    }

    @JsonProperty("uzs")
    public void setUzs(Double uzs) {
        this.uzs = uzs;
    }

    @JsonProperty("val")
    public Double getVal() {
        return val;
    }

    @JsonProperty("val")
    public void setVal(Double val) {
        this.val = val;
    }

    @JsonProperty("vanry")
    public Double getVanry() {
        return vanry;
    }

    @JsonProperty("vanry")
    public void setVanry(Double vanry) {
        this.vanry = vanry;
    }

    @JsonProperty("vara")
    public Double getVara() {
        return vara;
    }

    @JsonProperty("vara")
    public void setVara(Double vara) {
        this.vara = vara;
    }

    @JsonProperty("veb")
    public Double getVeb() {
        return veb;
    }

    @JsonProperty("veb")
    public void setVeb(Double veb) {
        this.veb = veb;
    }

    @JsonProperty("ved")
    public Double getVed() {
        return ved;
    }

    @JsonProperty("ved")
    public void setVed(Double ved) {
        this.ved = ved;
    }

    @JsonProperty("vef")
    public Double getVef() {
        return vef;
    }

    @JsonProperty("vef")
    public void setVef(Double vef) {
        this.vef = vef;
    }

    @JsonProperty("velo")
    public Double getVelo() {
        return velo;
    }

    @JsonProperty("velo")
    public void setVelo(Double velo) {
        this.velo = velo;
    }

    @JsonProperty("venom")
    public Double getVenom() {
        return venom;
    }

    @JsonProperty("venom")
    public void setVenom(Double venom) {
        this.venom = venom;
    }

    @JsonProperty("ves")
    public Double getVes() {
        return ves;
    }

    @JsonProperty("ves")
    public void setVes(Double ves) {
        this.ves = ves;
    }

    @JsonProperty("vet")
    public Double getVet() {
        return vet;
    }

    @JsonProperty("vet")
    public void setVet(Double vet) {
        this.vet = vet;
    }

    @JsonProperty("vgx")
    public Double getVgx() {
        return vgx;
    }

    @JsonProperty("vgx")
    public void setVgx(Double vgx) {
        this.vgx = vgx;
    }

    @JsonProperty("vnd")
    public Double getVnd() {
        return vnd;
    }

    @JsonProperty("vnd")
    public void setVnd(Double vnd) {
        this.vnd = vnd;
    }

    @JsonProperty("vnst")
    public Double getVnst() {
        return vnst;
    }

    @JsonProperty("vnst")
    public void setVnst(Double vnst) {
        this.vnst = vnst;
    }

    @JsonProperty("voxel")
    public Double getVoxel() {
        return voxel;
    }

    @JsonProperty("voxel")
    public void setVoxel(Double voxel) {
        this.voxel = voxel;
    }

    @JsonProperty("vr")
    public Double getVr() {
        return vr;
    }

    @JsonProperty("vr")
    public void setVr(Double vr) {
        this.vr = vr;
    }

    @JsonProperty("vtho")
    public Double getVtho() {
        return vtho;
    }

    @JsonProperty("vtho")
    public void setVtho(Double vtho) {
        this.vtho = vtho;
    }

    @JsonProperty("vuv")
    public Double getVuv() {
        return vuv;
    }

    @JsonProperty("vuv")
    public void setVuv(Double vuv) {
        this.vuv = vuv;
    }

    @JsonProperty("w")
    public Double getW() {
        return w;
    }

    @JsonProperty("w")
    public void setW(Double w) {
        this.w = w;
    }

    @JsonProperty("wampl")
    public Double getWampl() {
        return wampl;
    }

    @JsonProperty("wampl")
    public void setWampl(Double wampl) {
        this.wampl = wampl;
    }

    @JsonProperty("waves")
    public Double getWaves() {
        return waves;
    }

    @JsonProperty("waves")
    public void setWaves(Double waves) {
        this.waves = waves;
    }

    @JsonProperty("waxl")
    public Double getWaxl() {
        return waxl;
    }

    @JsonProperty("waxl")
    public void setWaxl(Double waxl) {
        this.waxl = waxl;
    }

    @JsonProperty("waxp")
    public Double getWaxp() {
        return waxp;
    }

    @JsonProperty("waxp")
    public void setWaxp(Double waxp) {
        this.waxp = waxp;
    }

    @JsonProperty("wbeth")
    public Double getWbeth() {
        return wbeth;
    }

    @JsonProperty("wbeth")
    public void setWbeth(Double wbeth) {
        this.wbeth = wbeth;
    }

    @JsonProperty("wbt")
    public Double getWbt() {
        return wbt;
    }

    @JsonProperty("wbt")
    public void setWbt(Double wbt) {
        this.wbt = wbt;
    }

    @JsonProperty("wbtc")
    public Double getWbtc() {
        return wbtc;
    }

    @JsonProperty("wbtc")
    public void setWbtc(Double wbtc) {
        this.wbtc = wbtc;
    }

    @JsonProperty("wcfg")
    public Double getWcfg() {
        return wcfg;
    }

    @JsonProperty("wcfg")
    public void setWcfg(Double wcfg) {
        this.wcfg = wcfg;
    }

    @JsonProperty("weeth")
    public Double getWeeth() {
        return weeth;
    }

    @JsonProperty("weeth")
    public void setWeeth(Double weeth) {
        this.weeth = weeth;
    }

    @JsonProperty("wemix")
    public Double getWemix() {
        return wemix;
    }

    @JsonProperty("wemix")
    public void setWemix(Double wemix) {
        this.wemix = wemix;
    }

    @JsonProperty("wif")
    public Double getWif() {
        return wif;
    }

    @JsonProperty("wif")
    public void setWif(Double wif) {
        this.wif = wif;
    }

    @JsonProperty("wild")
    public Double getWild() {
        return wild;
    }

    @JsonProperty("wild")
    public void setWild(Double wild) {
        this.wild = wild;
    }

    @JsonProperty("wld")
    public Double getWld() {
        return wld;
    }

    @JsonProperty("wld")
    public void setWld(Double wld) {
        this.wld = wld;
    }

    @JsonProperty("wluna")
    public Double getWluna() {
        return wluna;
    }

    @JsonProperty("wluna")
    public void setWluna(Double wluna) {
        this.wluna = wluna;
    }

    @JsonProperty("woo")
    public Double getWoo() {
        return woo;
    }

    @JsonProperty("woo")
    public void setWoo(Double woo) {
        this.woo = woo;
    }

    @JsonProperty("wst")
    public Double getWst() {
        return wst;
    }

    @JsonProperty("wst")
    public void setWst(Double wst) {
        this.wst = wst;
    }

    @JsonProperty("wzrd")
    public Double getWzrd() {
        return wzrd;
    }

    @JsonProperty("wzrd")
    public void setWzrd(Double wzrd) {
        this.wzrd = wzrd;
    }

    @JsonProperty("xaf")
    public Double getXaf() {
        return xaf;
    }

    @JsonProperty("xaf")
    public void setXaf(Double xaf) {
        this.xaf = xaf;
    }

    @JsonProperty("xag")
    public Double getXag() {
        return xag;
    }

    @JsonProperty("xag")
    public void setXag(Double xag) {
        this.xag = xag;
    }

    @JsonProperty("xai")
    public Double getXai() {
        return xai;
    }

    @JsonProperty("xai")
    public void setXai(Double xai) {
        this.xai = xai;
    }

    @JsonProperty("xau")
    public Double getXau() {
        return xau;
    }

    @JsonProperty("xau")
    public void setXau(Double xau) {
        this.xau = xau;
    }

    @JsonProperty("xaut")
    public Double getXaut() {
        return xaut;
    }

    @JsonProperty("xaut")
    public void setXaut(Double xaut) {
        this.xaut = xaut;
    }

    @JsonProperty("xbt")
    public Double getXbt() {
        return xbt;
    }

    @JsonProperty("xbt")
    public void setXbt(Double xbt) {
        this.xbt = xbt;
    }

    @JsonProperty("xcd")
    public Double getXcd() {
        return xcd;
    }

    @JsonProperty("xcd")
    public void setXcd(Double xcd) {
        this.xcd = xcd;
    }

    @JsonProperty("xch")
    public Double getXch() {
        return xch;
    }

    @JsonProperty("xch")
    public void setXch(Double xch) {
        this.xch = xch;
    }

    @JsonProperty("xcn")
    public Double getXcn() {
        return xcn;
    }

    @JsonProperty("xcn")
    public void setXcn(Double xcn) {
        this.xcn = xcn;
    }

    @JsonProperty("xdc")
    public Double getXdc() {
        return xdc;
    }

    @JsonProperty("xdc")
    public void setXdc(Double xdc) {
        this.xdc = xdc;
    }

    @JsonProperty("xdr")
    public Double getXdr() {
        return xdr;
    }

    @JsonProperty("xdr")
    public void setXdr(Double xdr) {
        this.xdr = xdr;
    }

    @JsonProperty("xec")
    public Double getXec() {
        return xec;
    }

    @JsonProperty("xec")
    public void setXec(Double xec) {
        this.xec = xec;
    }

    @JsonProperty("xem")
    public Double getXem() {
        return xem;
    }

    @JsonProperty("xem")
    public void setXem(Double xem) {
        this.xem = xem;
    }

    @JsonProperty("xlm")
    public Double getXlm() {
        return xlm;
    }

    @JsonProperty("xlm")
    public void setXlm(Double xlm) {
        this.xlm = xlm;
    }

    @JsonProperty("xmon")
    public Double getXmon() {
        return xmon;
    }

    @JsonProperty("xmon")
    public void setXmon(Double xmon) {
        this.xmon = xmon;
    }

    @JsonProperty("xmr")
    public Double getXmr() {
        return xmr;
    }

    @JsonProperty("xmr")
    public void setXmr(Double xmr) {
        this.xmr = xmr;
    }

    @JsonProperty("xof")
    public Double getXof() {
        return xof;
    }

    @JsonProperty("xof")
    public void setXof(Double xof) {
        this.xof = xof;
    }

    @JsonProperty("xpd")
    public Double getXpd() {
        return xpd;
    }

    @JsonProperty("xpd")
    public void setXpd(Double xpd) {
        this.xpd = xpd;
    }

    @JsonProperty("xpf")
    public Double getXpf() {
        return xpf;
    }

    @JsonProperty("xpf")
    public void setXpf(Double xpf) {
        this.xpf = xpf;
    }

    @JsonProperty("xpt")
    public Double getXpt() {
        return xpt;
    }

    @JsonProperty("xpt")
    public void setXpt(Double xpt) {
        this.xpt = xpt;
    }

    @JsonProperty("xrd")
    public Double getXrd() {
        return xrd;
    }

    @JsonProperty("xrd")
    public void setXrd(Double xrd) {
        this.xrd = xrd;
    }

    @JsonProperty("xrp")
    public Double getXrp() {
        return xrp;
    }

    @JsonProperty("xrp")
    public void setXrp(Double xrp) {
        this.xrp = xrp;
    }

    @JsonProperty("xt")
    public Double getXt() {
        return xt;
    }

    @JsonProperty("xt")
    public void setXt(Double xt) {
        this.xt = xt;
    }

    @JsonProperty("xtz")
    public Double getXtz() {
        return xtz;
    }

    @JsonProperty("xtz")
    public void setXtz(Double xtz) {
        this.xtz = xtz;
    }

    @JsonProperty("xvs")
    public Double getXvs() {
        return xvs;
    }

    @JsonProperty("xvs")
    public void setXvs(Double xvs) {
        this.xvs = xvs;
    }

    @JsonProperty("xyo")
    public Double getXyo() {
        return xyo;
    }

    @JsonProperty("xyo")
    public void setXyo(Double xyo) {
        this.xyo = xyo;
    }

    @JsonProperty("yer")
    public Double getYer() {
        return yer;
    }

    @JsonProperty("yer")
    public void setYer(Double yer) {
        this.yer = yer;
    }

    @JsonProperty("yfi")
    public Double getYfi() {
        return yfi;
    }

    @JsonProperty("yfi")
    public void setYfi(Double yfi) {
        this.yfi = yfi;
    }

    @JsonProperty("yfii")
    public Double getYfii() {
        return yfii;
    }

    @JsonProperty("yfii")
    public void setYfii(Double yfii) {
        this.yfii = yfii;
    }

    @JsonProperty("ygg")
    public Double getYgg() {
        return ygg;
    }

    @JsonProperty("ygg")
    public void setYgg(Double ygg) {
        this.ygg = ygg;
    }

    @JsonProperty("zar")
    public Double getZar() {
        return zar;
    }

    @JsonProperty("zar")
    public void setZar(Double zar) {
        this.zar = zar;
    }

    @JsonProperty("zbc")
    public Double getZbc() {
        return zbc;
    }

    @JsonProperty("zbc")
    public void setZbc(Double zbc) {
        this.zbc = zbc;
    }

    @JsonProperty("zec")
    public Double getZec() {
        return zec;
    }

    @JsonProperty("zec")
    public void setZec(Double zec) {
        this.zec = zec;
    }

    @JsonProperty("zen")
    public Double getZen() {
        return zen;
    }

    @JsonProperty("zen")
    public void setZen(Double zen) {
        this.zen = zen;
    }

    @JsonProperty("zeta")
    public Double getZeta() {
        return zeta;
    }

    @JsonProperty("zeta")
    public void setZeta(Double zeta) {
        this.zeta = zeta;
    }

    @JsonProperty("zil")
    public Double getZil() {
        return zil;
    }

    @JsonProperty("zil")
    public void setZil(Double zil) {
        this.zil = zil;
    }

    @JsonProperty("zk")
    public Double getZk() {
        return zk;
    }

    @JsonProperty("zk")
    public void setZk(Double zk) {
        this.zk = zk;
    }

    @JsonProperty("zmk")
    public Double getZmk() {
        return zmk;
    }

    @JsonProperty("zmk")
    public void setZmk(Double zmk) {
        this.zmk = zmk;
    }

    @JsonProperty("zmw")
    public Double getZmw() {
        return zmw;
    }

    @JsonProperty("zmw")
    public void setZmw(Double zmw) {
        this.zmw = zmw;
    }

    @JsonProperty("zro")
    public Double getZro() {
        return zro;
    }

    @JsonProperty("zro")
    public void setZro(Double zro) {
        this.zro = zro;
    }

    @JsonProperty("zrx")
    public Double getZrx() {
        return zrx;
    }

    @JsonProperty("zrx")
    public void setZrx(Double zrx) {
        this.zrx = zrx;
    }

    @JsonProperty("zwd")
    public Double getZwd() {
        return zwd;
    }

    @JsonProperty("zwd")
    public void setZwd(Double zwd) {
        this.zwd = zwd;
    }

    @JsonProperty("zwg")
    public Double getZwg() {
        return zwg;
    }

    @JsonProperty("zwg")
    public void setZwg(Double zwg) {
        this.zwg = zwg;
    }

    @JsonProperty("zwl")
    public Double getZwl() {
        return zwl;
    }

    @JsonProperty("zwl")
    public void setZwl(Double zwl) {
        this.zwl = zwl;
    }

    @JsonProperty("zypto")
    public Double getZypto() {
        return zypto;
    }

    @JsonProperty("zypto")
    public void setZypto(Double zypto) {
        this.zypto = zypto;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
