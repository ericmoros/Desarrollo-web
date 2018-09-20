using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace ConsoleApp1
{
    /// <summary>
    ///     Un menú con capacidad de almacenar métodos con una
    ///     identificación y una descripción para después visualizarlos
    ///     y seleccionarlos con el fin de ejecutarlos en una consola.
    /// </summary>
    class EConsoleMenu
    {
        private string _title = "";
        private string _stringAskOption = "Introduce una o varias opciones(123|1,2,3): ";
        private string _stringMenu = "";
        private string _stringHead = "";
        private string _stringBody = "";
        private string _stringSeparator = "";
        private int _hSMLength = 0;
        private List<Option> _options = new List<Option>();
        private List<Option> _optionsMenu = new List<Option>();
        private List<Option> _optionsBuffer = new List<Option>();
        private bool _useAutoStringMenu = true;
        private bool _useAutoHSLength = true;
        private bool _useAutoPrintStringMenu = true;
        private bool _useAutoPrintStringAskOption = true;
        private bool _useAutoPrintStringVerboseOption = true;
        private bool _exit = false;

        //Getters and Setters
        public string Title
        {
            get => _title;
            set => _title = value;
        }
        public string StringMenu
        {
            get
            {
                if (UseAutoStringMenu) return string.Format("{2}{0}{2}{1}{2}", StringHead, StringBody, StringSeparator);
                else return _stringMenu;
            }
            set => _stringMenu = value;
        }
        public string StringHead
        {
            get => _stringHead;
            set => _stringHead = value;
        }
        public string StringBody
        {
            get => _stringBody;
            set => _stringBody = value;
        }
        public string StringSeparator
        {
            get => _stringSeparator;
            set => _stringSeparator = value;
        }
        public string StringAskOption
        {
            get => _stringAskOption;
            set => _stringAskOption = value;
        }
        public int HSMLength
        {
            get
            {
                if (UseAutoHSLength)
                {
                    CheckHSMLength();
                    return _hSMLength;
                }
                else return _hSMLength;
            }
            set => _hSMLength = value;
        }
        public List<Option> Options
        {
            get => _options;
            set => _options = value;
        }
        public List<Option> OptionsBuffer
        {
            get => _optionsBuffer;
            set => _optionsBuffer = value;
        }
        public bool UseAutoStringMenu
        {
            get => _useAutoStringMenu;
            set => _useAutoStringMenu = value;
        }
        public bool UseAutoHSLength
        {
            get => _useAutoHSLength;
            set => _useAutoHSLength = value;
        }
        public bool UseAutoPrintStringMenu
        {
            get => _useAutoPrintStringMenu;
            set => _useAutoPrintStringMenu = value;
        }
        public bool UseAutoPrintAskOption
        {
            get => _useAutoPrintStringAskOption;
            set => _useAutoPrintStringAskOption = value;
        }
        public bool UseAutoPrintStringVerboseOption
        {
            get => _useAutoPrintStringVerboseOption;
            set => _useAutoPrintStringVerboseOption = value;
        }
        
        //Adders
        public void AddOption(string Id_Option, string OptionName, Action Function, bool verbose = true)
        {
            Option opt = new Option(Id_Option, OptionName, Function, verbose);
            Options.Add(opt);
        }
        public void AddOptionBuffer(string Id_Option)
        {
            Option[] options =  _options.Where(opt => opt.Id_Option.Equals(Id_Option)).ToArray();
            foreach (Option option in options) OptionsBuffer.Add(option);
        }

        //Checkers
        public void CheckHSMLength(string horizontalLimiter = "\n")
        {
            int aux = 0;
            List<Char> chrs = StringMenu.ToList();
            for (int i = 0; i < chrs.Count; i++)
            {
                if (chrs[i].ToString().Equals(horizontalLimiter))
                {
                    _hSMLength = Math.Max(i - aux, _hSMLength);
                    aux = i;
                }
            }
        }

        //Generaters
        public void GenerateStringBody(string format = " {0} - {1}\n")
        {
            string strBody = "";
            string strOpt = "";
            string id_option;
            string optionName;

            foreach (Option opt in Options)
            {
                id_option = opt.Id_Option;
                optionName = opt.OptionName;
                strOpt = string.Format(format, id_option, optionName);
                strBody += strOpt;
            }

            _stringBody = strBody;
        }
        public void GenerateStringHead()
        {
            GenerateStringHead(" {0," + (HSMLength + _title.Length) / 2 + "}\n");
        }
        public void GenerateStringHead(string format)
        {
            _stringHead = string.Format(format, _title);
        }
        public void GenerateStringSeparator()
        {
            GenerateStringSeparator("-");
        }

        public void GenerateStringSeparator(string enbellisher)
        {
            string resizedSeparator = enbellisher;
            for (int i = 0; i < HSMLength - 1; i++) resizedSeparator += enbellisher;
            resizedSeparator += "\n";
            _stringSeparator = resizedSeparator;
        }

        //Executables
        public void ExeOption(Option opt)
        {
            if (opt.Verbose && _useAutoPrintStringVerboseOption) Console.WriteLine("[{0}]", opt.OptionName);
            opt.Function.Invoke();
        }
        public void ExeOptionBuffer()
        {
            foreach (Option opt in new List<Option>(_optionsBuffer))
            {
                ExeOption(opt);
                _optionsBuffer.Remove(opt);
                if (_exit) break;
            }
        }
        public void Exit()
        {
            _exit = true;
        }
        public void ExeReadOption()
        {
            string strOptions;
            Option[] opts;
            string[] sopts;
            Regex rgx = new Regex(@"\,");

            strOptions = Console.ReadLine();
            sopts = rgx.Split(strOptions);
            if (sopts[0].Equals(strOptions)) sopts = strOptions.ToCharArray().Select(chrOpt => chrOpt.ToString()).ToArray();

            foreach (string sopt in sopts)
            {
                opts = Options.Where(opt => opt.Id_Option.Equals(sopt)).ToArray();
                foreach (Option opt in opts)
                {
                    OptionsBuffer.Add(opt);
                }
            }
        }
        public void ExeEConsoleMenu()
        {
            _optionsMenu.Add(new Option("ECM1", "Mostrar Menú", () => Console.WriteLine(StringMenu), false));
            _optionsMenu.Add(new Option("ECM2", "Pedir Opción", () => Console.Write(StringAskOption), false));

            if (_useAutoStringMenu)
            {
                GenerateStringBody();
                GenerateStringHead();
                GenerateStringSeparator();
            }

            while (true)
            {
                if (_useAutoPrintStringMenu) OptionsBuffer.Add(_optionsMenu[0]);
                if (_useAutoPrintStringAskOption) OptionsBuffer.Add(_optionsMenu[1]);
                ExeOptionBuffer();
                if (_exit) break;
                ExeReadOption();
            }
        }
                
        //Classes
        public class Option
        {
            public string Id_Option { get; set; }
            public string OptionName { get; set; }
            public Action Function { get; set; }
            public bool Verbose { get; set; }

            public Option(string Id_Option, string OptionName, Action Function, bool Verbose = true)
            {
                this.Id_Option = Id_Option;
                this.OptionName = OptionName;
                this.Function = Function;
                this.Verbose = Verbose;
            }
        }
    }
}
