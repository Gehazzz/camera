package com.example.camera.util;

import java.util.Arrays;
import java.util.List;

public final class Photos {
    private static final String AL_CAPONE =
            "                                    .dS$:::::.....\n" +
            "                                 .d$$$$$::::::::::::...\n" +
            "                               d$$$$$$$:::::::::::::::::::..\n" +
            "                              d$$$$$$$::::::::::::::::::::::::.\n" +
            "                             d$$$$$$::::::::::::::::::::::::::::.\n" +
            "                           .d$$$$$$:::::::::::::::::::::::::::::::.\n" +
            "                          .d$$$$$$::::::::::::::::::::::::::::::::::\n" +
            "                         .d$$$$$:::::::::::::::::::::::::::::::::::::.\n" +
            "                        .d$$$$$$$$$$::::::::::::::::::::::::::::::::::.\n" +
            "                       .d$$$$$$$$$$$$$$$$$$$$$$::::::::::::::::::::::::\n" +
            "                      .d$$$$$$$$$$$$$$$$$$$$$$$$$$$$:::::::::::::::::::.\n" +
            "                      d$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$::::::::::::\n" +
            "  .:::::::::.        .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$::::::::\n" +
            "  `:::::::::::::.    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$:::::\n" +
            "   `::::::::::::::::'::$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$:::\n" +
            "    :::::::::::::::::::::::.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$::\n" +
            "     ::$$$:$$$$$$$$$$$$$$$$$$$Ss.::::::::*4$$$$$$$$$$$$$$$$$$$$$$$$$$$$!\n" +
            "      $$$$$$$$$$$$$$$$$$$$$$$$$$$$$Ss:::::::::*4$$$$$$$$$$$$$$$$$$$$$$$!\n" +
            "       `q$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Ss:::::::::*4$$$$$$$$$$$$$$$$$$$\n" +
            "          `q$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Ss:::::::::*4$$$$$$$$$$$$$$\n" +
            "            `q$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Ss::::::::*44$$$$$$$$\n" +
            "               .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Ss::::::::*4$$$'\n" +
            "              :$$$$$$$$$$$$$$$$$$.    `$$$$$$$$$$$$$$$$$$$$$$Ss:::::::;\n" +
            "              `$$$$$$$$$$$$$$$$$$$$.   `:::$$:$!$$$$$$$$$$$$$$$$$$Ss::;\n" +
            "               $$$$$$$$$$$$$$$$$$$$$.    ::::$$$$$$$$$$$$$$$$$$$$$$$$$$Ss._\n" +
            "               `$$$$$$$$$$$  $$`$$$$$'      :$$$$$: \":$$$$$$$$$$$$$$$$$$$$$$Ss._\n" +
            "                $$$$$$$$$$$$$!   $$$$      ::$$$$$\" $$::\":::`$$$$$$$$$$$$$$$$$$$$s.\n" +
            "                $$$$$$  `qp'   .s$$$'        :\"\"$$  $:\":\"      `$$$$$$$$$$$$$$$$$$$$.\n" +
            "                $$$$$$       4$$$$$$         $$\"                $$$$$$$$$$$$$$$$$$$$$D\n" +
            "               .$$$$$$.       `$$$$'                            $$$$\n" +
            "               $$$$$$$$7      .$$$$                             `;'\n" +
            "               $$$$$$$$     .$$$$'\n" +
            "               $$$$$$$    .$$$$$$._                             ;\n" +
            "               $$$$$$$  A.$$$$$$$$Ss. 'cqp\n" +
            "               `$$$$$$ $$$$$$$$$!!                             ;\n" +
            "                $$$$$$ $$$$$$$$!~                             ;\n" +
            "                `$$$$$ $ $$$$$$$$$$  ~                       ;\n" +
            "                 `$$$$$$$$$$$$!!~ ~!$~~ ~~$!~               ;\n" +
            "                .s$$$$$$$$$$$$$$ ~ ~   ~     ~             ;\n" +
            "           _.sS$$$$$$$$$$$$$$$$$$$$$$$!~~     ::::      :.'$$$\n" +
            "       _.sS$$$$$$$$$$$$$$$$$!$!!         ~   ::: : :: .'  $$$$\n" +
            "   _.sS$$$$$$$$$$$$$$$$$$$$$$$$~~             :::::::.'   .$$$$$Ss._\n" +
            ".sS$$$$$$$$$$$$$$$$$$$$$$$$$$$$:\":\"\"       : ::::::.'     !$$$$$$$$$Ss._\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$:::\"\" \"\"\"\":::::.'      .$$$$$$$$$$$$$S$s.\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$:::.''         !$$$$$$$$$$$$$$$$$Ss._      dp\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.''            .$$$$$$$$$$$$$$$$$$$$$$Ss._\n" +
            "$$$$$$$$$$$$$$$$$$$$$        \"\"\"\"\"\"\"\"\"\"\";              .$$$$$$$$$$$$$$$$$$$$$$$$$$$$Ss._\n" +
            "$$$$$$$$$$$$$$$$$$$$$.       MMMMMMMMMMM;             .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s.\n" +
            "$$$$$$$$$$$$$$$$$$$$$$.      MMMMMMMMMMMM;            !$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$S.    MMMMMMMMM'   ;          .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$.   MMMMMMMM'     ;        .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$.  MMMMMMM'       ;      .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$. MMMMM'          ;    .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$MMMMMMM           ;  .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$MMMMMMMMz.       ; .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$MMMMMMMMMz      ;.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$MMMMMMMMMM.   ;.$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            "\n" +
            "---------------------------------AL CAPONE HAS BEEN CAUGHT--------------------------------\n";

