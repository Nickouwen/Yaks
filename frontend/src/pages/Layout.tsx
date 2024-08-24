import { Outlet } from "react-router-dom";
import {
  Settings,
  ArrowLeftFromLine,
  BookUser,
  Move,
  LayoutGrid,
} from "lucide-react";
import {
  Tooltip,
  TooltipContent,
  TooltipProvider,
  TooltipTrigger,
} from "@/components/ui/tooltip";
import { ModeToggle } from "@/components/mode-toggle";
import { Button } from "@/components/ui/button";

const Layout = () => {
  return (
    <div className="flex h-screen">
      <nav className="min-w-[50px] text-center p-4">
        <ul className="space-y-10">
          <li>
            <TooltipProvider>
              <Tooltip>
                <TooltipTrigger>
                  <ModeToggle />
                </TooltipTrigger>
                <TooltipContent side="right">
                  <p>Toggle Light / Dark Mode</p>
                </TooltipContent>
              </Tooltip>
            </TooltipProvider>
          </li>
          <li>
            <TooltipProvider>
              <Tooltip>
                <TooltipTrigger>
                  <Button variant="ghost" size="icon">
                    <LayoutGrid />
                  </Button>
                </TooltipTrigger>
                <TooltipContent side="right">
                  <p>Home</p>
                </TooltipContent>
              </Tooltip>
            </TooltipProvider>
          </li>
          <li>
            <TooltipProvider>
              <Tooltip>
                <TooltipTrigger>
                  <Button variant="ghost" size="icon">
                    <Move />
                  </Button>
                </TooltipTrigger>
                <TooltipContent side="right">
                  <p>Tables</p>
                </TooltipContent>
              </Tooltip>
            </TooltipProvider>
          </li>
          <li>
            <TooltipProvider>
              <Tooltip>
                <TooltipTrigger>
                  <Button variant="ghost" size="icon">
                    <BookUser />
                  </Button>
                </TooltipTrigger>
                <TooltipContent side="right">
                  <p>People</p>
                </TooltipContent>
              </Tooltip>
            </TooltipProvider>
          </li>
          <li className="absolute bottom-20">
            <TooltipProvider>
              <Tooltip>
                <TooltipTrigger>
                  <Button variant="ghost" size="icon">
                    <Settings />
                  </Button>
                </TooltipTrigger>
                <TooltipContent side="right">
                  <p>Settings</p>
                </TooltipContent>
              </Tooltip>
            </TooltipProvider>
          </li>
          <li className="absolute bottom-4">
            <TooltipProvider>
              <Tooltip>
                <TooltipTrigger>
                  <Button variant="ghost" size="icon">
                    <ArrowLeftFromLine />
                  </Button>
                </TooltipTrigger>
                <TooltipContent side="right">
                  <p>Logout</p>
                </TooltipContent>
              </Tooltip>
            </TooltipProvider>
          </li>
        </ul>
      </nav>
      <div className="flex-1">
        <Outlet />
      </div>
    </div>
  );
};

export default Layout;
