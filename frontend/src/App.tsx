import { BrowserRouter, Routes, Route } from "react-router-dom";
import Layout from "./pages/Layout";
import Home from "./pages/Home";
import { ThemeProvider } from "./components/theme-provider";
import { useEffect, useState } from "react";
export default function App() {

  const [theme, setTheme] = useState(document.getElementsByTagName('html')[0].className)
  
  useEffect(() => {
    const checkTheme = document.getElementsByTagName('html')[0].className;
    setTheme(checkTheme)
    if(theme === 'dark') {
      document.documentElement.style.backgroundColor = 'black';
    }
  }, [theme]);

  return (
    <ThemeProvider defaultTheme="system" storageKey="vite-ui-theme">
      <div className="bg-white dark:bg-black dark:text-white min-h-screen">
        <BrowserRouter>
          <Routes>
            <Route path="/" element={<Layout />}>
                <Route index element={<Home />} />
            </Route>
          </Routes>
        </BrowserRouter>
      </div>
    </ThemeProvider>
  );
}