    private static final String ALBERT_EINSTEIN = "                    .+~                :xx++::\n" +
            "                   :`. -          .!!X!~\"?!`~!~!. :-:.\n" +
            "                  <             .!!!H\":.~ ::+!~~!!!~ `%X.\n" +
            "                  '             ~~!M!!>!!X?!!!!!!!!!!...!~.\n" +
            "                              <!:!MM!~:XM!!!!!!.:!..~ !.  `<\n" +
            "                  <: `   :~ .:<~!!M!XXHM!!!X!XXHtMMHHHX!  ~ ~\n" +
            "                ~~~~<' ~!!!:!!!!!XM!!M!!!XHMMMRMSXXX!!!!!!:  <`\n" +
            "                  `<  <::!!!!!X!X?M!!M!!XMMMMXXMMMM??!!!!!?!:~<\n" +
            "               : '~~~<!!!XMMH!!XMXMXHHXXXXM!!!!MMMMSXXXX!!!!!!!~\n" +
            "            :    ::`~!!!MMMMXXXtMMMMMMMMMMMHX!!!!!!HMMMMMX!!!!!: ~\n" +
            "               '~:~!!!!!MMMMMMMMMMMMMMMMMMMMMMXXX!!!M??MMMM!!X!!i:\n" +
            "               <~<!!!!!XMMMMMMMMMMMM8M8MMMMM8MMMMMXX!!!!!!!!X!?t?!:\n" +
            "               ~:~~!!!!?MMMMMM@M@RMRRR$@@MMRMRMMMMMMXSX!!!XMMMX<?X!\n" +
            "             :XX <!!XHMMMM88MM88BR$M$$$$8@8RN88MMMMMMMMHXX?MMMMMX!!!\n" +
            "           .:X! <XMSM8M@@$$$$$$$$$$$$$$$$$$$B8R$8MMMMMMMMMMMMMMMMX!X\n" +
            "          :!?! !?XMMMMM8$$$$8$$$$$$$$$$$$$$BBR$$MMM@MMMMMMMMMMMMMM!!X\n" +
            "        ~<!!~ <!!XMMMB$$$$$$$$$$$$$$$$$$$$$$$$MMR$8MR$MMMMMMMMMMMMM!?!:\n" +
            "        :~~~ !:X!XMM8$$$$$$$$$$$$$$$$$$$$$$$RR$$MMMMR8NMMMMMMMMMMMMM<!`-\n" +
            "    ~:<!:~`~':!:HMM8N$$$$$$$$$$$$$$$$$$$$$$$$$8MRMM8R$MRMMMMMMMMRMMMX!\n" +
            "  !X!``~~   :~XM?SMM$B$$$$$$$$$$$$$$$$$$$$$$BR$$MMM$@R$M$MMMMMM$MMMMX?L\n" +
            " X~.      : `!!!MM#$RR$$$$$$$$$$$$$$$$$R$$$$$R$M$MMRRRM8MMMMMMM$$MMMM!?:\n" +
            " ! ~ <~  !! !!~`` :!!MR$$$$$$$$$$RMM!?!??RR?#R8$M$MMMRM$RMMMM8MM$MMM!M!:>\n" +
            ": ' >!~ '!!  !   .!XMM8$$$$$@$$$R888HMM!!XXHWX$8$RM$MR5$8MMMMR$$@MMM!!!< ~\n" +
            "!  ' !  ~!! :!:XXHXMMMR$$$$$$$$$$$$$$$$8$$$$8$$$MMR$M$$$MMMMMM$$$MMM!!!!\n" +
            " ~<!!!  !!! !!HMMMMMMMM$$$$$$$$$$$$$$$$$$$$$$$$$$MMM$M$$MM8MMMR$$MMXX!!!!/:`\n" +
            "  ~!!!  !!! !XMMMMMMMMMMR$$$$$$$$$$$$R$RRR$$$$$$$MMMM$RM$MM8MM$$$M8MMMX!!!!:\n" +
            "  !~ ~  !!~ XMMM%!!!XMMX?M$$$$$$$$B$MMSXXXH?MR$$8MMMM$$@$8$M$B$$$$B$MMMX!!!!\n" +
            "  ~!    !! 'XMM?~~!!!MMMX!M$$$$$$MRMMM?!%MMMH!R$MMMMMM$$$MM$8$$$$$$MR@M!!!!!\n" +
            "  <>    !!  !Mf x@#\"~!t?M~!$$$$$RMMM?Xb@!~`??MS$M@MMM@RMRMMM$$$$$$RMMMMM!!!!\n" +
            "  !    '!~ <!!:!?M   !@!M<XM$$R5M$8MMM$! -XXXMMRMBMMM$RMMM@$R$BR$MMMMX??!X!!\n" +
            "  !    '!  !!X!!!?::xH!HM:MM$RM8M$RHMMMX...XMMMMM$RMMRRMMMMMMM8MMMMMMMMX!!X!\n" +
            "  !     ~  !!?:::!!!MXMR~!MMMRMM8MMMMMS!!M?XXMMMMM$$M$M$RMMMM8$RMMMMMMMM%X!!\n" +
            "  ~     ~  !~~X!!XHMMM?~ XM$MMMMRMMMMMM@MMMMMMMMMM$8@MMMMMMMMRMMMMM?!MMM%HX!\n" +
            "           !!!!XSMMXXMM .MMMMMMMM$$$BB8MMM@MMMMMMMR$RMMMMMMMMMMMMMMMXX!?H!XX\n" +
            "           XHXMMMMMMMM!.XMMMMMMMMMR$$$8M$$$$$M@88MMMMMMMMMMMMMMM!XMMMXX!!!XM\n" +
            "      ~   <!MMMMMMMMRM:XMMMMMMMMMM8R$$$$$$$$$$$$$$$NMMMMMMMM?!MM!M8MXX!!/t!M\n" +
            "      '   ~HMMMMMMMMM~!MM8@8MMM!MM$$8$$$$$$$$$$$$$$8MMMMMMM!!XMMMM$8MR!MX!MM\n" +
            "          'MMMMMMMMMM'MM$$$$$MMXMXM$$$$$$$$$$$$$$$$RMMMMMMM!!MMM$$$$MMMMM<!M\n" +
            "          'MMMMMMMMM!'MM$$$$$RMMMMMM$$$$$$$$$$$$$$$MMM!MMMX!!MM$$$$$M$$M$M!M\n" +
            "           !MMMMMM$M! !MR$$$RMM8$8MXM8$$$$$$$$$$$$NMMM!MMM!!!?MRR$$RXM$$MR!M\n" +
            "           !M?XMM$$M.< !MMMMMMSUSRMXM$8R$$$$$$$$$$#$MM!MMM!X!t8$M$MMMHMRMMX$\n" +
            "    ,-,   '!!!MM$RMSMX:.?!XMHRR$RM88$$$8M$$$$$R$$$$8MM!MMXMH!M$$RMMMMRNMMX!$\n" +
            "   -'`    '!!!MMMMMMMMMM8$RMM8MBMRRMR8RMMM$$$$8$8$$$MMXMMMMM!MR$MM!M?MMMMMM$\n" +
            "          'XX!MMMMMMM@RMM$MM@$$BM$$$M8MMMMR$$$$@$$$$MM!MMMMXX$MRM!XH!!??XMMM\n" +
            "          `!!!M?MHMMM$RMMMR@$$$$MR@MMMM8MMMM$$$$$$$WMM!MMMM!M$RMM!!.MM!%M?~!\n" +
            "           !!!!!!MMMMBMM$$RRMMMR8MMMMMRMMMMM8$$$$$$$MM?MMMM!f#RM~    `~!!!~!\n" +
            "           ~!!HX!!~!?MM?MMM??MM?MMMMMMMMMRMMMM$$$$$MMM!MMMM!!\n" +
            "           '!!!MX!:`~~`~~!~~!!!!XM!!!?!?MMMM8$$$$$MMMMXMMM!!\n" +
            "            !!~M@MX.. <!!X!!!!XHMHX!!``!XMMMB$MM$$B$M!MMM!!\n" +
            "            !!!?MRMM!:!XHMHMMMMMMMM!  X!SMMX$$MM$$$RMXMMM~\n" +
            "             !M!MMMM>!XMMMMMMMMXMM!!:!MM$MMMBRM$$$$8MMMM~\n" +
            "             `?H!M$R>'MMMM?MMM!MM6!X!XM$$$MM$MM$$$$MX$f\n" +
            "              `MXM$8X MMMMMMM!!MM!!!!XM$$$MM$MM$$$RX@\"\n" +
            "               ~M?$MM !MMMMXM!!MM!!!XMMM$$$8$XM$$RM!`\n" +
            "                !XMMM !MMMMXX!XM!!!HMMMM$$$$RH$$M!~\n" +
            "                'M?MM `?MMXMM!XM!XMMMMM$$$$$RM$$#\n" +
            "                 `>MMk ~MMHM!XM!XMMM$$$$$$BRM$M\"\n" +
            "                  ~`?M. !M?MXM!X$$@M$$$$$$RMM#\n" +
            "                    `!M  !!MM!X8$$$RM$$$$MM#`\n" +
            "                      !% `~~~X8$$$$8M$$RR#`\n" +
            "                       !!x:xH$$$$$$$R$R*`\n" +
            "                        ~!?MMMMRRRM@M#`               \n" +
            "                         `~???MMM?M\"`\n" +
            "                             ``~~\n" +
            "\n" +
            "--------------------------------ALBERT EINSTEIN-----------------------------\n";

    public static final List<String> photos = Arrays.asList(AL_CAPONE,"","","",ALBERT_EINSTEIN,"","","","","");
}
