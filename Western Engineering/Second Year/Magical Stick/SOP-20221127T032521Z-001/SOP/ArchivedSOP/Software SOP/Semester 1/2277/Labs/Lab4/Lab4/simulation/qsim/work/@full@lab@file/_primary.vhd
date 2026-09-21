library verilog;
use verilog.vl_types.all;
entity FullLabFile is
    port(
        H0              : out    vl_logic;
        SWITCH          : in     vl_logic;
        CLK_50MHz       : in     vl_logic;
        H1              : out    vl_logic;
        H2              : out    vl_logic;
        H3              : out    vl_logic;
        H5              : out    vl_logic;
        H6              : out    vl_logic;
        H4              : out    vl_logic
    );
end FullLabFile;
