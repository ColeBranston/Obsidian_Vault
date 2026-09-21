library ieee;
use ieee.std_logic_1164.all;
use ieee.numeric_std.all;

entity hex_seg_driver is
	port
	(
		-- Input ports
		A, B, C, D : in std_logic; --ABCD, where A is MSB

		-- Output ports
		Hex0 : out std_logic; --Hex0 is MSB
		Hex1 : out std_logic;
		Hex2 : out std_logic;
		Hex3 : out std_logic;
		Hex4 : out std_logic;
		Hex5 : out std_logic;
		Hex6 : out std_logic --Hex6 is LSB
	);
end entity hex_seg_driver;


architecture arch of hex_seg_driver is

	signal catHex : std_logic_vector(6 downto 0); 
	signal sel : std_logic_vector(3 downto 0); 
begin
	sel <= A&B&C&D;
	Hex0 <= catHex(6);
	Hex1 <= catHex(5);
	Hex2 <= catHex(4);
	Hex3 <= catHex(3);
	Hex4 <= catHex(2);
	Hex5 <= catHex(1);
	Hex6 <= catHex(0);
	with sel select
	catHex		 <=	"0000001" when x"0",
							"1001111" when x"1",
							"0010010" when x"2",
							"0000110" when x"3",
							"1001100" when x"4",
							"0100100" when x"5",
							"0100000" when x"6",
							"0001111" when x"7",
							"0000000" when x"8",
							"0000100" when x"9",
							"0001000" when x"A",
							"1100000" when x"B",
							"0110001" when x"C",
							"1000010" when x"D",
							"0110000" when x"E",
							"0111000" when x"F";
end arch;
