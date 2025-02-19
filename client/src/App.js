import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Wardrobe from "./pages/Wardrobe";
import Home from "./pages/Home";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/wardrobe" element={<Wardrobe />} />
      </Routes>
    </Router>
  );
}

export default App;
